package com.dev.webboot2.service;

import java.util.HashMap;
 
public interface StatisticService {
	
	//월별
    public HashMap<String,Object> yearloginNum (String year, String month);
    
}
