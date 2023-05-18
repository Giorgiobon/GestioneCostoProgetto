package it.itispaleocapa.bonacinagiorgio;

import java.util.*;

public abstract class Dirigente extends MembroPersonale
{
    public Dirigente(String cognome, String nome)
    {
        super(cognome,nome);
    }

    @Override
    public String toString() {
        return "Dirigente []";
    }
}