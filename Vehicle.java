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

// GET

    public int getNrRoti(){
        return this.nrRoti;
    }

    public String getCuloare(){
        return this.culoare;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getAnLansare(){
        return this.anLansare;
    }

    public int getPret(){
        return this.pret;
    }

    public String getTipCombustibil(){
        return this.tipCombustibil;
    }

    public String getTipCutieViteze(){
        return this.tipCutieViteze;
    }

    public int getInaltime(){
        return this.inaltime;
    }

    public int getCapRezervor(){
        return this.capRezervor;
    }

    public int getVitMaxima(){
        return this.vitMaxima;
    }

    public int getKmParcursi(){
        return this.kmParcursi;
    }

    public int getNrLocuri(){
        return this.nrLocuri;
    }

// SET

    public void setNrRoti(int roti){
        this.nrRoti = roti;
    }

    public void setCuloare(String culoare){
        this.culoare = culoare;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setAnLansare(int anLansare){
        this.anLansare = anLansare;
    }

    public void setPret(int pret){
        this.pret = pret;
    }

    public void setTipCombustibil(String combustibil){
        this.tipCombustibil = combustibil;
    }

    public void setPutereMotor(int putereMotor){
        this.putereMotor = putereMotor;
    }

    public void setTipCutieViteze(String tipCutieViteze){
        this.tipCutieViteze = tipCutieViteze;
    }

    public void setInaltime(int inaltime){
        this.inaltime = inaltime;
    }

    public void setCapRezervor(int capRezervor){
        this.capRezervor = capRezervor;
    }

    public void setVitMaxima(int vitMaxima){
        this.vitMaxima = vitMaxima;
    }

    public void setKmParcursi(int kmParcursi){
        this.kmParcursi = kmParcursi;
    }
    
    public void setNrLocuri(int nrLocuri){
        this.nrLocuri = nrLocuri;
    }


}