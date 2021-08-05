package Modelo;

import static javax.swing.plaf.metal.MetalLookAndFeel.getControl;

/**
 *
 * @author Kevin Matinez
 */
public class Helicoptero extends Vehiculo_aereo{
    
    private String helices, pasajeros, controles;

    public String getHelices() {
        return helices;
    }

    public void setHelices(String helices) {
        this.helices = helices;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getControles() {
        return controles;
    }

    public void setControles(String controles) {
        this.controles = controles;
    }
    
    @Override
    public void agregar (){
    
    System.out.println("Tren Aterrizaje: " + getHelices() );
    System.out.println("Control: " + getPasajeros() );
    System.out.println("Tren Aterrizaje: " + getTren_aterrizaje() );
    System.out.println("Control: " + getControl() );
    
    
    }
    
}
