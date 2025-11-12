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
    
    public Vehicle(int nrRoti, String culoare, String brand, int anLansare, int pret, String tipCombustibil, int putereMotor, String tipCutieViteze, int inaltime, int capRezervor, int vitMaxima, int kmParcursi, int nrLocuri)
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
        this.nrRoti = b.nrRoti;
        this.culoare = b.culoare;
        this.brand = b.brand;
        this.anLansare = b.anLansare;
        this.pret = b.pret;
        this.tipCombustibil = b.tipCombustibil;
        this.putereMotor = b.putereMotor;
        this.tipCutieViteze = b.tipCutieViteze;
        this.inaltime = b.inaltime;
        this.capRezervor = b.capRezervor;
        this.vitMaxima = b.vitMaxima;
        this.kmParcursi = b.kmParcursi;
        this.nrLocuri = b.nrLocuri;
    }

    @Override
    public String toString()
    {
        return "Nr roti: " + this.nrRoti + "\n" +
        "Culoare: " + this.culoare + "\n" +
        "Brand: " + this.brand + "\n" +
        "An lansare: " + this.anLansare + "\n" +
        "Pret: " + this.pret + "\n" +
        "Tip combustibil: " + this.tipCombustibil + "\n" +
        "Putere motor: " + this.putereMotor + "\n" +
        "Tip cutie viteze: " + this.tipCutieViteze + "\n" +
        "Inaltime: " + this.inaltime + "\n" +
        "Capacitate rezervor: " + this.capRezervor + "\n" +
        "Viteza maxima: " + this.vitMaxima + "\n" +
        "Kilometri parcursi: " + this.kmParcursi + "\n" +
        "Nr locuri: " + this.nrLocuri + "\n";
    }
}