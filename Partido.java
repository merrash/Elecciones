
public class Partido {
    private String nombrePartido;
    private String alineacion;
    private String sede;
    private String presidente; 
    
    /**
     *
     * @param nompar
     */
    public void setNombrePartido(String nompar){
        nombrePartido = nompar;
    }
    public String getNombrePartido(){
        return nombrePartido;
    }
    
    public void setAlineacion(String alin){
        alineacion = alin;
    }
    public String getAlineacion(){
        return alineacion;
    }
    
    public void setSede(String sed){
        sede = sed;
    }
    public String getSede(){
        return sede;
    }
    
    public void setPresidente(String pres){
        presidente = pres;
    }
    public String getPresidente(){
        return presidente;
    }
}
