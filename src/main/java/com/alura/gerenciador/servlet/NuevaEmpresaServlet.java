/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel Noriega
 */
public class NuevaEmpresaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Iniciando a crear la empresa!");
        String nombreEmpresa = req.getParameter("nombre");
        
        PrintWriter out = resp.getWriter();
        out.println("<html><body>Empresa" + nombreEmpresa + " creada con exito!</body></html>");
    }
    
}
