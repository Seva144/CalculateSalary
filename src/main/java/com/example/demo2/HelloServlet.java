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


@WebServlet(name = "helloServlet")
public class HelloServlet extends HttpServlet {

    private String message;
    private SalaryPerMonth salaryPerMonth;
    private IsDayOff isDayOff;

    public void init() {
        isDayOff = IsDayOff.Builder().build();
        message = "Hello World!";
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
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(salaryPerMonth);

        /*ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        String prettyJson = mapper.writeValueAsString(salaryPerMonth);*/

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + 2001 + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}