package it.itispaleocapa.bonacinagiorgio;

public class Tecnico extends MembroPersonale
{
    public boolean areaCompetenza;// true = informatica/telecomunicazioni, false = elettronica/automazione


    public Tecnico(String cognome, String nome, boolean tipo)
    {
        super(cognome, nome);
        this.areaCompetenza =tipo;
    }

    public void setTariffaOraria(int valore1, int valore2)
    {
        if(!areaCompetenza){
            this.tariffaOraria = valore1;
        }else{
            this.tariffaOraria = valore2;
        }
    }

    @Override
    public String toString()
    {
        return "Tecnico: " + super.toString() + " area competenza: "+areaCompetenza;
    }
}
