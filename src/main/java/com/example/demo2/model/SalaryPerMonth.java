package com.example.demo2.model;


public class SalaryPerMonth {

    private int year;
    private String month;
    private double salary;
    private double hour_income;
    private int workdays_months;

    public SalaryPerMonth() {
    }

    public void setHour_income(double hour_income) {
        this.hour_income = hour_income;
    }

    public void setWorkdays_months(int workdays_months) {
        this.workdays_months = workdays_months;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalaryPerMonth{" +
                "year=" + year +
                ", month=" + month +
                ", salary=" + salary +
                ", hourIncome=" + hour_income +
                ", workdaysInMonth=" + workdays_months +
                '}';
    }

}

