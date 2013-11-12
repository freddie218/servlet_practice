package com.tw.practice;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("username");
        String pwd = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n" +
                "<HTML>\n" +
                "<HEAD><TITLE>Hello With HTML</TITLE></HEAD>\n" +
                "<BODY>\n" +
                "   <H1>Hello you are in inside now!!!</H1>\n" +
                "   <p> hi *** " + name + " ***, I know your password is *** " + pwd + " ***. hahahahaha! <p>" +
                "</BODY>" +
                "</HTML>");
    }
}
