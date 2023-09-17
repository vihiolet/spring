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
public class settingDate {
	
	@Autowired
    private StaticDate serviceDate;
 
    
    //일일 접속자 수
    @ResponseBody 
    @RequestMapping("/sqldateStatistic")
    public Map<String, Object> sqldate(String year, String month, String date) throws Exception{ 
        
        return serviceDate.dateLoginNum(year, month, date);
    }
         
}