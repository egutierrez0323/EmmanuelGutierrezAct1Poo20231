package Dominio;

import java.util.Date;

public class Vendedor {

    private int id;
    private Date fechaReclutamiento;
    private int id_lider;
    private Empresa empresa;
    
    public Vendedor(Date fechaReclutamiento, int id_lider, Empresa empresa){
    this.fechaReclutamiento = fechaReclutamiento;
    this.id_lider = id_lider;
    this.empresa = empresa;
    }
    
    public Date getFechaReclutamiento(){
    return fechaReclutamiento; 
    }
    
    public void set(Date fechaReclutamiento){
    this.fechaReclutamiento = fechaReclutamiento;
    }
    
    public int getId_Lider(int id_lider){
    return id_lider; 
    }
    
    public void setId_lider(int id_lider){
    this.id_lider = id_lider;
    }
    
    public Empresa getEmpresa(){
    return empresa; 
    }
    
//    public void setEmpresa(Empresa empresa){
//    this.empresa = empresa;
//    }

    @Override
    public String toString() {
        return "Vendedor{" + "fechaReclutamiento=" + fechaReclutamiento + ", id_lider=" + id_lider + ", empresa=" + empresa + '}';
    }
    
    
}
