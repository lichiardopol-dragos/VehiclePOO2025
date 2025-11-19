import java.util.*;

import Clase.Motorcycle;
import Clase.Vehicle;

public class Testare {
    public static void main(String[] args) {

        // cream un obiect tip Motorcycle
        Motorcycle m1 = new Motorcycle(
                2, "Rosu", "Yamaha", 2022, 7500, "Benzina", 110,
                "Manuala", 80, 15, 220, 15000, 2,
                "Lant", "ABS"
        );
        //testam toString
        System.out.println("\n\tTestare toString()");
        System.out.println(m1.toString());
        //testam metode din interfata
        System.out.println("\n\tTestam interfata");

        boolean esteSecondHand=m1.esteSH();
        System.out.println("Este Second Hand? "+esteSecondHand);

        int ImpozitAnual=m1.calcImpozitAnual();
        System.out.println("Impozit Anual: "+ImpozitAnual);

        //testam un getter din Vehicle si unul din Motorcycle
        System.out.println("\n\tTestare Gettere");
        System.out.println("Brand:"+m1.getBrand());
        System.out.println("Tip frana: "+m1.getTipFrana()+"\n");

        //definire ArrayList
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(10);
        vehicles.add(m1);

        //testare metoda 1
        System.out.println("\tFiltru de cautare interval de pret si an vechime");
       System.out.println(PretBunPentruAn(vehicles));

       //testare metoda 2
        System.out.println("\tFiltru de cautare dupa brand si cutie de viteze");
        System.out.println(CautareDupaBrandSiCutieViteze(vehicles));
    }
    
}
