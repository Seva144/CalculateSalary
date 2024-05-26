package com.example.demo2;

import java.io.*;

import com.example.demo2.model.SalaryPerMonth;
import com.example.demo2.service.ServiceCalculate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.groupstp.isdayoff.IsDayOff;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "calculate")
public class CalculateSalary extends HttpServlet {

    private SalaryPerMonth salaryPerMonth;
    private IsDayOff isDayOff;

    public void init() {
        isDayOff = IsDayOff.Builder().build();
        salaryPerMonth = new SalaryPerMonth();
    }

    @Override
    protected void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int year = Integer.parseInt(request.getParameter("year"));
        String month = request.getParameter("month");
        double salary = Double.parseDouble(request.getParameter("salary"));

        ServiceCalculate calculate = new ServiceCalculate(year, month, salary, isDayOff);

        int workdays_months = calculate.getWorkdays_months();
        double hour_income = calculate.getHour_income();

        salaryPerMonth.setYear(year);
        salaryPerMonth.setMonth(month);
        salaryPerMonth.setSalary(salary);
        salaryPerMonth.setWorkdays_months(workdays_months);
        salaryPerMonth.setHour_income(hour_income);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(salaryPerMonth);

        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println(prettyJson);


    }


    public void destroy() {
    }
}