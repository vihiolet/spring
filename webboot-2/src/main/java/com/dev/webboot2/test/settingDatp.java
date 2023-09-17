package com.dev.webboot2.test;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.dev.webboot2.service.*;

@Controller
public class settingDatp {
	
	@Autowired
    private StaticDapt serviceDapt;
    
    //부서별 접속자  
    @ResponseBody 
    @RequestMapping("/sqldaptStatistic")
    public Map<String, Object> sqlDapt(String dapt) throws Exception{ 
        
        return serviceDapt.daptLoginNum(dapt);
    }
 
}