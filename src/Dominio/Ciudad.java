package Dominio;

public class Ciudad {

    private int id;
    private String nombre;
    private int idCiudad;
    private Sede sede;

    public Ciudad() {
    }

    public Ciudad(String nombre, int idCiudad, Sede sede) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
    this.sede = sede;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", idCiudad=" + idCiudad + '}';
    }

}
