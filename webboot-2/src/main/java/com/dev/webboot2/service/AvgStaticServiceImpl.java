package com.dev.webboot2.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.webboot2.dao.StatisticMapperAvg;

@Service
public class AvgStaticServiceImpl implements StaticAvg{
	
	@Autowired
    private StatisticMapperAvg uMapper;

	@Override
	public HashMap<String, Object> avgLoginNum() {
		// TODO Auto-generated method stub
		HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectAvgLogin();
            retVal.put("is_success", true);
            retVal.put("response_code", 200);
            retVal.put("message", "성공");
            
        }catch(Exception e) {
            retVal.put("avgLoginCnt", -999);
            retVal.put("is_success", false);
            retVal.put("response_code", 400);
            retVal.put("message", "실패");
        }
        
        return retVal;
	}

}
