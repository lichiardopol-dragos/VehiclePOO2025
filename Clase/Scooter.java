package Clase;
public class Scooter extends Vehicle{

    //atribute private
    private boolean hasStorageUnderSeat;
    private int dimensiuneRoata;

    //constructor fara parametri
    public Scooter() {
        super();
        this.hasStorageUnderSeat = true;
        this.dimensiuneRoata = 12;
    }


    //constructor cu toti parametrii
public Scooter(int nrRoti, String culoare, String brand, int anLansare, int pret,
               String tipCombustibil, int putereMotor, String tipCutieViteze,
               int inaltime, int capRezervor, int vitMaxima,
               int kmParcursi, int nrLocuri, boolean hasStorageUnderSeat, int dimensiuneRoata) {
    super(nrRoti, culoare, brand, anLansare, pret, tipCombustibil, putereMotor,
            tipCutieViteze, inaltime, capRezervor, vitMaxima, kmParcursi, nrLocuri);
    this.hasStorageUnderSeat = hasStorageUnderSeat;
    this.dimensiuneRoata = dimensiuneRoata;
}

//constructor de copiere
    public Scooter(Scooter b)
    {
        super(b);
        this.hasStorageUnderSeat = b.hasStorageUnderSeat;
        this.dimensiuneRoata = b.dimensiuneRoata;
}

//metoda toString

@Override
public String toString() {
        return super.toString() +
                "has storage under seat: "+hasStorageUnderSeat+
                "\ndimensiune roata: "+dimensiuneRoata;
}
    //gettere si settere pentru cele doua atribute private
    public boolean isHasStorageUnderSeat(){
        return hasStorageUnderSeat;
    }
    public void setHasStorageUnderSeat(boolean hasStorageUnderSeat){
        this.hasStorageUnderSeat = hasStorageUnderSeat;
    }
    public int getDimensiuneRoata(){
        return dimensiuneRoata;
    }
    public void setDimensiuneRoata(int dimensiuneRoata){
        this.dimensiuneRoata = dimensiuneRoata;
    }

}