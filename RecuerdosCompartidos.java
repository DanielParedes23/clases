package recuerdoscompartidos;

import java.util.ArrayList;
// Declaramos los recuerdos como arreglos (String[]).
public class RecuerdosCompartidos {
    public static void main(String[] args) {
        // **Arreglos que contienen los recuerdo de david
        String[] recuerdosDavid = {
            "jugar futbol", "ir al parque", "ver películas", 
            "estudiar programacion", "viajar a la playa", "fiestas de Quito"
        };
        // Arreglos que contiene recuerdos de maria
        String[] recuerdosMaria = {
            "estduiar programacion", "bailar", "carpas espe", 
            "jugar futbol", "viajar a la playa", "fiestas de Quito"
        };

        // creamos una lista para guardar los recuerdos que comparten ambos
        ArrayList<String> recuerdosCompartidos = new ArrayList<>();

        // **Compara recuerdos de david y maria
        // Recorremos cada recuerdo de David
        for (String recuerdoDavid : recuerdosDavid) {
            // Revisamos si coincide con algún recuerdo de María
            for (String recuerdoMaria : recuerdosMaria) {
                if (recuerdoDavid.equals(recuerdoMaria)) {
                    // Si el recuerdo no está ya en la lista, lo añadimos
                    if (!recuerdosCompartidos.contains(recuerdoDavid)) {
                        recuerdosCompartidos.add(recuerdoDavid);
                    }
                }
            }
        }

        // imprimimos en consola los recuerdos que ambos  comparten en su lista
        System.out.println("Los recuerdos combinados de david y maria son: " + recuerdosCompartidos);
    }
}
