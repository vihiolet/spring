package com.dev.webboot2.test;
 
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.dev.webboot2.service.*;

@Controller
public class settingAvg {
	
	@Autowired
    private StaticAvg serviceAvg;
    
    //평균 하루 로그인 
    @ResponseBody 
    @RequestMapping("/sqlavgStatistic")
    public Map<String, Object> sqlAvg() throws Exception{ 
        
        return serviceAvg.avgLoginNum();
    }    
     
}