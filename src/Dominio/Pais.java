
package Dominio;


public class Pais {

    private int id;
    private String nombre;
    private double productoInternoBruto;
    private int poblacion;
    private String capital;
    private Sede sede;
    
    public Pais(String nombre,double productoInternoBruto, int poblacion,String capital){
    this.nombre = nombre;
    this.productoInternoBruto = productoInternoBruto;
    this.poblacion = poblacion;
    this.capital = capital;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    public double getProductoInternoBruto(){
    return productoInternoBruto;
    }
    
    public void setProductoInternoBruto(double productoInternoBruto){
    this.productoInternoBruto = productoInternoBruto;
    }
    
    public int getPoblacion(){
    return poblacion;
    }
    
    public void setPoblacion(int poblacion){
    this.poblacion = poblacion;
    }
    
    public String getCapital(){
    return capital;
    }
    
    public void setCapital(String capital){
    this.capital = capital;
    }
    
    public Sede getSede(){
    return sede;
    }
    
   public void setSede(Sede sede){
   this.sede = sede;
   }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", productoInternoBruto=" + productoInternoBruto + ", poblacion=" + poblacion + ", capital=" + capital + '}';
    }
    
    
}
