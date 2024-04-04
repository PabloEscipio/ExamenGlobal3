package apartado1;

public class ArbolFrutal {
    // Atributos
    private String especie;
    private short edad;
    private String fruto;

    // Constructores
    public ArbolFrutal(String especie) {
        this.especie = especie;
    }

    public ArbolFrutal(String especie, short edad, String fruto) {
        this.especie = especie;
        this.edad = edad;
        this.fruto = fruto;
    }

    // Getters & Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getFruto() {
        return fruto;
    }

    public void setFruto(String fruto) {
        this.fruto = fruto;
    }

    // toString
    public String toString() {
        return "Especie: " + especie + "\tEdad: " + edad + "\tFruto: " + fruto;
    }
}
