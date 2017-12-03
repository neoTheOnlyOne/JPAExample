//======================================================================================================================
/**
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: com.tsystems.rubin.server.transmodservices.querygenerator.DynamicQueryGeneratorHelper.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Aug 5, 2009
 * 
 * Copyright © 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 **/
//======================================================================================================================
//======================================================================================================================
//====== Package 
//======================================================================================================================
package com.tsystems.rubin.server.transmodservices.querygenerator;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.DynamicQueryConstants;
import com.tsystems.rubin.server.transmodservices.to.SearchTerminalTO;

/**
 * @author 182472
 */
public class DynamicQueryGeneratorHelper {
	private static org.apache.log4j.Logger logger = Logger
			.getLogger(DynamicQueryGeneratorHelper.class);

	public static StringBuffer createDynamicQueryForTerminal(
			SearchTerminalTO searchTerminalTO) throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry createDynamicQueryForTerminal - "
					+ "SearchTerminalTO =" + searchTerminalTO);
		}
		StringBuffer terminalQuery = null;
		List<StringBuffer> searchParamListA = null;
		List<StringBuffer> searchParamListB = null;
		try {
			if (searchTerminalTO.getTerminalA() != null
					|| searchTerminalTO.getEndA() != null) {
				searchParamListA = createSearchParameter(searchTerminalTO
						.getTerminalA(), searchTerminalTO.getEndA(),
						searchTerminalTO.getOptionA());
			}
			if (searchTerminalTO.getTerminalB() != null
					|| searchTerminalTO.getEndB() != null) {
				searchParamListB = createSearchParameter(searchTerminalTO
						.getTerminalB(), searchTerminalTO.getEndB(),
						searchTerminalTO.getOptionB());
			}
			terminalQuery = createFinalTerminalQuery(searchParamListA,
					searchParamListB);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RubinApplicationException(
					"Error occurred while creating dynamic query"
							+ e.getMessage());
		}

		return terminalQuery;

	}

	private static List<StringBuffer> createSearchParameter(String terminal,
			String end, String searchOption) throws RubinApplicationException {
		StringBuffer searchParam = new StringBuffer();
		StringBuffer endParam = new StringBuffer();
		List<StringBuffer> searchParamList = new ArrayList<StringBuffer>();
		String searchParameter = null;
		if (terminal != null) {
			if (Character.isLetter(terminal.charAt(0))) {
				searchParameter = getSearchParameterForDesignationSearch(searchOption);
				searchParam.append(searchParameter).append("\'").append(
						terminal.toUpperCase().concat("%")).append("\'");
				searchParamList.add(searchParam);
			} else if (Character.isDigit(terminal.charAt(0))
					&& !terminal.contains("/")
					&& !(DynamicQueryConstants.REGIONA.equals(searchOption) || DynamicQueryConstants.REGIONB
							.equals(searchOption))) {
				searchParameter = getSearchParameterForIDSearch(searchOption);
				searchParam.append(searchParameter).append("\'").append(
						terminal.concat("%")).append("\'");
				searchParamList.add(searchParam);
			} else if (Character.isDigit(terminal.charAt(0))
					&& terminal.contains("/")
					&& isVPSZSearch(terminal, searchOption)
					&& !(DynamicQueryConstants.REGIONA.equals(searchOption) || DynamicQueryConstants.REGIONB
							.equals(searchOption))) {
				int count = checkForVPSZ(terminal, searchOption);
				searchParamList = createSearchParameterForVPSZ(count, terminal,
						searchOption);

			} else {
				searchParameter = getSearchParameterForDesignationSearch(searchOption);
				searchParam.append(searchParameter).append("\'").append(
						terminal.toUpperCase().concat("%")).append("\'");
				searchParamList.add(searchParam);
			}
		}
		if ((DynamicQueryConstants.TERMINALA.equals(searchOption) || DynamicQueryConstants.TERMINALB
				.equals(searchOption))
				&& end != null) {
			endParam.append("referenceCode) like").append("\'").append(
					end.concat("%")).append("\'");
			searchParamList.add(endParam);
		}
		return searchParamList;
	}

	private static String getSearchParameterForDesignationSearch(
			String searchOption) throws RubinApplicationException {
		String searchParameter = null;
		if (DynamicQueryConstants.SITEA.equals(searchOption)
				|| DynamicQueryConstants.SITEB.equals(searchOption)
				|| DynamicQueryConstants.TERMINALA.equals(searchOption)
				|| DynamicQueryConstants.TERMINALB.equals(searchOption)) {
			searchParameter = "site.designationNationalSearch) like";
		} else if (DynamicQueryConstants.CITYA.equals(searchOption)
				|| DynamicQueryConstants.CITYB.equals(searchOption)) {
			searchParameter = "site.city.ortsnetzbezNatSu) like";
		} else if (DynamicQueryConstants.COUNTRYA.equals(searchOption)
				|| DynamicQueryConstants.COUNTRYB.equals(searchOption)) {
			searchParameter = "site.city.country.nationalDesignationSearch) like";
		} else if (DynamicQueryConstants.REGIONA.equals(searchOption)
				|| DynamicQueryConstants.REGIONB.equals(searchOption)) {
			searchParameter = "site.city.country.region.designationSearch) like";
		}
		return searchParameter;
	}

	private static String getSearchParameterForIDSearch(String searchOption)
			throws RubinApplicationException {
		String searchParameter = null;
		if (DynamicQueryConstants.SITEA.equals(searchOption)
				|| DynamicQueryConstants.SITEB.equals(searchOption)
				|| DynamicQueryConstants.TERMINALA.equals(searchOption)
				|| DynamicQueryConstants.TERMINALB.equals(searchOption)) {
			searchParameter = "site.siteId) like";
		} else if (DynamicQueryConstants.CITYA.equals(searchOption)
				|| DynamicQueryConstants.CITYB.equals(searchOption)) {
			searchParameter = "site.city.cityId) like";
		} else if (DynamicQueryConstants.COUNTRYA.equals(searchOption)
				|| DynamicQueryConstants.COUNTRYB.equals(searchOption)) {
			searchParameter = "site.city.country.countryId) like";
		}
		return searchParameter;
	}

	private static StringBuffer createFinalTerminalQuery(
			List<StringBuffer> searchParamListA,
			List<StringBuffer> searchParamListB)
			throws RubinApplicationException {
		StringBuffer terminalQuery = new StringBuffer();
		StringBuffer orCondition = new StringBuffer(" or");
		StringBuffer andCondition = new StringBuffer(" and");
		String terminalA = " trim(both from c.terminalA.";
		String terminalB = " trim(both from c.terminalB.";
		if (searchParamListA != null && searchParamListA.size() != 0
				&& searchParamListB != null && searchParamListB.size() != 0) {
			terminalQuery.append(" ((").append(
					createQuery(terminalA, searchParamListA)).append(
					andCondition);
			terminalQuery.append(createQuery(terminalB, searchParamListB))
					.append(")");
			terminalQuery.append(orCondition).append(" (").append(
					createQuery(terminalA, searchParamListB)).append(
					andCondition).append(
					createQuery(terminalB, searchParamListA)).append("))");

		} else if (searchParamListA == null || searchParamListA.size() == 0
				|| searchParamListB == null || searchParamListB.size() == 0) {
			if (searchParamListA == null || searchParamListA.size() == 0) {
				terminalQuery.append(" ((").append(
						createQuery(terminalA, searchParamListB)).append(
						orCondition).append(
						createQuery(terminalB, searchParamListB)).append("))");
			} else if (searchParamListB == null || searchParamListB.size() == 0) {
				terminalQuery.append(" ((").append(
						createQuery(terminalA, searchParamListA)).append(
						orCondition).append(
						createQuery(terminalB, searchParamListA)).append("))");
			}

		}
		return terminalQuery;
	}

	private static StringBuffer createQuery(String terminal,
			List<StringBuffer> searchParamList)
			throws RubinApplicationException {
		StringBuffer condition = new StringBuffer();

		switch (searchParamList.size()) {
		case 1:
			condition
					.append(terminal.concat(searchParamList.get(0).toString()));
			break;
		case 2:
			condition
					.append(terminal.concat(searchParamList.get(0).toString()))
					.append(" and").append(
							terminal.concat(searchParamList.get(1).toString()));
			break;
		case 3:
			condition
					.append(terminal.concat(searchParamList.get(0).toString()))
					.append(" and").append(
							terminal.concat(searchParamList.get(1).toString()))
					.append(" and").append(
							terminal.concat(searchParamList.get(2).toString()));
			break;
		case 4:
			condition
					.append(terminal.concat(searchParamList.get(0).toString()))
					.append(" and").append(
							terminal.concat(searchParamList.get(1).toString()))
					.append(" and").append(
							terminal.concat(searchParamList.get(2).toString()))
					.append(" and").append(
							terminal.concat(searchParamList.get(3).toString()));
			break;
		default:
			throw new RubinApplicationException(
					"Error while creating dynamic query");
		}
		return condition;

	}

	private static int checkForVPSZ(String terminal, String searchOption)
			throws RubinApplicationException {
		int count = 0;
		for (int i = 0; i < terminal.length(); i++) {
			if (terminal.charAt(i) == '/') {
				if (i < terminal.length() - 1) {
					count++;
				}
			}
		}
		System.out.println("The count is *************" + count);
		return count;
	}

	private static List<StringBuffer> createSearchParameterForVPSZ(int count,
			String terminal, String searchOption)
			throws RubinApplicationException {
		StringBuffer landVpszSearchParameter = new StringBuffer();
		StringBuffer cityVpszSearchParameter = new StringBuffer();
		StringBuffer siteVpszSearchParameter = new StringBuffer();
		List<StringBuffer> searchParamList = new ArrayList<StringBuffer>();
		String landVPSZ = null;
		String cityVPSZ = null;
		String siteVPSZ = null;
		if (DynamicQueryConstants.SITEA.equals(searchOption)
				|| DynamicQueryConstants.SITEB.equals(searchOption)
				|| DynamicQueryConstants.TERMINALA.equals(searchOption)
				|| DynamicQueryConstants.TERMINALB.equals(searchOption)) {
			if (count == 1) {
				landVPSZ = getLandVPSZ(terminal);
				cityVPSZ = getCityVPSZ(terminal);
				cityVpszSearchParameter.append("site.city.nkz) like" + "\'"
						+ cityVPSZ + "\'");
				landVpszSearchParameter.append("site.city.country.akz) like"
						+ "\'" + landVPSZ + "\'");
				searchParamList.add(cityVpszSearchParameter);
				searchParamList.add(landVpszSearchParameter);
			} else if (count == 2 || count >= 3) {
				landVPSZ = getLandVPSZ(terminal);
				cityVPSZ = getCityVPSZ(terminal);
				siteVPSZ = getSiteVPSZ(terminal);
				// TODO: ask what to do if the user enters a a text in whic h
				// there are no characters after the slash like 049/
				cityVpszSearchParameter.append("site.city.nkz) like" + "\'"
						+ cityVPSZ + "\'");
				landVpszSearchParameter.append("site.city.country.akz) like"
						+ "\'" + landVPSZ + "\'");
				siteVpszSearchParameter.append("site.vpz) like" + "\'"
						+ siteVPSZ + "\'");
				searchParamList.add(cityVpszSearchParameter);
				searchParamList.add(landVpszSearchParameter);
				searchParamList.add(siteVpszSearchParameter);
			}
		} else if (searchOption.equals(DynamicQueryConstants.CITYA)
				|| searchOption.equals(DynamicQueryConstants.CITYB)) {
			landVPSZ = getLandVPSZ(terminal);
			cityVPSZ = getCityVPSZ(terminal);
			cityVpszSearchParameter.append("site.city.nkz) like" + "\'"
					+ cityVPSZ + "\'");
			landVpszSearchParameter.append("site.city.country.akz) like" + "\'"
					+ landVPSZ + "\'");
			searchParamList.add(cityVpszSearchParameter);
			searchParamList.add(landVpszSearchParameter);
		} else if (searchOption.equals(DynamicQueryConstants.COUNTRYA)
				|| searchOption.equals(DynamicQueryConstants.COUNTRYB)) {
			landVPSZ = getLandVPSZ(terminal);
			landVpszSearchParameter.append("site.city.country.akz) like" + "\'"
					+ landVPSZ + "\'");
			searchParamList.add(landVpszSearchParameter);
		}
		System.out.println("THE VPSZ SEARCH PARAM ISSSSSSSSSSSSSSSSSSSSSSSSSS"
				+ landVPSZ + "   " + cityVPSZ + "    " + siteVPSZ);
		return searchParamList;

	}

	private static String getLandVPSZ(String terminal)
			throws RubinApplicationException {
		String landVPSZ = terminal.substring(0, terminal.indexOf('/'));
		return landVPSZ.concat("%");
	}

	private static String getCityVPSZ(String terminal)
			throws RubinApplicationException {
		StringBuffer cityVPSZBuffer = new StringBuffer();
		if (terminal.indexOf('/') != terminal.length() - 1) {
			String subTerminal = terminal.substring(terminal.indexOf('/') + 1);
			for (int i = 0; i < subTerminal.length(); i++) {
				if (subTerminal.charAt(i) != '/') {
					cityVPSZBuffer.append(subTerminal.charAt(i));
				} else {
					break;
				}
			}
		}
		return cityVPSZBuffer.toString().concat("%");
	}

	private static String getSiteVPSZ(String terminal)
			throws RubinApplicationException {
		StringBuffer siteVPSZBuffer = new StringBuffer();
		if (terminal.indexOf('/') != terminal.length() - 1) {
			String subTerminal = terminal.substring(terminal.indexOf('/') + 1);
			if (subTerminal.indexOf('/') != subTerminal.length() - 1) {
				String subSiteTerminal = subTerminal.substring(subTerminal
						.indexOf('/') + 1);
				for (int i = 0; i < subSiteTerminal.length(); i++) {
					if (subSiteTerminal.charAt(i) != '/') {
						siteVPSZBuffer.append(subSiteTerminal.charAt(i));
					} else {
						break;
					}
				}
			}
		}
		return siteVPSZBuffer.toString().concat("%");
	}

	public static boolean isVPSZSearch(String terminal, String searchOption)
			throws RubinApplicationException {
		boolean isVPSZSearch = false;
		if (DynamicQueryConstants.SITEA.equals(searchOption)
				|| DynamicQueryConstants.SITEB.equals(searchOption)
				|| DynamicQueryConstants.TERMINALA.equals(searchOption)
				|| DynamicQueryConstants.TERMINALB.equals(searchOption)) {
			isVPSZSearch = isVPSZSearchForSite(terminal);
		} else if (DynamicQueryConstants.CITYA.equals(searchOption)
				|| DynamicQueryConstants.CITYB.equals(searchOption)) {
			isVPSZSearch = isVPSZSearchForCity(terminal);
		} else if (DynamicQueryConstants.COUNTRYA.equals(searchOption)
				|| DynamicQueryConstants.COUNTRYB.equals(searchOption)) {
			isVPSZSearch = isVPSZSearchForCountry(terminal);
		}
		return isVPSZSearch;

	}

	private static boolean isVPSZSearchForSite(String terminal)
			throws RubinApplicationException {
		boolean isVPSZSearch = false;
		int count = 0;
		for (int i = 0; i < terminal.length(); i++) {
			if (terminal.charAt(i) == '/') {
				count++;
				if (count == 1) {
					if (i < terminal.length() - 1
							&& !Character.isWhitespace(terminal.charAt(i + 1))
							&& terminal.charAt(i + 1) != '/') {
						isVPSZSearch = true;
					} else {
						isVPSZSearch = false;
						break;
					}
				} else if (count == 2) {
					if (i < terminal.length() - 1) {
						if (!Character.isWhitespace(terminal.charAt(i + 1))
								&& terminal.charAt(i + 1) != '/') {
							isVPSZSearch = true;
						} else {
							isVPSZSearch = false;
							break;
						}
					} else {
						isVPSZSearch = true;
					}

				}
			}
		}
		return isVPSZSearch;
	}

	private static boolean isVPSZSearchForCity(String terminal)
			throws RubinApplicationException {
		boolean isVPSZSearch = false;
		int count = 0;
		for (int i = 0; i < terminal.length(); i++) {
			if (terminal.charAt(i) == '/') {
				count++;
				if (count == 1) {
					if (i < terminal.length() - 1
							&& !Character.isWhitespace(terminal.charAt(i + 1))
							&& terminal.charAt(i + 1) != '/') {
						isVPSZSearch = true;
					} else {
						isVPSZSearch = false;
						break;
					}
				} else if (count == 2) {
					isVPSZSearch = true;
				}
			}
		}
		return isVPSZSearch;
	}

	private static boolean isVPSZSearchForCountry(String terminal)
			throws RubinApplicationException {
		boolean isVPSZSearch = false;
		int count = 0;
		for (int i = 0; i < terminal.length(); i++) {
			if (terminal.charAt(i) == '/') {
				count++;
				if (count == 1) {
					isVPSZSearch = true;
				}
			}
		}
		return isVPSZSearch;
	}
}
