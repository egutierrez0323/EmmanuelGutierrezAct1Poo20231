package Dominio;

public class SectorEmpresas {

    private int id;
    private Empresa empresa;
    private SectorDelMercado sector;
    
    public SectorEmpresas(Empresa empresa, SectorDelMercado sector){
    this.empresa = empresa;
    this.sector = sector;
    }
    
    public Empresa getEmpresa(){
    return empresa;
    }
    
//    public void setEmpresa(Empresa empresa){
//    this.empresa = empresa;
//    }
    
    public SectorDelMercado getsector(){
    return sector;
    }
    
//    public void setSector(SectorDelMercado sector){
//    this.sector = sector;
//    }
    
    
}
