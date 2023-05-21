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

    public void aggiungiFunzionario(Funzionario x) throws membroGiàEsistenteException
    {
        Predicate <MembroPersonale> p = e ->{
            if(e.nome == x.nome && e.cognome == x.cognome){
                return true;
            }else{
                return false;
            }
        };

        Consumer <MembroPersonale> c = e ->{
            try {
                throw new membroGiàEsistenteException();
            } catch (membroGiàEsistenteException e1) {
                e1.printStackTrace();
            }
        };

        membriProgetto.stream().filter(p).forEach(c);
        membriProgetto.add(x);
    }

    public void aggiungiTecnico(Tecnico x) throws membroGiàEsistenteException
    {
        Predicate <MembroPersonale> p = e ->{
            if(e.nome == x.nome && e.cognome == x.cognome){
                return true;
            }else{
                return false;
            }
        };

        Consumer <MembroPersonale> c = e ->{
            try {
                throw new membroGiàEsistenteException();
            } catch (membroGiàEsistenteException e1) {
                e1.printStackTrace();
            }
        };

        membriProgetto.stream().filter(p).forEach(c);
        membriProgetto.add(x);
    }

    public void aggiungiDirigente(Dirigente x) throws membroGiàEsistenteException
    {
        Predicate <MembroPersonale> p = e ->{
            if(e.nome == x.nome && e.cognome == x.cognome){
                return false;
            }else{
                return true;
            }
        };

        Consumer <MembroPersonale> c = e ->{
            try {
                throw new membroGiàEsistenteException();
            } catch (membroGiàEsistenteException e1) {
                e1.printStackTrace();
            }
        };

        membriProgetto.stream().filter(p).forEach(c);
        membriProgetto.add(x);
    }

    public int calcolaCostoProgetto() throws membroGiàEsistenteException
    {
        this.costoProgetto = 0;
        Consumer <MembroPersonale> c = e ->{
            costoProgetto += e.tariffaOraria*oreProgetto;
        };

        membriProgetto.stream().forEach(c);
        return costoProgetto;
    }
}
