
package Dominio;

public class AsesoresSectores {

    private int id;
    private Asesor asesor;
    private SectorDelMercado sector;
    
    public AsesoresSectores(Asesor asesor, SectorDelMercado sector){
    this.asesor = asesor;
    this.sector = sector;
    }
    
    public Asesor getAsesor(){
    return asesor;
    }
    
    public void setAsesor(Asesor asesor){
    this.asesor = asesor;
    }
    
    public SectorDelMercado getSector(){
    return sector;
    }
    
    public void getSector(SectorDelMercado sector){
    this.sector = sector;
    }
}
