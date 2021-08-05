/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static javax.swing.plaf.metal.MetalLookAndFeel.getControl;

/**
 *
 * @author Kevin Matinez
 */
public class Avion  extends Vehiculo_aereo{
    
    private String alas, aerolinea, puestos;

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getPuestos() {
        return puestos;
    }

    public void setPuestos(String puestos) {
        this.puestos = puestos;
    } 
    
    
    public void agregar () {
    
    System.out.println("Tren Aterrizaje: " + getAlas() );
    System.out.println("Control: " + getAerolinea() );
    System.out.println("Tren Aterrizaje: " + getTren_aterrizaje() );
    System.out.println("Control: " + getControl() );
    }
    
}
