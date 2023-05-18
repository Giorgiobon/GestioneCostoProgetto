package it.itispaleocapa.bonacinagiorgio;

import java.util.*;

public abstract class MembroPersonale
{
    int codice;
    String cognome;
    String nome;
    int annoAssunzione;

    public MembroPersonale(String cognome, String nome)
    {
        this.codice = produciCodice(cognome, nome);
        this.cognome = cognome;
        this.nome= nome;
        Date x = new Date();
        this.annoAssunzione = x.getYear();
    }

    public int calcolaTempoTrascorsoAssunzione()
    {
        Date x = new Date();
        int dataCorrente = x.getYear();
        return dataCorrente-this.annoAssunzione;
    }

    public int produciCodice(String cognome, String nome)
    {
        String nuovoIdentificativo = nome+cognome;
        return nuovoIdentificativo.hashCode();
    }
}
