import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> estudiantes = new ArrayList<>();
        UsuarioReportes reportes = new UsuarioReportes();

        // Pedir cantidad de estudiantes
        System.out.print("cantidad de estudiantes: ");
        int cantidadEstudiantes = sc.nextInt();
        sc.nextLine();  // Limpiar el buffer

        // Ingreso de estudiantes
        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.print("nombre de estudiante " + i + ": ");
            String nombre = sc.nextLine();

            System.out.print("genero del estudiante " + nombre + " (hombre o mujer): ");
            String genero = sc.nextLine();

            System.out.print("nota del estudiante " + i + ": ");
            double nota = sc.nextDouble();
            sc.nextLine(); // Limpiar el buffer

            // Crear un nuevo usuario y agregarlo al listado
            estudiantes.add(new Usuario(nombre, genero, nota));
        }

        // Menú interactivo
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Consultar notas de estudiantes hombres");
            System.out.println("2. Consultar notas de estudiantes mujeres");
            System.out.println("3. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            if (opcion == 1) {
                reportes.mostrarNotasHombres(estudiantes);
            } else if (opcion == 2) {
                reportes.mostrarNotasMujeres(estudiantes);
            } else if (opcion == 3) {
                System.out.println("fin de ejecucion");
                break;
            } else {
                System.out.println("Opción inválida ");
            }
        }
    }
}
