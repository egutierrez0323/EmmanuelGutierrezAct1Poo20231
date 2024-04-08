package Dominio;

public class SectorDelMercado {

    private int id;
    private String nombre;
    private String descripcion;

    public SectorDelMercado() {
    }

    public SectorDelMercado(String nombre, String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "SectorDelMercado{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
