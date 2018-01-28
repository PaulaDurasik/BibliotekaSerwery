package com.sda.biblioteka.servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.LocalDate.*;

public class Today extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String pram1=request.getParameter("param1");
        ServletOutputStream out = response.getOutputStream();// jeżeli chcemy pokazać na stronie

        out.println("<html><head></head><body><p>Dziesiejsza data to"+ LocalDateTime.now()+"</p></body>");
        out.println(pram1);
    }
}
