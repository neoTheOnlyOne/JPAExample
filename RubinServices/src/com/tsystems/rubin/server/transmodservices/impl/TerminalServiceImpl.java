package com.tsystems.rubin.server.transmodservices.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.tsystems.rubin.common.exception.RubinApplicationException;
import com.tsystems.rubin.common.util.CommonConstants;
import com.tsystems.rubin.common.util.DynamicQueryConstants;
import com.tsystems.rubin.common.util.NamedQueryConstants;
import com.tsystems.rubin.server.dal.DAOFactory;
import com.tsystems.rubin.server.dal.dvo.TerminalDVO;
import com.tsystems.rubin.server.transmodservices.TerminalService;
import com.tsystems.rubin.server.transmodservices.querygenerator.DynamicQueryGenerator;
import com.tsystems.rubin.server.transmodservices.querygenerator.DynamicQueryGeneratorHelper;
import com.tsystems.rubin.server.transmodservices.to.TerminalTO;

public class TerminalServiceImpl implements TerminalService {
	
	private static final String DESCRIPTION_VALUE = "Description";
	private static final String REFERENCECODE_VALUE = "ReferenceCode";
	private static final String REFERENCECODE = "REFERENCECODE";

	private static org.apache.log4j.Logger logger = Logger
	.getLogger(TerminalServiceImpl.class);
	
	/** The dao factory. */
	private DAOFactory daoFactory;

	public TerminalServiceImpl(DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	public List<TerminalTO> findTerminallistBySearchCriteria(String searchType,
			Map<String, Object> searchParams) throws RubinApplicationException {
        if (logger.isDebugEnabled()) {
            logger.debug("searchType=" + searchType + ", searchParams=" + searchParams);
        }
       System.out.println("search params 1 = "+searchParams.get(CommonConstants.TERMINAL_SEARCH_TYPE_1));
       System.out.println("search params 2 = "+searchParams.get(CommonConstants.TERMINAL_SEARCH_TYPE_2));
        System.out.println("searchtype = "+searchType);
        TreeMap<String, Object> searchParameterForQuery = new TreeMap<String, Object>();
        if(searchType.equals(CommonConstants.TERMINAL_SEARCH)){
        	String terminal = (String)searchParams.get(CommonConstants.TERMINAL_SEARCH_TYPE_1);
        	String referenceCode = (String)searchParams.get(CommonConstants.TERMINAL_SEARCH_TYPE_2);
        	if(terminal!=null && terminal.trim()!=null){
        		terminal = terminal.trim();
        	if(DynamicQueryGeneratorHelper.isVPSZSearch(terminal, DynamicQueryConstants.TERMINALA)){
        		String[]searchParameters = terminal.split("\\/");
        		int position=1;
        		for(int count = 0; count<searchParameters.length; count++){
        			//checking condition of position because a query in this context takes maximum 4 parameters.
        			if(searchParameters[count].trim().length()>0&&position!=4){
        				searchParameterForQuery.put(""+position, searchParameters[count].trim());
        				position++;
        			}
        			searchParameterForQuery.put(""+position, referenceCode);
        			if(searchParameterForQuery.size()==3){
        				searchType = NamedQueryConstants.TERMINAL_FINDBYAKZNKZREFERENCECODE;
        			}else if(searchParameterForQuery.size()==4){
        				searchType = NamedQueryConstants.TERMINAL_FINDBYAKZNKZVPZREFERENCECODE;
        			}
        		}
        		for(int i=1;i<=searchParameterForQuery.size();i++){
        			System.out.println(""+i+" "+searchParameterForQuery.get(""+i));
        		}
        	}else if(Character.isDigit(terminal.charAt(0))){
        		searchType = NamedQueryConstants.TERMINAL_FINDBYSITEIDREFERENCECODE;
        		searchParameterForQuery.put("1", terminal);
        		searchParameterForQuery.put("2", referenceCode);
        	}else{
        		searchType = NamedQueryConstants.TERMINAL_FINDBYSITEDESIGNATIONNATIONALSEARCHREFERENCECODE;
        		searchParameterForQuery.put("1", terminal.toUpperCase());
        		searchParameterForQuery.put("2", referenceCode);
        	}
        	}else{
        		searchType = NamedQueryConstants.TERMINAL_FINDBYREFERENCECODE;
        		searchParameterForQuery.put("1", referenceCode);
        	
        	}
        }else{
        	searchType = NamedQueryConstants.TERMINAL_FINDBYCUSTOMERNAME;
        	searchParameterForQuery.put("1", searchParams.get(CommonConstants.CUSTOMER_SEARCH_TYPE));
        }
        List<TerminalTO> terminalTOList = new ArrayList<TerminalTO>();
        List<TerminalDVO> terminalDVOList = daoFactory.getTerminalDAO().<TerminalDVO> findByProperty(searchType, searchParameterForQuery);
        System.out.println("Search param last "+searchParams.get(""+searchParams.size()));
        
        
        if(terminalDVOList.isEmpty()&& searchType.contains(REFERENCECODE_VALUE) &&searchParams.get(CommonConstants.TERMINAL_SEARCH_TYPE_2)!=null){
        	searchType = searchType.replace(new String(REFERENCECODE_VALUE) , new String(DESCRIPTION_VALUE));
        	System.out.println("search type in if "+searchType);
        	terminalDVOList = daoFactory.getTerminalDAO().<TerminalDVO> findByProperty(searchType, searchParameterForQuery);
        }
       
        if (logger.isDebugEnabled()) {
            logger.debug((terminalDVOList == null) ? "terminalDVOList=null" : "terminalDVOList.size="
                    + terminalDVOList.size());
        }
        System.out.println((terminalDVOList == null) ? "terminalDVOList=null" : "terminalDVOList.size="
            + terminalDVOList.size());
        
        for (TerminalDVO terminalDVO : terminalDVOList) {
            TerminalTO terminalTO = new TerminalTO(terminalDVO.getId(), terminalDVO.getReferenceCode(), terminalDVO.getDescription(), terminalDVO.getSiteDVO().getId(),
        			terminalDVO.getSiteDVO().getSiteId(), terminalDVO.getSiteDVO().getAbbreviationInternational(), terminalDVO.getCarrierDVO().getId(), terminalDVO.getCarrierDVO().getName());
            System.out.println(terminalDVO.getDescription()+" "+terminalDVO.getReferenceCode()+" "+terminalDVO.getId());
            terminalTOList.add(terminalTO);
        }

        return terminalTOList;
	}
}
