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
public class settingNotHoliday {
	
	@Autowired
    private StaticHolidayNot serviceNotHoliday;    
    
    //휴일 제외 로그인 수
    @ResponseBody 
    @RequestMapping("/noholidayStatistic")
    public Map<String, Object> noHoliday(String yearmonth) throws Exception{ 
        
        return serviceNotHoliday.holidayNotLoginNum(yearmonth);
    }
   
 
}