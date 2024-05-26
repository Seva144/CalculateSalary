package com.example.demo2.util;

import java.util.HashMap;
import java.util.Map;

public class MonthList {


    private static final Map<String, Integer> numMonth = new HashMap<>();

    private static void fillNumMonth() {
        numMonth.put("JANUARY", 0);
        numMonth.put("FEBRUARY", 1);
        numMonth.put("MARCH", 2);
        numMonth.put("APRIL", 3);
        numMonth.put("MAY", 4);
        numMonth.put("JUNE", 5);
        numMonth.put("JULY", 6);
        numMonth.put("AUGUST", 7);
        numMonth.put("SEPTEMBER", 8);
        numMonth.put("OCTOBER", 9);
        numMonth.put("NOVEMBER", 10);
        numMonth.put("DECEMBER", 11);
    }

    public Map<String, Integer> getNumMonth() {
        fillNumMonth();
        return numMonth;
    }
}
