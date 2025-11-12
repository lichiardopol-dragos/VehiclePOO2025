public class ElectricBike extends Vehicle{
    
    private int acceleratie;

    public ElectricBike(){
        super();
        this.acceleratie=90;
    }

    public ElectricBike(int nrRoti, String culoare, String brand, int anLansare, int pret, String tipCombustibil, int putereMotor, String tipCutieViteze, int inaltime, int capRezervor, int vitMaxima, int kmParcursi, int nrLocuri, int acceleratie){
        super(nrRoti, culoare, brand, anLansare, pret, tipCombustibil, putereMotor, tipCutieViteze, inaltime, capRezervor, vitMaxima, kmParcursi, nrLocuri);
        this.acceleratie=acceleratie;
    }

    public ElectricBike(ElectricBike b){
        super(b);
        this.acceleratie=b.acceleratie;
    }

}
