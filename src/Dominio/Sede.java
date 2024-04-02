package Dominio;

public class Sede {

    private int id;
    private String nombre;
    private Empresa empresa;
    private Ciudad ciudad;
    private Pais pais;

    public Sede(String nombre, Empresa empresa, Ciudad ciudad, Pais pais) {
        this.ciudad = ciudad;
        this.empresa = empresa;
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

//    public void set(Ciudad ciudad) {
//        this.ciudad = ciudad;
//    }

    public Pais getPais() {
        return pais;
    }

//    public void set(Pais pais) {
//        this.pais = pais;
//    }

    @Override
    public String toString() {
        return "Sede{" + "nombre=" + nombre + '}';
    }
    
    
}
