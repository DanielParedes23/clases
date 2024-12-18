public class Main {
    public static void main(String[] args) {
        // Crear un objeto Perro
        Perro miPerro = new Perro("perro", 5);
        miPerro.comer();
        miPerro.dormir();
        miPerro.jugar();
        miPerro.mostrarCarino();

        System.out.println();

        // Crear un objeto Pez
        Pez miPez = new Pez("Pez", 2);
        miPez.comer();
        miPez.dormir();
    }
}
