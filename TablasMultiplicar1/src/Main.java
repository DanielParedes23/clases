import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar rango al usuario
        System.out.print("Ingrese el numero maximo para generar las tablas (minimo 2): ");
        int maxNumero = scanner.nextInt();

        while (maxNumero < 2) {
            System.out.print(" ingrese un número mayor o igual a 2: ");
            maxNumero = scanner.nextInt();
        }

        // Menú de opciones
        System.out.println("\nOpciones disponibles:");
        System.out.println("1. Mostrar tablas en orden ascendente");
        System.out.println("2. Mostrar tablas en orden descendente");
        System.out.println("3. Mostrar tablas invertidas");
        System.out.println("4. Mostrar suma total de resultados");
        System.out.print("Seleccione una opcion: ");
        int opcion = scanner.nextInt();

        int sumaTotal = 0;

        // Generar tablas de multiplicar segun la opción
        for (int i = 2; i <= maxNumero; i++) {
            TablaMultiplicar tabla;

            switch (opcion) {
                case 1:
                    tabla = new TablaAscendente(i);
                    break;
                case 2:
                    tabla = new TablaDescendente(i);
                    break;
                case 3:
                    tabla = new TablaInvertida(i);
                    break;
                case 4:
                    tabla = new TablaAscendente(i); // Sumar siempre se puede desde ascendente
                    sumaTotal += tabla.sumarResultados();
                    continue; // Salta a la siguiente iteración
                default:
                    System.out.println("Opcion no valida. Saliendo...");
                    return;
            }

            tabla.mostrarTabla();
            sumaTotal += tabla.sumarResultados();
            System.out.println("Suma de la tabla del " + i + ": " + tabla.sumarResultados());
            System.out.println();
        }

        // Mostrar suma total si se eligió la opción 4
        if (opcion == 4) {
            System.out.println("Suma total de todas las tablas: " + sumaTotal);
        }

        scanner.close();
    }
}
