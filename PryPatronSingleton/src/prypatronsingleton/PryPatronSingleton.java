package prypatronsingleton;

import java.util.ArrayList;

public class PryPatronSingleton {
    public static void main(String[] args) {
       
        // Instanciamos el contador global
        ContadorGlobal contador = ContadorGlobal.getInstancia();
        ContadorGlobal contador2 = ContadorGlobal.getInstancia();
        
        // Incrementamos el contador
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        
        // Mostramos el valor del contador
        System.out.println("Valor del contador: " + contador2.obtenerValor());
        
        // ArrayList para idiomas
        ArrayList<String> listadoIdioma = new ArrayList<>();
        listadoIdioma.add("español");//0
        listadoIdioma.add("francés");//1
        listadoIdioma.add("italiano");//2
     
        ArrayList<String> listadoTema = new ArrayList<>();
        listadoTema.add("oscuro");
        listadoTema.add("claro");
        
      
        Configuracion configuracion = Configuracion.getInstancia();

        
        configuracion.setIdioma(listadoIdioma.get(2)); // Francés
        configuracion.setTema(listadoTema.get(0));     // Oscuro

        
        configuracion.mostrarConfiguracion();
        Configuracion configuracion2 = Configuracion.getInstancia();
        
    }
}
