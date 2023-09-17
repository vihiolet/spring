package com.dev.webboot2.dao;

import java.util.HashMap;
 
import com.dev.webboot2.dto.StatisticDto;
 
public interface  StatisticMapperNotHoliday {
    public HashMap<String, Object> selectNotHolidayLogin(String yearmonth);
 
}
