package it.itispaleocapa.bonacinagiorgio;

public class Dirigente extends MembroPersonale
{

    public Dirigente(String cognome, String nome)
    {
        super(cognome,nome);
    }

    public void setTariffaOraria(int valore1)
    {
        this.tariffaOraria = valore1;
    }

    @Override
    public String toString()
    {
        return "Dirigente: " + super.toString();
    }
}