public class Usuario {
    private String nombre;
    private String genero;
    private double nota;

    // Constructor
    public Usuario(String nombre, String genero, double nota) {
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public double getNota() {
        return nota;
    }
}
