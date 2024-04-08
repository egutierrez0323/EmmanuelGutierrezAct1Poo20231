package Dominio;

public class Usuario {

    private String identificacion;
    private String nombre;
    private String direccion;
    private String usuario;
    private String clave;
    private String perfil;

    public Usuario() {

    }

    public Usuario(String identificacion, String nombre, String direccion, String usuario, String clave,
            String perfil) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.usuario = usuario;
        this.clave = clave;
        this.perfil = perfil;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String codigo) {
        this.identificacion = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", direccion=" + direccion
                + ", usuario="
                + usuario + ", clave=" + clave + ", perfil=" + perfil + '}';
    }

}
