package simulacioninventarioproducto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulacionInventarioProducto {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Calcular valor total del inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = -1;

            // Validar la entrada para evitar errores al leer un número
            while (true) {
                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // limpiar el buffer
                    break; // Salir del bucle si la entrada es válida
                } catch (InputMismatchException e) {
                    System.out.println("Dato incorrecto. Ingresa otra vez un caracter valido.");
                    scanner.nextLine(); // limpiar el buffer para evitar un bucle infinito
                }
            }

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la cantidad: ");
                        double cantidad = scanner.nextDouble();
                        System.out.print("Ingrese el precio: ");
                        double precio = scanner.nextDouble();
                        Producto producto = new Producto(nombre, cantidad, precio);
                        inventario.agregarProducto(producto);
                    } catch (InputMismatchException e) {
                        System.out.println("Dato incorrecto. No se pudo agregar el producto.");
                        scanner.nextLine(); // limpiar el buffer
                    }
                    break;

                case 2:
                    inventario.mostrarProductos();
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    inventario.buscarProducto(nombreBuscar);
                    break;

                case 4:
                    inventario.calcularValorTotal();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }
    }
}

