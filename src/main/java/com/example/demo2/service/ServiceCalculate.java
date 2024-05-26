package com.example.demo2.service;

import com.example.demo2.util.MonthList;
import com.groupstp.isdayoff.IsDayOff;
import com.groupstp.isdayoff.IsDayOffDateType;
import com.groupstp.isdayoff.enums.DayType;

import java.util.*;
import java.util.stream.Collectors;

public class ServiceCalculate {

    private final IsDayOff isDayOff;

    private final Map<String, Integer> numMonth;

    private final int workdays_months;

    private final double hour_income;


    public ServiceCalculate(int year, String month, Double salary, IsDayOff isDayOff) {
        this.isDayOff = IsDayOff.Builder().build();
        this.numMonth = new MonthList().getNumMonth();
        this.workdays_months = getAllWorkDays(year, month);
        this.hour_income = calculateSalaryPerMonth(salary, workdays_months);
    }

    private int getAllWorkDays(int year, String month) {
        List<IsDayOffDateType> workedDay = (isDayOff.daysTypeByMonth(new Date(year, numMonth.get(month), 1))
                .stream().filter(isDayOffDateType -> isDayOffDateType.getDayType().equals(DayType.WORKING_DAY))
                .collect(Collectors.toList()));
        return workedDay.size();
    }

    private double calculateSalaryPerMonth(double salary, int days) {
        double salaryPerDay = salary / days;
        return Math.round(salaryPerDay * 100.0) / 100.0;
    }

    public int getWorkdays_months() {
        return workdays_months;
    }

    public double getHour_income() {
        return hour_income;
    }
}
