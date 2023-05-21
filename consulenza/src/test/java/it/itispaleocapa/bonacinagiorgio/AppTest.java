package it.itispaleocapa.bonacinagiorgio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testAggiungiFunzionario() {
        Progetto x = new Progetto(200);
        Funzionario y = new Funzionario("Bonacina", "Giorio", true);
        y.setTariffaOraria(10, 20);
        x.aggiungiFunzionario(y);
        assertEquals(true, x.membriProgetto.contains(y));
    }

    @Test
    void testAggiungiTecnico() {
        Progetto x = new Progetto(200);
        Tecnico y = new Tecnico("Bonacina", "Giorio", true);
        y.setTariffaOraria(10, 20);
        x.aggiungiTecnico(y);
        assertEquals(true, x.membriProgetto.contains(y));
    }

    @Test
    void testAggiungiDirigente() {
        Progetto x = new Progetto(200);
        Dirigente y = new Dirigente("Bonacina", "Giorio");
        y.setTariffaOraria(100);
        x.aggiungiDirigente(y);
        assertEquals(true, x.membriProgetto.contains(y));
    }

    @Test
    void testCalcolaCostoProgetto() {
        Progetto x = new Progetto(200);

        Funzionario y = new Funzionario("Bonacina", "Giorio", true);
        y.setTariffaOraria(10, 20);
        x.aggiungiFunzionario(y);

        Funzionario z = new Funzionario("Bonacina", "Giorio", false);
        z.setTariffaOraria(10, 20);
        x.aggiungiFunzionario(z);

        Tecnico ay = new Tecnico("Bonacina", "Giorio", true);
        ay.setTariffaOraria(10, 20);
        x.aggiungiTecnico(ay);

        Dirigente b = new Dirigente("Bonacina", "Giorio");
        b.setTariffaOraria(100);
        x.aggiungiDirigente(b);

        assertEquals(30000, x.calcolaCostoProgetto());
    }
}
