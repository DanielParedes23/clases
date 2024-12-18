class Perro extends Animal implements Mascota {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo su comida para perros.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " esta durmiendo en su cama.");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " esta jugando a buscar la pelota.");
    }

    @Override
    public void mostrarCarino() {
        System.out.println(nombre + " mueve la cola para mostrar cariño.");
    }
}
