
package Dominio;

import java.util.Date;

public class Asesor extends Usuario {

    private int id;
    private String titulacion;
    private Date fechaInicioTrabajo;

    public Asesor() {
        super();
    }

    public Asesor(String identificacion, String nombre, String direccion, String usuario, String clave, String perfil,
            String titulacion, Date fechaInicioTrabajo) {
        super(identificacion, nombre, direccion, usuario, clave, perfil);
        this.titulacion = titulacion;
        this.fechaInicioTrabajo = fechaInicioTrabajo;

    }

    public void getIdentificacion(String identificacion) {
        super.getIdentificacion();
    }

    public void setIdentificacion(String identificacion) {
        super.setIdentificacion(identificacion);
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

    public void setId(int id) {
        this.id = id;
    }

}
