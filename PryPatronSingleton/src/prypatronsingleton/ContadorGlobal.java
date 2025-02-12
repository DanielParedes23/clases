
package prypatronsingleton;

public class ContadorGlobal {
    
    // varibale estatica de tipo privado para almacenar unica instancia
    private static ContadorGlobal instancia;
    
    //variable para almacenar conteo
    private int contador=0;
    //constructor privado para creear nuevas instancias
    private ContadorGlobal() {
    }
    public static ContadorGlobal getInstancia(){
       if (instancia==null) {   
        instancia=new ContadorGlobal();       
}
       return instancia;
    }
    // cear metodo para incrementar contador mas 1
    public void incrementar(){
    contador++;
    
    
}
// metodo para obetenr valor
    public int obtenerValor(){
return contador;
}}