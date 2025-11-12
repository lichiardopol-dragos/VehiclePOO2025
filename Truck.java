public class Truck extends Vehicle{
    private int capPortbagaj;
    private String tipCaroserie;

    public Truck()
    {
        super();
        this.capPortbagaj = 0;
        this.tipCaroserie = "Frigorific";
    }

    public Truck(int nrRoti, String culoare, String brand, int anLansare, int pret, String tipCombustibil, int putereMotor, String tipCutieViteze, int inaltime, int capRezervor, int vitMaxima, int kmParcursi, int nrLocuri,
    int capPortbagaj, String tipCaroserie)
    {
        super(nrRoti, culoare, brand, anLansare, pret, tipCombustibil, putereMotor, tipCutieViteze, inaltime, capRezervor, vitMaxima, kmParcursi, nrLocuri);
        this.capPortbagaj = capPortbagaj;
        this.tipCaroserie = tipCaroserie;
    }

    public Truck(Truck b)
    {
        super(b);
        this.capPortbagaj = b.capPortbagaj;
        this.tipCaroserie = b.tipCaroserie;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n" +
        "Capacitate portbagaj: " + this.capPortbagaj + "\n" +
        "Tip caroserie: " + this.tipCaroserie + "\n\n";
    }

}
