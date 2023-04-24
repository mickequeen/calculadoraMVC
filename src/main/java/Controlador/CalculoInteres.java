/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Modelo.Calculo;

/**
 *
 * @author micke
 */
@WebServlet(name = "CalculoInteres", urlPatterns = {"/CalculoInteres"})
public class CalculoInteres extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculoInteres</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculoInteres at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      double capitalInicial = Double.parseDouble(request.getParameter("capital_inicial"));
      double tasaAnual = Double.parseDouble(request.getParameter("tasa_anual"));
      double plazo = Double.parseDouble(request.getParameter("plazo_anho"));
      request.setAttribute("capital_inicial", capitalInicial);
      request.setAttribute("tasa_anual", tasaAnual);
      request.setAttribute("plazo_anho", plazo);
     
      Calculo objCalculoInteres = new Calculo();
      objCalculoInteres.setCap(capitalInicial);
      objCalculoInteres.setTasa(tasaAnual);
      objCalculoInteres.setAnho(plazo);
      String calculoInteres = String.valueOf(objCalculoInteres.calculoInteres());
      System.out.print(calculoInteres);

      
      try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div style=\"margin: 24px; padding: 24px; border: 1px solid #eee; border-radius: 2em; color: #546E7A\"><h1>Resultado</h1> "
                    + "<p>El interés simple generado con un capital inicial de $" + objCalculoInteres.getCap() + 
                    " pesos,</p><p> en un plazo de " + objCalculoInteres.getAnho() + " años,</p><p> con una tasa anual de " + 
                    objCalculoInteres.getTasa() + "% por año </p><p> es de <b>$"
                    + objCalculoInteres.getResultado() + " pesos.</b></p>"
                            + "<form action=\"index.jsp\" method=\"\"><input style=\"color:#fff; padding: 10px 20px; background: #28892b; border: none; border-radius: 3em; cursor: pointer\" type=\"submit\" value=\"VOLVER A CALCULAR\"  name=\"\" /></form></div>");
            
            out.println("</body>");
            out.println("</html>");
        }
      
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
