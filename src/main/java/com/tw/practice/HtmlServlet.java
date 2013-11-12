package com.tw.practice;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n" +
                "<HTML>\n" +
                "<HEAD><TITLE>Hello With HTML</TITLE></HEAD>\n" +
                "<BODY>\n" +
                "   <H1>Hello With HTML</H1>\n" +
                "   <p> Soweto's black African councilors were not provided by the apartheid state with the finances to " +
                "       address housing and infrastructural problems. Township residents opposed the black councilors as " +
                "       puppet collaborators who personally benefited financially from an oppressive regime. Resistance " +
                "       was spurred by the exclusion of blacks from the newly formed tricameral Parliament (which did " +
                "       include Whites, Asians and Coloreds). " +
                "   <p>" +
                "   <img alt=\"\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/c/cb/Rdphouses.jpg/250px-Rdphouses.jpg\" " +
                "       width=\"250\" height=\"139\" " +
                "       srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/c/cb/Rdphouses.jpg/375px-Rdphouses.jpg 1.5x, //" +
                "       upload.wikimedia.org/wikipedia/commons/thumb/c/cb/Rdphouses.jpg/500px-Rdphouses.jpg 2x\" " +
                "       data-pinit=\"registered\">" +
                "</BODY>" +
                "</HTML>");
    }
}
