package com.dev.webboot1.dao;

import java.util.HashMap;
 
import com.dev.webboot1.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
 
}
