package Modelo;

import static javax.swing.plaf.metal.MetalLookAndFeel.getControl;

/**
 *
 * @author Kevin Matinez
 */
public class Vehiculo_aereo extends Vehiculo{
    
    private String tren_aterrizaje, puerto_control;

    public String getTren_aterrizaje() {
        return tren_aterrizaje;
    }

    public void setTren_aterrizaje(String tren_aterrizaje) {
        this.tren_aterrizaje = tren_aterrizaje;
    }

    public String getPuerto_control() {
        return puerto_control;
    }

    public void setPuerto_control(String puerto_control) {
        this.puerto_control = puerto_control;
    }
    
    public void agregar () {
        
    System.out.println("Tren Aterrizaje: " + getTren_aterrizaje() );
    System.out.println("Control: " + getControl() );
    
    
    
    
    
        
    
    }
    
}
