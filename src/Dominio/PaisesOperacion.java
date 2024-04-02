package Dominio;

public class PaisesOperacion {

    private int id;
    private Empresa empresa;
    private Pais pais;
    
    public PaisesOperacion(Empresa empresa, Pais pais){
    this.empresa = empresa;
    this.pais = pais;
    }
    
    public Empresa getEmpresa(){
    return empresa;
    }
    
//    public void setEmpresa(Empresa empresa){
//    this.empresa = empresa;
//    }
    
    public Pais getPais(){
    return pais;
    }
    
//    public void set(Pais pais){
//    this.pais = pais;
//    }
    
    
}
