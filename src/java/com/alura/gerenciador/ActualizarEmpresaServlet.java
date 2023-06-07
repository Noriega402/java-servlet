/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.alura.gerenciador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Daniel Noriega
 */
public class ActualizarEmpresaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);
        DB db = new DB();
        Empresa emp = db.buscarEmpresaPorId(id);
        System.out.println(emp.getNombre());
        request.setAttribute("empresa", emp);
        
        RequestDispatcher rd = request.getRequestDispatcher("frmActualizarEmpresa.jsp");
        rd.forward(request, response);
        
        response.sendRedirect("listaEmpresas");
    }
}
