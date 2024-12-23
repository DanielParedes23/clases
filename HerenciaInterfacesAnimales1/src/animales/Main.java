package animales;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de los animales
        Mamifero perro = new Perro();
        Mamifero gato = new Gato();

        // Llamar a los métodos
        System.out.println("Caracteristicas del perro:");
        perro.hacerSonido();
        perro.amamantar();

        System.out.println("\nCaracteristicas del gato:");
        gato.hacerSonido();
        gato.amamantar();
    }
}
