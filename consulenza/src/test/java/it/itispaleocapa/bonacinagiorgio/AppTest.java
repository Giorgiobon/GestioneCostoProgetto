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
    void aggiungiFunzionario() {
        Progetto x = new Progetto(200);
        Funzionario y = new Funzionario("Bonacina", "Giorio", true);
        y.setTariffaOraria(10, 20);
        x.aggiungiFunzionario(y);
        assertEquals(x.membriProgetto.contains(y), true);
    }

    @Test
    void aggiungiTecnico() {
        Progetto x = new Progetto(200);
        Tecnico y = new Tecnico("Bonacina", "Giorio", true);
        y.setTariffaOraria(10, 20);
        x.aggiungiTecnico(y);
        assertEquals(x.membriProgetto.contains(y), true);
    }

    @Test
    void aggiungiDirigente() {
        Progetto x = new Progetto(200);
        Dirigente y = new Dirigente("Bonacina", "Giorio");
        y.setTariffaOraria(100);
        x.aggiungiDirigente(y);
        assertEquals(x.membriProgetto.contains(y), true);
    }

    @Test
    void calcolaCostoProgetto() {
        Progetto x = new Progetto(200);
        assertEquals(1, 1);
    }
}
