/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Sulayman
 */
public class Coche extends Vehiculo{
    String matricula;
    String marca;
    String modelo;
    String color;
    int numRuedas;
    int numPuertas;
    int numPlazas;
    int potencia;
    int capacidadMaletero;
    Seguro seguro;

    public Coche() {
    }

    public Coche(String matricula, String marca, String modelo, String color, int numRuedas, int numPuertas, int numPlazas, int Potencia, int capacidadMaletero, Seguro seguro) {
        super(matricula, marca, modelo, color, numRuedas, numPuertas, numPlazas, Potencia, capacidadMaletero, seguro);
        this.numRuedas = numRuedas;
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.potencia = Potencia;
        this.capacidadMaletero = capacidadMaletero;
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numRuedas=" + numRuedas + ", numPuertas=" + numPuertas + ", numPlazas=" + numPlazas + ", potencia=" + potencia + ", capacidadMaletero=" + capacidadMaletero + ", seguro=" + seguro + '}';
    }

    //EQUALS
    
    public boolean Equals(Vehiculo other){
        if(!this.matricula.equals(other.matricula)){
            return false;
        }if(!this.marca.equals(other.marca)){
            return false;
        }if(!this.modelo.equals(other.modelo)){
            return false;
        }if(!this.color.equals(other.color)){
            return false;
        }if(this.numRuedas != other.numRuedas){
            return false;
        }if(this.numPuertas != other.numPuertas){
            return false;
        }if(this.numPlazas != other.numRuedas){
            return false;
        }if(this.potencia != other.numRuedas){
            return false;
        }if(this.capacidadMaletero != other.capacidadMaletero){
            return false;
        }
            
            return true;
    }
    
    
    //GETTERS && SETTERS
    
    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getNumRuedas() {
        return numRuedas;
    }

    @Override
    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public int getNumPuertas() {
        return numPuertas;
    }

    @Override
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public int getPotencia() {
        return potencia;
    }

    @Override
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    @Override
    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public Seguro getSeguro() {
        return seguro;
    }

    @Override
    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
    
    
    
}
