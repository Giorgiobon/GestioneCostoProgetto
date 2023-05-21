package it.itispaleocapa.bonacinagiorgio;

import java.util.*;

public class Tecnico extends MembroPersonale
{
    public boolean areaCompetenza;// true = informatica/telecomunicazioni, false = elettronica/automazione


    public Tecnico(String cognome, String nome, int tariffaOraria)
    {
        super(cognome, nome);
    }

    public void setTariffaOraria(int valore1, int valore2)
    {
        if(!areaCompetenza){
            this.tariffaOraria = valore1;
        }else{
            this.tariffaOraria = valore2;
        }
    }
}
