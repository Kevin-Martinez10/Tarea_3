package Modelo;

/**
 *
 * @author Kevin Matinez
 */
public class Vehiculo_terrestre  extends Vehiculo{
    
    private String tipo, chasis, llantas, pavimento, terraceria;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getPavimento() {
        return pavimento;
    }

    public void setPavimento(String pavimento) {
        this.pavimento = pavimento;
    }

    public String getTerraceria() {
        return terraceria;
    }

    public void setTerraceria(String terraceria) {
        this.terraceria = terraceria;
    }
    
    
    @Override
    public void agregar (){
    
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
