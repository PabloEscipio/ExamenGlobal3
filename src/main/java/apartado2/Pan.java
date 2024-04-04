package apartado2;

public class Pan {
    // Atributos
    protected String nombre;
    protected float precio;

    // Constructores
    public Pan(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // toString
    public String toString() {
        return "Nombre: " + nombre + "\tPrecio: " + precio;
    }
    // Metodos
}
