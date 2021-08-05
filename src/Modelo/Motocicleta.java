package Modelo;

/**
 *
 * @author Kevin Matinez
 */
public class Motocicleta extends Vehiculo_terrestre{
    
    private String Capacidad, Placa;

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
    
    @Override
    public void agregar (){
    
    System.out.println("Capacidad: " + getCapacidad() );
    System.out.println("Placa: " + getPlaca() );
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
