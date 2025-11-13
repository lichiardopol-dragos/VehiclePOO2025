public class ElectricBike extends Vehicle implements VanzareVehicule{
    
    private int accel0100;

    public ElectricBike(){
        super();
        this.accel0100=90;
    }

    public ElectricBike(int nrRoti, String culoare, String brand, int anLansare, int pret, String tipCombustibil, int putereMotor, String tipCutieViteze, int inaltime, int capRezervor, int vitMaxima, int kmParcursi, int nrLocuri, int accel0100){
        super(nrRoti, culoare, brand, anLansare, pret, tipCombustibil, putereMotor, tipCutieViteze, inaltime, capRezervor, vitMaxima, kmParcursi, nrLocuri);
        this.accel0100=accel0100;
    }

    public ElectricBike(ElectricBike b){
        super(b);
        this.accel0100=b.accel0100;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n" +
        "Acceleratie 0-100: " + this.accel0100 + "\n\n";
    }

    public int getAccel0100(){
        return this.accel0100;
    }

    public void setAccel0100(int accel0100){
        this.accel0100=accel0100;
    }



}
