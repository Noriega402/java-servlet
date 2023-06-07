/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.gerenciador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Daniel Noriega
 */
class DB {

    private static List<Empresa> listaEmpresa = new ArrayList<>();
    private static Integer llaveSecuencial = 1;

    static {
        Empresa emp1 = new Empresa();
        Empresa emp2 = new Empresa();
        Empresa emp3 = new Empresa();
        Empresa emp4 = new Empresa();
        emp1.setNombre("Alura");
        emp1.setId(DB.llaveSecuencial++);
        emp2.setNombre("Muebles Sinai");
        emp2.setId(DB.llaveSecuencial++);
        emp3.setNombre("AutoCom");
        emp3.setId(DB.llaveSecuencial++);
        emp4.setNombre("CEMACO");
        emp4.setId(DB.llaveSecuencial++);
        listaEmpresa.add(emp1);
        listaEmpresa.add(emp2);
        listaEmpresa.add(emp3);
        listaEmpresa.add(emp4);
    }

    public void agregarEmpresa(Empresa empresa) {
        empresa.setId(DB.llaveSecuencial++);
        DB.listaEmpresa.add(empresa);
    }

    public List getEmpresas() {
        return DB.listaEmpresa;
    }

    void eliminarEmpresa(Integer id) {
        Iterator<Empresa> iterador = listaEmpresa.iterator();
        while(iterador.hasNext()){
            Empresa emp = iterador.next();
            if(emp.getId() == id){
                iterador.remove();
            }
        }
    }

    public Empresa buscarEmpresaPorId(Integer id) {
        for(Empresa empresa : listaEmpresa){
            if(empresa.getId() == id){
                return empresa;
            }
        }
        return null;
    }

}
