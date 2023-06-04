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
import java.rmi.ServerException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        String paramFechaApertura = request.getParameter("fecha");

        Date fechaApertura = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            fechaApertura = sdf.parse(paramFechaApertura);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Empresa empresa = new Empresa();
        empresa.setNombre(nombreEmpresa);
        empresa.setFechaApertura(fechaApertura);

        DB baseDeDatos = new DB();
        baseDeDatos.agregarEmpresa(empresa);

        //Llamada del JSP
        RequestDispatcher rd = request.getRequestDispatcher("/nuevaEmpresaRegistrada.jsp");
        request.setAttribute("empresa", empresa.getNombre());
        request.setAttribute("fechaApertura", empresa.getFechaApertura());
        rd.forward(request, response);//envio de respuestas al JSP
    }
}
