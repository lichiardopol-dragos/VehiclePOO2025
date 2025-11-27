package Clase;
public class Car extends Vehicle{

    private int accel0100;
    private int capPortbagaj;
    private String tipCaroserie;

    public Car()
    {
        super();
        this.accel0100 = 0;
        this.capPortbagaj = 0;
        this.tipCaroserie = "Hitchback";
    }

    public Car(int nrRoti, String culoare, String brand, int anLansare, int pret, String tipCombustibil, int putereMotor, String tipCutieViteze, int inaltime, int capRezervor, int vitMaxima, int kmParcursi, int nrLocuri,
    int accel0100, int capPortbagaj, String tipCaroserie)
    {
        super(nrRoti, culoare, brand, anLansare, pret, tipCombustibil, putereMotor, tipCutieViteze, inaltime, capRezervor, vitMaxima, kmParcursi, nrLocuri);
        this.accel0100 = accel0100;
        this.capPortbagaj = capPortbagaj;
        this.tipCaroserie = tipCaroserie;
    }

    public Car(Car b)
    {
        super(b);
        this.accel0100 = b.accel0100;
        this.capPortbagaj = b.capPortbagaj;
        this.tipCaroserie = b.tipCaroserie;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n" +
        "Acceleratie 0-100: " + this.accel0100 + "\n" +
        "Capacitate portbagaj: " + this.capPortbagaj + "\n" +
        "Tip caroserie: " + this.tipCaroserie + "\n\n";
    }
// GET

    public int getAccel0100(){
        return this.accel0100;
    }

    public int getCapPortbaj(){
        return this.capPortbagaj;
    }

    public String getTipCaroserie(){
        return this.tipCaroserie;
    }

// SET

    public void setAccel0100(int accel0100){
        this.accel0100 = accel0100;
    }

    public void setCapPortbaj(int capPortbagaj){
        this.capPortbagaj = capPortbagaj;
    }

    public void setTipCaroserie(String tipCaroserie){
        this.tipCaroserie = tipCaroserie;
    }
}
