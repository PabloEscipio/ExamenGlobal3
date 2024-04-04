package apartado2;

public class PanDulce extends Pan {
    // Atributos
    private int gAzucar;

    // Constructores

    public PanDulce(String nombre, float precio, int gAzucar) {
        super(nombre, precio);
        this.gAzucar = gAzucar;
    }

    // Getters & Setters
    public int getgAzucar() {
        return gAzucar;
    }

    public void setgAzucar(int gAzucar) {
        this.gAzucar = gAzucar;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\tCantidad de azucar: " + gAzucar + " g";
    }
    // Metodos
}
