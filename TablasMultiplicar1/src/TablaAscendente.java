public class TablaAscendente extends TablaMultiplicar {
    public TablaAscendente(int numero) {
        super(numero);
    }

    @Override
    public void mostrarTabla() {
        System.out.println("Tabla en orden ascendente del " + numero + ":");
        super.mostrarTabla();
    }
}
