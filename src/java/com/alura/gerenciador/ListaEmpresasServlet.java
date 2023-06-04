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
import java.util.List;

/**
 *
 * @author Daniel Noriega
 */
public class ListaEmpresasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DB baseDeDatos = new DB();
        List<Empresa> listaEmpresas = baseDeDatos.getEmpresas();
        RequestDispatcher rd = request.getRequestDispatcher("listaEmpresas.jsp");
        request.setAttribute("empresas", listaEmpresas);   
        rd.forward(request, response);
    }
}
