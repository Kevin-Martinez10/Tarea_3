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
public class Vehiculo {
    
    private String marca, modelo, gas, tipo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void agregar () {
    System.out.println("Marca: " + getMarca() );
    System.out.println("Modelo: " + getModelo() );
    System.out.println("Gas: " + getGas() );
    System.out.println("Tipo: " + getTipo() );
    
    }
}
