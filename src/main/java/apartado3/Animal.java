package apartado3;

public class Animal {
    // Atributos
    private int crotal;
    private int edad;
    private int produccion;

    // Constructores

    public Animal(int crotal, int edad, int produccion) {
        this.crotal = crotal;
        this.edad = edad;
        this.produccion = produccion;
    }

    // Getters & Setters
    public int getCrotal() {
        return crotal;
    }

    public void setCrotal(int crotal) {
        this.crotal = crotal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    // toString
    public String toString() {
        return "Crotal: " + crotal + "\tEdad: " + edad + "\tProducción: " + produccion;
    }
    // Metodos
}
