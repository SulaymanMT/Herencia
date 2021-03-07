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
public class Trayecto {
    String direccionSalida;
    String direccionLlegada;
    String horaSalida;
    String horaLlegada;
    
    public Trayecto(){
        
    }
    public Trayecto(String direccionSalida, String direccionLlegada, String horaSalida, String horaLlegada){
            this.direccionLlegada = direccionLlegada;
            this.direccionSalida = direccionSalida;
            this.horaSalida = horaSalida;
            this.horaLlegada = horaLlegada;         
    }

    @Override
    public String toString() {
        return "Trayecto{" + "direccionSalida=" + direccionSalida + ", direccionLlegada=" + direccionLlegada + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + '}';
    }
    
    
    
    //EQUALS
    
    public boolean Equals(Trayecto other){
        if(!this.direccionLlegada.equals(other.direccionLlegada)){
            return false;
        }
        if(!this.direccionSalida.equals(other.direccionSalida)){
            return false;
        }
        if(!this.horaLlegada.equals(other.horaLlegada)){
            return false;
        }
        if(!this.horaSalida.equals(other.horaSalida)){
            return false;
        }
        return true;
    }

        //GETTERS && SETTERS
    
    public String getDireccionSalida() {
        return direccionSalida;
    }

    public void setDireccionSalida(String direccionSalida) {
        this.direccionSalida = direccionSalida;
    }

    public String getDireccionLlegada() {
        return direccionLlegada;
    }

    public void setDireccionLlegada(String direccionLlegada) {
        this.direccionLlegada = direccionLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    
    
    
    
    
    
}
