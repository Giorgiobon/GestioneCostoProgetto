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

    public void aggiungiFunzionario(Funzionario x)
    {
        membriProgetto.add(x);
    }

    public void aggiungiTecnico(Tecnico x)
    {
        membriProgetto.add(x);
    }

    public void aggiungiDirigente(Dirigente x)
    {
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
