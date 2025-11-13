public class ATV extends Vehicle implements VanzareVehicule{

    private boolean isVinci;

    public ATV(){
        super();
        this.isVinci=false;
    }

    public ATV(int nrRoti, String culoare, String brand, int anLansare, int pret, String tipCombustibil, int putereMotor, String tipCutieViteze, int inaltime, int capRezervor, int vitMaxima, int kmParcursi, int nrLocuri, boolean isVinci){
        super(nrRoti, culoare, brand, anLansare, pret, tipCombustibil, putereMotor, tipCutieViteze, inaltime, capRezervor, vitMaxima, kmParcursi, nrLocuri);
        this.isVinci=isVinci;
    }

    public ATV(ATV b){
        super(b);
        this.isVinci=b.isVinci;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n" +
        "Are vinci: " + this.isVinci + "\n\n";
    }

    public boolean getIsVinci(){
        return this.isVinci;
    }

    public void setIsVinci(boolean isVinci){
        this.isVinci=isVinci;
    }
    


}