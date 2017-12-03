package com.tsystems.rubin.server.transmodservices.querygenerator;

import static com.tsystems.rubin.common.util.DynamicQueryConstants.CAPACITY;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.CUSTOMER;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.CUSTOMER_NETWORK;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.CUSTOMER_TERMINAL;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.END_CUSTOMER;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.END_CUSTOMER_NETWORK;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.IDENTIFY_LETTER;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.LSC;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.LSC_EXTENSION;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.PRODUCT_LSC;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.PRODUCT_LSC_EXTENSION;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.PROPERTY;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.SERVICE_TYPE;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.SNO;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.STRUCT_INFO;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.STRUCT_INFO1;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.STRUCT_INFO_TYPE;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.STRUCT_INFO_TYPE1;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.SUBNET_LABEL;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.SUBNET_NAME;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.TERMINAL;
import static com.tsystems.rubin.common.util.DynamicQueryConstants.TYPE_OF_ORDER;

import java.sql.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.CommonConstants;
import com.tsystems.rubin.common.util.DynamicQueryConstants;
import com.tsystems.rubin.server.transmodservices.to.SearchTerminalTO;
import com.tsystems.rubin.server.transmodservices.to.TypeOfOrderTO;

public class DynamicQueryGenerator {
	private static org.apache.log4j.Logger logger = Logger
			.getLogger(DynamicQueryGenerator.class);

	public static Map<String, Object> createDynamicQueryForSearch(
			TreeMap<String, Object> searchParams, String tableName, Long userId)
			throws RubinApplicationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Call entry createDynamicQueryForSearch - "
					+ "TreeMap=" + searchParams + "table name=" + tableName
					+ "userID =" + userId);
		}
		int count = 1;
		boolean andNeeded = false;
		TreeMap<String, Object> returnValues = new TreeMap<String, Object>();
		try {
			TreeMap<Integer, Object> searchValues = new TreeMap<Integer, Object>();
			StringBuffer query = createSelectStatement(tableName);
			StringBuffer whereClause = new StringBuffer(" where");
			StringBuffer joinClause = new StringBuffer();
			Set set = searchParams.entrySet();
			Iterator iterator = set.iterator();
			String whereCondition = null;
			String orCondition = null;
			boolean isEndCustomerJoined = false;
			boolean isHat2Joined = false;
			boolean isStructInfoJoined = false;
			boolean isStructInfo1Joined = false;
			while (iterator.hasNext()) {
				Map.Entry mapEntry = (Map.Entry) iterator.next();
				if (SNO.equals(mapEntry.getKey())) {
					whereCondition = " c.sno =?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (LSC_EXTENSION.equals(mapEntry.getKey())) {
					whereCondition = " trim(both from c.lscExtension.lscExtensionId) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (LSC.equals(mapEntry.getKey())) {
					whereCondition = " trim(both from c.lsc.code) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (SUBNET_NAME.equals(mapEntry.getKey())) {
					whereCondition = " trim(both from c.subnetwork.name) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (SUBNET_LABEL.equals(mapEntry.getKey())) {
					whereCondition = " trim(both from c.subnetwork.label) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (STRUCT_INFO_TYPE.equals(mapEntry.getKey())) {
					if (!isStructInfoJoined) {
						joinClause.append(" JOIN c.structuredInformations ts");
						isStructInfoJoined = true;
					}
					if (CommonConstants.ANY_TYPE_ID == ((Long) mapEntry
							.getValue()).longValue()) {
						whereCondition = " trim(both from ts.structuredInformationType.designation) like?";
						andNeeded = createWhereClause(whereCondition,
								andNeeded, whereClause, count, searchValues,
								"%");
					} else {
						whereCondition = " ts.structuredInformationType.id =?";
						andNeeded = createWhereClause(whereCondition,
								andNeeded, whereClause, count, searchValues,
								mapEntry.getValue());
					}
					count++;
				}
				if (STRUCT_INFO.equals(mapEntry.getKey())) {
					if (!isStructInfoJoined) {
						joinClause.append(" JOIN c.structuredInformations ts");
						isStructInfoJoined = true;
					}
					whereCondition = " trim(both from ts.designation) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (STRUCT_INFO_TYPE1.equals(mapEntry.getKey())) {
					if (!isStructInfo1Joined) {
						joinClause.append(" JOIN c.structuredInformations ts1");
						isStructInfo1Joined = true;
					}
					if (CommonConstants.ANY_TYPE_ID == ((Long) mapEntry
							.getValue()).longValue()) {
						whereCondition = " trim(both from ts1.structuredInformationType.designation) like?";
						andNeeded = createWhereClause(whereCondition,
								andNeeded, whereClause, count, searchValues,
								"%");
					} else {
						whereCondition = " ts1.structuredInformationType.id =?";
						andNeeded = createWhereClause(whereCondition,
								andNeeded, whereClause, count, searchValues,
								mapEntry.getValue());
					}
					count++;
				}
				if (STRUCT_INFO1.equals(mapEntry.getKey())) {
					if (!isStructInfo1Joined) {
						joinClause.append(" JOIN c.structuredInformations ts1");
						isStructInfo1Joined = true;
					}
					whereCondition = " trim(both from ts1.designation) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (CUSTOMER.equals(mapEntry.getKey())) {
					joinClause.append(" JOIN c.carrier ca LEFT JOIN ca.carrierCodes cc");
					whereCondition = " (trim(both from c.carrier.nameSearch) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue().toString().toUpperCase());
					orCondition = " or trim(both from c.carrier.code) like?";
					count++;
					createOrClause(orCondition, whereClause, count,
							searchValues, mapEntry.getValue().toString().toUpperCase());
					orCondition = " or trim(both from cc.code) like?";
					count++;
					createOrClause(orCondition, whereClause, count,
							searchValues, mapEntry.getValue().toString().toUpperCase());
					whereClause.append(")");
					count++;
				}
				if (CUSTOMER_NETWORK.equals(mapEntry.getKey())) {
					whereCondition = " trim(both from c.network.nameSearch) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue().toString().toUpperCase());
					count++;
				}
				if (END_CUSTOMER.equals(mapEntry.getKey())) {
					if (!isEndCustomerJoined) {
						joinClause.append(" JOIN c.endCustomers ec");
						isEndCustomerJoined = true;
					}
					whereCondition = " trim(both from ec.nameSearch) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue().toString().toUpperCase());
					count++;
				}
				if (END_CUSTOMER_NETWORK.equals(mapEntry.getKey())) {
					if (!isEndCustomerJoined) {
						joinClause.append(" JOIN c.endCustomers ec");
						isEndCustomerJoined = true;
					}
					whereCondition = " trim(both from ec.network) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (CAPACITY.equals(mapEntry.getKey())) {
					whereCondition = " trim(both from c.lsc.nominalCapacity) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (SERVICE_TYPE.equals(mapEntry.getKey())) {
					whereCondition = " c.service.id =?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (IDENTIFY_LETTER.equals(mapEntry.getKey())) {
					whereCondition = " c.identifyLetter.id =?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (PROPERTY.equals(mapEntry.getKey())) {
					joinClause.append(" JOIN c.properties p");
					whereCondition = " p.id =?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (PRODUCT_LSC_EXTENSION.equals(mapEntry.getKey())) {
					whereCondition = " trim(both from c.lscExtension.description) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (PRODUCT_LSC.equals(mapEntry.getKey())) {
					whereCondition = " trim(both from c.lsc.descriptionNat) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue());
					count++;
				}
				if (CUSTOMER_TERMINAL.equals(mapEntry.getKey())) {
					if (!isHat2Joined) {
						joinClause
								.append(" JOIN c.terminals t JOIN t.customerTerminals ct");
						isHat2Joined = true;
					} else {
						joinClause.append(" JOIN t.customerTerminals ct");
					}
					whereCondition = " trim(both from ct.nameSearch) like?";
					andNeeded = createWhereClause(whereCondition, andNeeded,
							whereClause, count, searchValues, mapEntry
									.getValue().toString().toUpperCase());
					count++;
				}
				if (TYPE_OF_ORDER.equals(mapEntry.getKey())) {
					joinClause.append(" JOIN c.routings r");
					TypeOfOrderTO typeOfOrder = (TypeOfOrderTO) mapEntry
							.getValue();
					if (andNeeded) {
						whereClause.append(" and");
					}
					createWhereConditionForTypeOfOrder(typeOfOrder, whereClause);
					andNeeded = true;
					count++;
				}
				if (TERMINAL.equals(mapEntry.getKey())) {
					SearchTerminalTO searchTerminalTO = (SearchTerminalTO) mapEntry
							.getValue();
					if (andNeeded) {
						whereClause.append(" and");
					}
					whereClause.append(DynamicQueryGeneratorHelper
							.createDynamicQueryForTerminal(searchTerminalTO));
					andNeeded = true;
					count++;
				}
			}
			createJoin(query, joinClause);
			createConditionForTransPermission(whereClause, userId);
			query.append(whereClause);
			query.append(" order by c.sno");
			returnValues.put("Query", query.toString());
			returnValues.put("SearchValues", searchValues);

		} catch (Exception e) {
			throw new RubinApplicationException(
					"Error occurred while creating dynamic query"
							+ e.getMessage());
		}
		return returnValues;
	}

	private static boolean createWhereClause(String whereCondition,
			boolean andNeeded, StringBuffer whereClause, int count,
			TreeMap<Integer, Object> searchValues, Object value) {
		String searchParameter = null;
		if (andNeeded) {
			whereClause.append(" and");
		}
		andNeeded = true;
		whereClause.append(whereCondition);
		whereClause.append(new Integer(count).toString());
		if (value instanceof String) {
			searchParameter = ((String) value).concat("%");
			searchValues.put(count, searchParameter);
		} else {
			searchValues.put(count, value);
		}

		return andNeeded;

	}

	private static void createJoin(StringBuffer query, StringBuffer joinClause) {
		query.append(joinClause);
	}

	private static StringBuffer createSelectStatement(String tableName) {
		StringBuffer query = new StringBuffer("Select distinct c from ");
		query.append(tableName);
		query.append(" c JOIN c.company co JOIN co.transPermissions tp");
		return query;

	}

	private static void createConditionForTransPermission(
			StringBuffer whereClause, Long userId) {
		StringBuffer whereCondition = new StringBuffer(
				" and tp.disSecurity = 'Y' and tp.user.id =" + "\'" + userId
						+ "\'");
		whereClause.append(whereCondition);

	}

	private static void createOrClause(String orCondition,
			StringBuffer whereClause, int count,
			TreeMap<Integer, Object> searchValues,
			Object value) {
		String searchParameter = null;
		whereClause.append(orCondition);
		whereClause.append(new Integer(count).toString());
		if (value instanceof String) {
			searchParameter = ((String) value).concat("%");
			searchValues.put(count, searchParameter);
		} else {
			searchValues.put(count, value);
		}
	}

	private static void createWhereConditionForTypeOfOrder(
			TypeOfOrderTO typeOfOrder, StringBuffer whereClause)
			throws RubinApplicationException {
		String columnName = null;
		String orderRelated = null;
		String dateRelated = null;
		Date carriedOutFrom = null;
		Date carriedOutTo = null;
		String whereCondition = null;
		if (DynamicQueryConstants.ORDER_RELATED_DISCONNECT.equals(typeOfOrder
				.getOrderRelated())) {
			columnName = "typeOfRoutingEnd";
			orderRelated = "Z";
		} else if (DynamicQueryConstants.ORDER_RELATED_NEW.equals(typeOfOrder
				.getOrderRelated())) {
			columnName = "typeOfRoutingBegin";
			orderRelated = "N";
		} else if (DynamicQueryConstants.ORDER_RELATED_RESTORATION
				.equals(typeOfOrder.getOrderRelated())) {
			columnName = "typeOfRoutingBegin";
			orderRelated = "R";
		} else if (DynamicQueryConstants.ORDER_RELATED_CHANGE
				.equals(typeOfOrder.getOrderRelated())) {
			columnName = "typeOfRoutingBegin";
			orderRelated = "C";
		} else {
			columnName = "typeOfRoutingBegin";
			orderRelated = "%";
		}

		if (DynamicQueryConstants.DATE_RELATED_EFFECTIVE.equals(typeOfOrder
				.getDateRelated())) {
			dateRelated = "I";
		} else if (DynamicQueryConstants.DATE_RELATED_PLANNED
				.equals(typeOfOrder.getDateRelated())) {
			dateRelated = "S";
		} else {
			dateRelated = "%";
		}

		if (typeOfOrder.getCarriedOutFrom() != null) {
			carriedOutFrom = new Date(typeOfOrder.getCarriedOutFrom().getTime());
		}

		if (typeOfOrder.getCarriedOutTo() != null) {
			carriedOutTo = new Date(typeOfOrder.getCarriedOutTo().getTime());
		}

		whereCondition = " trim(both from r." + columnName + ") like" + "\'"
				+ orderRelated + "\'";
		whereClause.append(whereCondition);
		whereCondition = " and trim(both from r.activeStatus) like" + "\'" + dateRelated
				+ "\'";
		whereClause.append(whereCondition);
		if (carriedOutFrom != null) {
			whereCondition = " and r.start >=" + "\'" + carriedOutFrom + "\'";
			whereClause.append(whereCondition);
		}
		if (carriedOutTo != null) {
			whereCondition = " and r.start <=" + "\'" + carriedOutTo + "\'";
			whereClause.append(whereCondition);
		}

	}

}
