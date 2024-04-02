
package Dominio;

import java.util.Date;

public class Asesor {

    private int id;
    private String titulacion;
    private Date fechaInicioTrabajo;
    
    public Asesor(String titulacion, Date fechaInicioTrabajo){
    this.titulacion = titulacion;
    this.fechaInicioTrabajo = fechaInicioTrabajo;
    }
    
    public String getTitulacion(){
    return titulacion; 
    }
    
    public void setTitulacion(String titulacion){
    this.titulacion = titulacion;
    }
    
    public Date getFechaInicioTrabajo(){
    return fechaInicioTrabajo; 
    }
    
    public void set(Date fechaInicioTrabajo){
    this.fechaInicioTrabajo = fechaInicioTrabajo;
    }

    @Override
    public String toString() {
        return "Asesor{" + "titulacion=" + titulacion + ", fechaInicioTrabajo=" + fechaInicioTrabajo + '}';
    }
    
    
}
