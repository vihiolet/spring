package com.dev.webboot2.service;
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.dev.webboot2.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> yearloginNum (String year, String month) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearLogin(year, month);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("is_success", true);
            retVal.put("response_code", 200);
            retVal.put("message", "성공");
            
        }catch(Exception e) {
            retVal.put("loginCnt", -999);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
 
}
