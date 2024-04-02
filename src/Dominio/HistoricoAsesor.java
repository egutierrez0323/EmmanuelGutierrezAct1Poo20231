
package Dominio;

import java.util.Date;

public class HistoricoAsesor {

    private int id;
    private Empresa empresa;
    private Asesor asesor;
    private SectorDelMercado sector;
    private Date fechaIncorporacion;

    public HistoricoAsesor(Empresa empresa, Asesor asesor, SectorDelMercado sector, Date fechaIncorporacion){
    this.empresa = empresa;
    this.asesor = asesor;
    this.sector = sector;
    this.fechaIncorporacion = fechaIncorporacion;
    }
    
    public Empresa getEmpresa(){
    return empresa;
    }
    
    public void setEmpresa(Empresa empresa){
    this.empresa = empresa;
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
    
//    public void setSector(SectorDelMercado sector){
//    this.sector = sector;
//    }
    
    public Date getFechaIncorporacion(){
    return fechaIncorporacion;
    }
    
    public void setFechaIncorporacion(Date fechaIncorporacion){
    this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return "HistoricoAsesor{" + ", fechaIncorporacion=" + fechaIncorporacion + '}';
    }
    
    
}
