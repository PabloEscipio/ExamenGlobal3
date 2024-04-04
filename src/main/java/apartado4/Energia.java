package apartado4;

/**
 * Calcula el coste en Euros del consumo de electrodoméstico durante un número determinado de horas.
 */
public class Energia {
    // Atributos
    private int consumoW;
    private double horasUso;
    private double precioKwHoras;

    // Constructores

    /**
     * Crea un objeto de la clase
     *
     * @param consumoW      - double
     * @param horasUso      - double
     * @param precioKwHoras - double
     */
    public Energia(int consumoW, double horasUso, double precioKwHoras) {
        this.consumoW = consumoW;
        this.horasUso = horasUso;
        this.precioKwHoras = precioKwHoras;
    }

    // Getters & Setters

    /**
     * Devuelve el consumo del electrodoméstico.
     *
     * @return consumoW - int
     */
    public int getConsumoW() {
        return consumoW;
    }

    /**
     * Cambia el consumo del electrodoméstico.
     *
     * @param consumoW - int
     */
    public void setConsumoW(int consumoW) {
        this.consumoW = consumoW;
    }

    /**
     * Devuelve las horas de uso.
     *
     * @return horasUso - double
     */
    public double getHorasUso() {
        return horasUso;
    }

    /**
     * Cambia cuantas horas se usa el electrodoméstico.
     *
     * @param horasUso - double
     */
    public void setHorasUso(double horasUso) {
        this.horasUso = horasUso;
    }

    /**
     * Devuelve el precio del Kw/h.
     *
     * @return precioKwHoras - double
     */
    public double getPrecioKwHoras() {
        return precioKwHoras;
    }

    /**
     * Cambia el precio del Kw/h.
     *
     * @param precioKwHoras - double
     */
    public void setPrecioKwHoras(double precioKwHoras) {
        this.precioKwHoras = precioKwHoras;
    }

    // Metodos

    // costeConsumo

    /**
     * Calcula el coste con la fórmula "(consumo/1000)*horas*precio+IVA(21%)"
     *
     * @return Coste en Euros - double
     */
    public double costeConsumo() {
        return consumoW / 1000 * horasUso * precioKwHoras * 1.21;
    }
}
