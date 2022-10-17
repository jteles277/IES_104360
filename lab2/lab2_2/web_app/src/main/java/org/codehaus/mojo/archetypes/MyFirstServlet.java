package org.codehaus.mojo.archetypes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.servlet.ServletHandler;


import org.eclipse.jetty.server.Server;

@WebServlet(name = "MyFirstServlet", urlPatterns = { "/MyFirstServlet" })

public class MyFirstServlet extends HttpServlet {
  private static final long serialVersionUID = -1915463532411657451L;

  public static void main(String[] args) throws Exception {

    Server server = new Server(8680);
    ServletHandler servletHandler = new ServletHandler();
    server.setHandler(servletHandler);

    servletHandler.addServletWithMapping(MyFirstServlet.class, "/");

    server.start();


    server.join();
    
    

  }

  @Override
  protected void doGet(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Nome Exemplo</title>");
    out.println("</head>");
    out.println("<body>");
    String name = request.getParameter("name");
    if (name != null) {
      out.println(" Hello, " + name + "<br>");
    } else {
      out.println("No Parameters, Please enter some");
    }
    out.println("<P>");
  }

  @Override
  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
  }
}
 