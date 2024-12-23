public class TablaDescendente extends TablaMultiplicar {
    public TablaDescendente(int numero) {
        super(numero);
    }

    @Override
    public void mostrarTabla() {
        System.out.println("Tabla en orden descendente del " + numero + ":");
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
