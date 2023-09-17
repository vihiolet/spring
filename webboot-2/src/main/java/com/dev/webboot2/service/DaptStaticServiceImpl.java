package com.dev.webboot2.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.webboot2.dao.StatisticMapperDapt;

@Service
public class DaptStaticServiceImpl implements StaticDapt{
	
	@Autowired
    private StatisticMapperDapt uMapper;

	@Override
	public HashMap<String, Object> daptLoginNum(String dapt) {
		// TODO Auto-generated method stub
		HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectDaptLogin(dapt);
            retVal.put("dapt", dapt);
            retVal.put("is_success", true);
            retVal.put("response_code", 200);
            retVal.put("message", "성공");
            
        }catch(Exception e) {
        	System.out.println(e);
            retVal.put("daptLoginCnt", -999);
            retVal.put("dapt", dapt);
            retVal.put("is_success", false);
            retVal.put("response_code", 400);
            retVal.put("message", "실패");
        }
        
        return retVal;
	}

}
