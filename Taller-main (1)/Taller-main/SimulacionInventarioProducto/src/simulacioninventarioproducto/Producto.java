package simulacioninventarioproducto;

public class Producto {
    private String nombre;
    private double cantidad;
    private double precio;

    public Producto(String nombre, double cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio: " + precio;
    }
}
