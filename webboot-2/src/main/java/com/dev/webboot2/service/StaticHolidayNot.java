package com.dev.webboot2.service;

import java.util.HashMap;

public interface StaticHolidayNot {
    
    //휴일 제외 로그인 수
    public HashMap<String,Object> holidayNotLoginNum(String yearmonth);

}
