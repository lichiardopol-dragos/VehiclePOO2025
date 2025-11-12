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
    
    public Vehicle(int nrRoti, String culoare, String brand, int anLansare, int pret, String combustibil, int putereMotor, String tipCutieViteze, int inaltime, int capRezervor, int vitMaxima, int kmParcursi, int nrLocuri)
    {
        this.nrRoti = nrRoti;
        this.culoare = culoare;
        this.brand = brand;
        this.anLansare = anLansare;
        this.pret = pret;
        this.tipCombustibil = tipCombustibil;
        this.putereMotor = putereMotor;
        this.tipCutieViteze = tipCutieViteze;
        this.inaltime = inaltime;
        this.capRezervor = capRezervor;
        this.vitMaxima = vitMaxima;
        this.kmParcursi = kmParcursi;
        this.nrLocuri = nrLocuri;
    }

    public Vehicle(Vehicle b)
    {
        Vehicle(b.nrRoti, b.culoare, b.brand, b.anLansare, b.pret, b.tipCombustibil, b.putereMotor, b.tipCutieViteze, b.inaltime, b.capRezervor, b.vitMaxima, b.kmParcursi, b.nrLocuri);
    }

}