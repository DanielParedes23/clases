package animales;

public class Gato implements Mamifero {
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: Miau miau");
    }

    @Override
    public void amamantar() {
        System.out.println("El gato amamanta a sus crias.");
    }
}
