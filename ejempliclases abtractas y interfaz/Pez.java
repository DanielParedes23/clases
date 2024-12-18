class Pez extends Animal {

    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void comer() {
        System.out.println(nombre + " est comiendo hojuelas de pescado.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " esta descansando flotando en el agua.");
    }
}
