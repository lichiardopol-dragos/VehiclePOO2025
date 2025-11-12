abstract public class Vehicle {
    private int nrRoti;
    private String culoare;
    private String brand;
    private int anLansare;
    private int pret;
    private String tipCombustibil;
    private int putereMotor;
    private String tipCutieViteze;
    private int inaltime;
    private int capRezervor;
    private int vitMaxima;
    private int kmParcursi;
    private int nrLocuri;

    public Vehicle()
    {
        this.nrRoti = 0;
        this.culoare = "Rosu";
        this.brand = "Toyota";
        this.anLansare = 2009;
        this.pret = 0;
        this.tipCombustibil = "Benzina";
        this.putereMotor = 0;
        this.tipCutieViteze = "Manuala";
        this.inaltime = 0;
        this.capRezervor = 0;
        this.vitMaxima = 0;
        this.kmParcursi = 0;
        this.nrLocuri = 0;
    }

}