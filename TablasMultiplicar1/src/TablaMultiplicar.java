public class TablaMultiplicar {
    protected int numero;

    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    public void mostrarTabla() {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public int sumarResultados() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += numero * i;
        }
        return suma;
    }
}
