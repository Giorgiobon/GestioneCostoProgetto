package it.itispaleocapa.bonacinagiorgio;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MembroPersonale
{
    int codice;
    String cognome;
    String nome;
    int annoAssunzione;

    public MembroPersonale(int codice, String cognome, String nome)
    {
        this.codice = codice;
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
}
