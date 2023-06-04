/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.gerenciador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Noriega
 */
class DB {
    
    private static List<Empresa> listaEmpresa = new ArrayList<>();

    static{
        Empresa emp1 = new Empresa();
        Empresa emp2= new Empresa();
        Empresa emp3= new Empresa();
        Empresa emp4= new Empresa();
        emp1.setNombre("Alura");
        emp2.setNombre("Muebles Sinai");
        emp3.setNombre("AutoCom");
        emp4.setNombre("CEMACO");
        listaEmpresa.add(emp1);
        listaEmpresa.add(emp2);
        listaEmpresa.add(emp3);
        listaEmpresa.add(emp4);
    }
    
    public void agregarEmpresa(Empresa empresa) {
        DB.listaEmpresa.add(empresa);
    }
    
    public List getEmpresas(){
        return DB.listaEmpresa;
    }
    
}
