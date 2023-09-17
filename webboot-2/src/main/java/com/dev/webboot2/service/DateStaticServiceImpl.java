package com.dev.webboot2.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.webboot2.dao.StatisticMapperDate;

@Service
public class DateStaticServiceImpl implements StaticDate{
	
	@Autowired
    private StatisticMapperDate uMapper;

	@Override
	public HashMap<String, Object> dateLoginNum(String year, String month, String date) {
		// TODO Auto-generated method stub
				HashMap<String, Object> retVal = new HashMap<String,Object>();
		        
		        try {
		            retVal = uMapper.selecDateLogin(year, month, date);
		            retVal.put("year", year);
		            retVal.put("month", month);
		            retVal.put("date", date);
		            retVal.put("is_success", true);
		            retVal.put("response_code", 200);
		            retVal.put("message", "성공");
		            
		        }catch(Exception e) {
		            retVal.put("dateLoginCnt", -999);
		            retVal.put("year", year);
		            retVal.put("month", month);
		            retVal.put("date", date);
		            retVal.put("is_success", false);
		            retVal.put("response_code", 400);
		            retVal.put("message", "실패");
		        }
		        
		        return retVal;
	}

}
