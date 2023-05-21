package it.itispaleocapa.bonacinagiorgio;

import java.util.*;
import java.util.function.*;

public class Progetto
{
    public LinkedList<MembroPersonale> membriProgetto = new LinkedList<>();
    public int oreProgetto;
    public int costoProgetto;

    public Progetto(int oreProgetto)
    {
        this.membriProgetto  = new LinkedList<>();
        this.oreProgetto = oreProgetto;
    }

    public void aggiungiFunzionario(String cognome, String nome, boolean tipo, int valore1, int valore2)
    {
        Funzionario x = new Funzionario(cognome, nome, tipo);
        x.setTariffaOraria(valore1, valore2);
        membriProgetto.add(x);
    }

    public void aggiungiTecnico(String cognome, String nome, boolean tipo, int valore1, int valore2)
    {
        Tecnico x = new Tecnico(cognome, nome, tipo);
        x.setTariffaOraria(valore1, valore2);
        membriProgetto.add(x);
    }

    public void aggiungiDirigente(String nome, String cognome, int valore1)
    {
        Dirigente x = new Dirigente(cognome, nome);
        x.setTariffaOraria(valore1);
        membriProgetto.add(x);
    }

    public int calcolaCostoProgetto()
    {
        this.costoProgetto = 0;
        Consumer <MembroPersonale> c = e ->{
            costoProgetto += e.tariffaOraria*oreProgetto;
        };

        membriProgetto.stream().forEach(c);
        return costoProgetto;
    }
}
