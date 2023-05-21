package it.itispaleocapa.bonacinagiorgio;

import java.util.*;

public class Funzionario extends MembroPersonale
{

    boolean tipo;// true = senior, false = junior

    public Funzionario(String cognome, String nome, boolean tipo) 
    {
        super(cognome, nome);
        this.tipo = tipo;
    }

    public void setTariffaOraria(int valore1, int valore2)
    {
        if(!tipo){
            this.tariffaOraria = valore1;
        }else{
            this.tariffaOraria = valore2;
        }
    }
    
}
