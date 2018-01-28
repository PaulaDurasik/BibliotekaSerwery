package com.sda.biblioteka.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Calculator extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        String rodzajDzial=request.getParameter("rodziajDzialania");
        String [] liczby=request.getParameterValues("liczby");

        
        if(rodzajDzial=="+"){
            int wynik;
            for (int i = 0; i <liczby.length; i++) {
                liczby[i]= String.valueOf(i);
                wynik=+i;
                
            }
        } else if(rodzajDzial=="-"){
            int wynik;
            for (int i = 0; i <liczby.length ; i++) {
                liczby[i]=String.valueOf(i);
                wynik=-i;


            }
        }else if(rodzajDzial=="/"){
            int wynik;
            for (int i = 0; i <liczby.length ; i++) {
                liczby[i]= String.valueOf(i);
                wynik=i/(i-1);

            }
        } else if(rodzajDzial=="*"){
            int wynik;
            for (int i = 0; i <liczby.length ; i++) {
                liczby[i]= String.valueOf(i);
                wynik=i*(i-1);

            }
        }

    }
}
