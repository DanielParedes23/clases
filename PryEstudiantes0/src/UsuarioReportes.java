import java.util.ArrayList;

public class UsuarioReportes {

    // Método para mostrar las notas de los estudiantes hombres
    public void mostrarNotasHombres(ArrayList<Usuario> usuarios) {
        System.out.println("\n notas estudiante hombres:");
        for (Usuario usuario : usuarios) {
            if (usuario.getGenero().equalsIgnoreCase("hombre")) {
                System.out.println(usuario.getNombre() + ": " + usuario.getNota());
            }
        }
    }

    // Método para mostrar las notas de los estudiantes mujeres
    public void mostrarNotasMujeres(ArrayList<Usuario> usuarios) {
        System.out.println("\nnota estudiante mujer:");
        for (Usuario usuario : usuarios) {
            if (usuario.getGenero().equalsIgnoreCase("mujer")) {
                System.out.println(usuario.getNombre() + ": " + usuario.getNota());
            }
        }
    }
}
