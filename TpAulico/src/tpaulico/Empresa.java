/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpaulico;

import java.util.Objects;
import java.util.TreeSet;

/**
 *
 * @author Marcos
 */
public class Empresa implements Comparable<Empresa> {
    
    private String razonSocial;
    private int cuit;
    private TreeSet<Empleado> Empleados;

    
    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return razonSocial;
    }

    

    
    public Empresa(String razonSocial, int cuit, TreeSet<Empleado> Empleados) {
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

    public TreeSet<Empleado> getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(TreeSet<Empleado> Empleados) {
        this.Empleados = Empleados;
    }
    
    public void agregarEmpleado(Empleado empl){
        Empleados.add(empl);
    }

    public int compareTo(Empresa t) {
        if (cuit==t.cuit) {
            return 0;
        }else if (cuit>t.cuit) {
            return 1;
        }else{
            return -1;
        } 
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.razonSocial);
        hash = 71 * hash + this.cuit;
        hash = 71 * hash + Objects.hashCode(this.Empleados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (this.cuit != other.cuit) {
            return false;
        }
        if (!Objects.equals(this.razonSocial, other.razonSocial)) {
            return false;
        }
        if (!Objects.equals(this.Empleados, other.Empleados)) {
            return false;
        }
        return true;
    }


  

        

}
