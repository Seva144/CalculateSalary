package com.example.demo2.model;



public class SalaryPerMonth {

    private int year;
    private String month;
    private double salary;
    private double hour_income;
    private int workdays_months;

    public SalaryPerMonth() {
    }


    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public double getSalary() {
        return salary;
    }

    public double getHour_income() {
        return hour_income;
    }

    public void setHour_income(double hour_income) {
        this.hour_income = hour_income;
    }

    public int getWorkdays_months() {
        return workdays_months;
    }

    public void setWorkdays_months(int workdays_months) {
        this.workdays_months = workdays_months;
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

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

