package Dominio;

import java.util.Date;

public class Vendedor extends Usuario {

    private Date fechaReclutamiento;
    private int id_lider;
    private Empresa empresa;

    public Vendedor() {
        super();
    }

    public Vendedor(String identificacion,
            String nombre,
            String direccion,
            String usuario,
            String clave,
            String perfil,
            Date fechaReclutamiento,
            int id_lider,
            Empresa empresa) {
        super(identificacion, nombre, direccion, usuario, clave, perfil);
        this.fechaReclutamiento = fechaReclutamiento;
        this.id_lider = id_lider;
        this.empresa = empresa;
    }

    public Date getFechaReclutamiento() {
        return fechaReclutamiento;
    }

    public void setFechaReclutamiento(Date fechaReclutamiento) {
        this.fechaReclutamiento = fechaReclutamiento;
    }

    public int getId_Lider(int id_lider) {
        return id_lider;
    }

    public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    // public void setEmpresa(Empresa empresa){
    // this.empresa = empresa;
    // }

    @Override
    public String toString() {
        return "Vendedor{" + "fechaReclutamiento=" + fechaReclutamiento + ", id_lider=" + id_lider + ", empresa="
                + empresa + '}';
    }

}
