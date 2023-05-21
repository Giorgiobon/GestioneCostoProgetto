package it.itispaleocapa.bonacinagiorgio;

import java.util.*;

public class Progetto
{
    public LinkedList<MembroPersonale> membriProgetto = new LinkedList<>();

    public void aggiungiFunzionario(String cognome, String nome, boolean tipo)
    {
        membriProgetto.add(new Funzionario(cognome, nome, tipo));
    }

    public void aggiungiTecnico(String cognome, String nome, boolean tipo)
    {
        membriProgetto.add(new Tecnico(cognome, nome, tipo));
    }

    public void aggiungiDirigente(String cognome, String nome)
    {
        membriProgetto.add(new Dirigente(cognome, nome))
    }
}
