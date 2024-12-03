import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private String email;
    private List<Empleado> empleados;

    
    
    // constructor
    public Empresa(String nombre, String ruc, String direccion, String email) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.email = email;
        this.empleados = new ArrayList<>();   // arraylist tiene la funcion de almacenar emppleados en la clase
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Lista de Empleados de la Empresa " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}
