/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.alura.gerenciador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Daniel Noriega
 */
public class ModificarEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Empresa modificada");
        
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        String nombreEmpresa = request.getParameter("nombre");
        String paramFechaApertura = request.getParameter("fecha");

        Date fechaApertura = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            fechaApertura = sdf.parse(paramFechaApertura);
        } catch (ParseException e) {
            throw new ServletException(e);
        }
        
        DB db = new DB();
        Empresa empresa = db.buscarEmpresaPorId(id);
        empresa.setNombre(nombreEmpresa);
        empresa.setFechaApertura(fechaApertura);
        
        response.sendRedirect("listaEmpresas");
    }
}
