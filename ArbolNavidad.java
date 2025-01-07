import java.util.Scanner;

public class ArbolNavidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Con cuantos asteriscos quieres comenzar el arbol de navidad? (Debe ser impar): ");
        int inicio = scanner.nextInt();

        System.out.print("Con cuantos asteriscos quieres finalizar el arbol de navidad? (Debe ser impar y mayor que el inicio): ");
        int fin = scanner.nextInt();

        // Validar entrada
        if (inicio % 2 == 0 || fin % 2 == 0 || inicio >= fin) {
            System.out.println("ingresa números impares y asegúrate de que el valor final sea mayor que el inicial.");
            return;
        }
        // Generar el árbol (triángulo)
        for (int i = inicio; i <= fin; i += 2) {
            int espacios = (fin - i) / 2; // Calcular espacios antes de los asteriscos
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea
        }

        scanner.close();
}
}2
122