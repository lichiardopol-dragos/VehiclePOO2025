public class Motorcycle extends Vehicle{
    //atribute private
    private String tipTransmisie;
    private String tipFrana;

    //constructor fara parametri
    public Motorcycle() {
        super();
        this.tipTransmisie = "Lant";
        this.tipFrana = "Standard";
    }


    //constructor cu toti parametrii
    public Motorcycle(int nrRoti, String culoare, String brand, int anLansare, int pret,
    String tipCombustibil, int putereMotor, String tipCutieViteze,
    int inaltime, int capRezervor, int vitMaxima,
    int kmParcursi, int nrLocuri,String tipTransmisie, String tipFrana) {
        super(nrRoti, culoare, brand, anLansare, pret, tipCombustibil, putereMotor,
                tipCutieViteze, inaltime, capRezervor, vitMaxima, kmParcursi, nrLocuri);
        //setam cele doua atribute private
        this.tipTransmisie = tipTransmisie;
        this.tipFrana = tipFrana;
    }

    //constructor de copiere
    public Motorcycle(Motorcycle b)
    {
        super(b);
        this.tipTransmisie = b.tipTransmisie;
        this.tipFrana = b.tipFrana;
    }
    //metoda toString
@Override
public String toString(){
        return super.toString() +
                "tip transmisie: "+ tipTransmisie+
                "\ntip frana: "+tipFrana;
}

    //gettere si settere pentru cele 2 atribute private
    public String getTipTransmisie() {
        return tipTransmisie;
    }
    public void setTipTransmisie(String tipTransmisie) {
        this.tipTransmisie = tipTransmisie;
    }
    public String getTipFrana() {
        return tipFrana;
    }
    public void setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
    }


}