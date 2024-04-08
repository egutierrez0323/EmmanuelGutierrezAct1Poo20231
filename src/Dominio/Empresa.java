
package Dominio;

import java.util.Date;
import java.util.List;

public class Empresa {

    private int id;
    private String nombre;
    private Date fechaIncorporacion;
    private double facturacionAnual;
    private int numeroVendedores;
    private Sede sede;
    private List<Vendedor> vendedores;

    public Empresa() {
    }

    public Empresa(String nombre, Date fechaIncorporacion, double facturacionAnual, int numeroVendedores, Sede sede,
            Vendedor vendedor) {
        this.nombre = nombre;
        this.fechaIncorporacion = fechaIncorporacion;
        this.facturacionAnual = facturacionAnual;
        this.numeroVendedores = numeroVendedores;
        this.sede = sede;
        this.vendedores.add(vendedor);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public double getFacturacionAnual() {
        return facturacionAnual;
    }

    public void setFacturacionAnual(double facturacionAnual) {
        this.facturacionAnual = facturacionAnual;
    }

    public int getNumeroVendedores() {
        return numeroVendedores;
    }

    public void setNumeroVendedores(int numeroVendedores) {
        this.numeroVendedores = numeroVendedores;
    }

    public Sede getSede() {
        return this.sede;
    }

    // public void set(Sede sede){
    // this.sede = sede;
    // }

    public List<Vendedor> getVendedores() {
        return this.vendedores;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + ", fechaIncorporacion=" + fechaIncorporacion
                + ", facturacionAnual=" + facturacionAnual + ", numeroVendedores=" + numeroVendedores + ", sede=" + sede
                + '}';
    }

}
