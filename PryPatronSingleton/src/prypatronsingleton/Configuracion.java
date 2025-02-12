
package prypatronsingleton;


public class Configuracion {
    private  static Configuracion instancia;
    private String idioma;
      private String tema;

    private Configuracion() {
        this.idioma = "español";
        this.tema = "oscuro";
    }
      public static Configuracion getInstancia(){
    
        if(instancia==null)  {
          
          instancia=new Configuracion();
        }
        
        
        return instancia;
    
    
    
}

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
      public void  mostrarConfiguracion() {
          System.out.println("idioma     "+   idioma    + "   tema    "+   tema);
            
      
}}