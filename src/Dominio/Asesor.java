
package Dominio;

import java.util.Date;

public class Asesor extends Usuario {

    private int id;
    private String titulacion;
    private Date fechaInicioTrabajo;

    // private String identificacion
    // private String nombre
    // private String direccion
    // private String usuario
    // private String clave
    // private String perfil

    public Asesor() {
        super();
    }

    public Asesor(String identificacion, String nombre, String direccion, String usuario, String clave, String perfil,
            String titulacion, Date fechaInicioTrabajo) {
        super(identificacion, nombre, direccion, usuario, clave, perfil);
        this.titulacion = titulacion;
        this.fechaInicioTrabajo = fechaInicioTrabajo;

    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Date getFechaInicioTrabajo() {
        return fechaInicioTrabajo;
    }

    public void setFechaInicioTrabajo(Date fechaInicioTrabajo) {
        this.fechaInicioTrabajo = fechaInicioTrabajo;
    }

    @Override
    public String toString() {
        return "Asesor{" + "titulacion=" + titulacion + ", fechaInicioTrabajo=" + fechaInicioTrabajo + '}';
    }

}
