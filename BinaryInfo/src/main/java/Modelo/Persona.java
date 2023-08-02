/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

public class Persona implements Serializable{
    
    private long codigo;
    private int edad;
    private double sueldo;

    public Persona(long codigo, int edad, double sueldo) {
        this.codigo = codigo;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }
}
