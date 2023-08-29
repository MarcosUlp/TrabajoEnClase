/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpaulico;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Empresa {
    
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> Empleados;

    
    public Empresa() {
    }
    
    
    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    

    
    public Empresa(String razonSocial, int cuit, ArrayList<Empleado> Empleados) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.Empleados = Empleados;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(ArrayList<Empleado> Empleados) {
        this.Empleados = Empleados;
    }
    
    public void agregarEmpleado(Empleado e){
        Empleados.add(e);
    }
    public void mostrarEmpleado(){
        
    }
}
