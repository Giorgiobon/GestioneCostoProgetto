package it.itispaleocapa.bonacinagiorgio;

public class Tecnico extends MembroPersonale
{
    public String areaCompetenza="";

    public Tecnico(String cognome, String nome, int tariffaOraria, String areaCompetenza)
    {
        super(cognome, nome);
        this.areaCompetenza = areaCompetenza;
    }
}
