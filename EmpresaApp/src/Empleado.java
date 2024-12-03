public class Empleado {
    private String nombre;
    private String cedula;
    private double salario;
// pongo contructor ojo
    public Empleado(String nombre, String cedula, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
    }
// pongo getters ojo
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", Cédula='" + cedula + '\'' +
                ", Salario=" + salario +
                '}';
    }
}
