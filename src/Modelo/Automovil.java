/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Kevin Matinez
 */
public class Automovil  extends Vehiculo_terrestre{
    
    private String asientos, camioneta, bajo;

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public String getCamioneta() {
        return camioneta;
    }

    public void setCamioneta(String camioneta) {
        this.camioneta = camioneta;
    }

    public String getBajo() {
        return bajo;
    }

    public void setBajo(String bajo) {
        this.bajo = bajo;
    }
    
    public void agregar() {
    System.out.println("Asientos: " + getAsientos() );
    System.out.println("Camioneta: " + getCamioneta() );
    System.out.println("Bajo: " + getBajo() );
     System.out.println("Marca: " + getMarca() );
    System.out.println("Modelo: " + getModelo() );
    System.out.println("Gas: " + getGas() );
    System.out.println("Tipo: " + getTipo() );    
    System.out.println("Tipo: " + getTipo() );
    System.out.println("Chasis: " + getChasis() );
    System.out.println("Llantas: " + getLlantas() );
    System.out.println("Pavimento: " + getPavimento() );
    System.out.println("Terraceria: " + getTerraceria() );
    
    
    
    }
    
    
}
