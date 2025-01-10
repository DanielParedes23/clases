package simulacioninventarioproducto;

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

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();

                    Producto producto = new Producto(nombre, cantidad, precio);
                    inventario.agregarProducto(producto);
                    break;

                case 2:
                    inventario.mostrarProductos();
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Producto productoEncontrado = inventario.buscarProducto(nombreBuscar);
                    if (productoEncontrado != null) {
                        System.out.println("Producto encontrado: " + productoEncontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    double total = inventario.calcularValorTotal();
                    System.out.println("El valor total del inventario es: $" + total);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}

