import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear Empresa
        System.out.println("Ingrese los datos de la empresa:");
        System.out.print("Nombre de la empresa: ");
        String nombreEmpresa = scanner.nextLine();
        System.out.print("RUC de la empresa: ");
        String ruc = scanner.nextLine();
        System.out.print("Dirección de la empresa: ");
        String direccion = scanner.nextLine();
        System.out.print("Email de la empresa: ");
        String email = scanner.nextLine();

        Empresa empresa = new Empresa(nombreEmpresa, ruc, direccion, email);

        // para crear empleados 
        for (int i = 1; i <= 2; i++) {
            System.out.println("Ingrese los datos del empleado " + i + ":");
            System.out.print("Nombre: ");
            String nombreEmpleado = scanner.nextLine();
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir salto de línea

            Empleado empleado = new Empleado(nombreEmpleado, cedula, salario);
            empresa.agregarEmpleado(empleado);
        }

        // Muestra los datso que ingrese antes de los empleados
        empresa.mostrarEmpleados();
    }
}
