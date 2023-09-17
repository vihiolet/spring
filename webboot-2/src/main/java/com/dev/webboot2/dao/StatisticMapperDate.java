package com.dev.webboot2.dao;

import java.util.HashMap;
 
import com.dev.webboot2.dto.StatisticDto;
 
public interface  StatisticMapperDate {
    public HashMap<String, Object> selecDateLogin(String year, String month, String date);
 
}
