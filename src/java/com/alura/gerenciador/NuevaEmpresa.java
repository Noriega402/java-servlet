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
import java.io.PrintWriter;

/**
 *
 * @author Daniel Noriega
 */
public class NuevaEmpresa extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Creando una empresa");
        PrintWriter out = response.getWriter();
        
        String nombreEmpresa = request.getParameter("nombre");
        
        Empresa empresa = new Empresa();
        empresa.setNombre(nombreEmpresa);
        
        DB baseDeDatos = new DB();
        baseDeDatos.agregarEmpresa(empresa);
        
        //Llamada del JSP
        RequestDispatcher  rd = request.getRequestDispatcher("/nuevaEmpresaRegistrada.jsp");
        request.setAttribute("nombreEmpresa", empresa.getNombre());
        rd.forward(request, response);//envio de respuestas al JSP
    }
}
