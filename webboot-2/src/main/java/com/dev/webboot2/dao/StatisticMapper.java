package com.dev.webboot2.dao;

import java.util.HashMap;
 
import com.dev.webboot2.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
 
}
