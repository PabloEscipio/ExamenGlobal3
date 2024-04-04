package apartado4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnergiaTest {


    @Test
    void costeConsumo() {
        Energia nevera = new Energia(0, 0, 0);
        for (int consumo = 0; consumo < 1000; consumo++) {
            for (double horas = 0; horas < 1000; horas += 0.5) {
                for (double precio = 0; precio < 250; precio += 0.1) {
                    nevera.setConsumoW(consumo);
                    nevera.setHorasUso(horas);
                    nevera.setPrecioKwHoras(precio);
                    assertEquals((consumo / 1000) * horas * precio * 1.21, nevera.costeConsumo());
                    assertNotNull(nevera.costeConsumo());
                }
            }
        }
    }
}