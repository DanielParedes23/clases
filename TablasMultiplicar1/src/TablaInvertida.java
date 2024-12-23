public class TablaInvertida extends TablaMultiplicar {
    public TablaInvertida(int numero) {
        super(numero);
    }

    @Override
    public void mostrarTabla() {
        System.out.println("Tabla invertida del " + numero + ":");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " x " + numero + " = " + (numero * i));
        }
    }
}
