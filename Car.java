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
}
