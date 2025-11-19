import java.util.*;

import Clase.Motorcycle;
import Clase.Scooter;
import Clase.Vehicle;
import Clase_ajutatoare_metode.MetArrayList;

public class ParcurgereVectMotorcycleScooter {
    public static void main(String[] args) {

        Motorcycle m1 = new Motorcycle(
        2, "Albastru", "Yamaha", 2005, 6000, "Benzina", 
        140, "Automata", 70, 40, 
        200, 0, 1, "Lant", 
        "Hidraulica"
        );
                
        Motorcycle m2 = new Motorcycle(
        2, "Albastru", "Yamaha", 2005, 6000, "Benzina", 
        140, "Automata", 70, 40, 
        200, 0, 1, "Lant", 
        "Hidraulica"
        );

        Motorcycle m3 = new Motorcycle(
        2, "Albastru", "Yamaha", 2005, 6000, "Benzina", 
        140, "Automata", 70, 40, 
        200, 0, 1, "Lant", 
        "Hidraulica"
        );

        Motorcycle m4 = new Motorcycle(
        2, "Albastru", "Yamaha", 2005, 6000, "Benzina", 
        140, "Automata", 70, 40, 
        200, 0, 1, "Lant", 
        "Hidraulica"
        );

        Motorcycle m5 = new Motorcycle(
        2, "Albastru", "Yamaha", 2005, 6000, "Benzina", 
        140, "Automata", 70, 40, 
        200, 0, 1, "Lant", 
        "Hidraulica"
        );

        Motorcycle m6 = new Motorcycle(
        2, "Albastru", "Yamaha", 2005, 6000, "Benzina", 
        140, "Automata", 70, 40, 
        200, 0, 1, "Lant", 
        "Hidraulica"
        );

        Motorcycle m7 = new Motorcycle(
        2, "Albastru", "Yamaha", 2005, 6000, "Benzina", 
        140, "Automata", 70, 40, 
        200, 0, 1, "Lant", 
        "Hidraulica"
        );

        Motorcycle m8 = new Motorcycle(
        2, "Albastru", "Yamaha", 2005, 6000, "Benzina", 
        140, "Automata", 70, 40, 
        200, 0, 1, "Lant", 
        "Hidraulica"
        );

        Motorcycle m9 = new Motorcycle(
        2, "Albastru", "Yamaha", 2005, 6000, "Benzina", 
        140, "Automata", 70, 40, 
        200, 0, 1, "Lant", 
        "Hidraulica"
        );

        Motorcycle m10 = new Motorcycle(
        2, "Albastru", "Yamaha", 2005, 6000, "Benzina", 
        140, "Automata", 70, 40, 
        200, 0, 1, "Lant", 
        "Hidraulica"
        );

        Scooter s1 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        Scooter s2 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        Scooter s3 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        Scooter s4 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        Scooter s5 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        Scooter s6 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        Scooter s7 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        Scooter s8 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        Scooter s9 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        Scooter s10 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        System.out.println("\n\tTestare met toString()");
        System.out.println(m1.toString());

        System.out.println("\n\tTestare met interfata");
        System.out.println("Este m1 Second Hand?: " + m1.esteSH());
        System.out.println("Impozitul anual pentru m1: " + m1.calcImpozitAnual());

        System.out.println("\n\tTestare Gettere si Settere");
        System.out.println("Brand m1: " + m1.getBrand());
        System.out.println("Tip frana m1: " + m1.getTipFrana());
        m1.setNrLocuri(2);
        System.out.println("Nr de locuri m1 a fost schimbat in: " + m1.getNrLocuri());

        ArrayList<Vehicle> motorcycleNscooter = new ArrayList<Vehicle>(20);
        motorcycleNscooter.add(m1);
        motorcycleNscooter.add(m2);
        motorcycleNscooter.add(m3);
        motorcycleNscooter.add(m4);
        motorcycleNscooter.add(m5);
        motorcycleNscooter.add(m6);
        motorcycleNscooter.add(m7);
        motorcycleNscooter.add(m8);
        motorcycleNscooter.add(m9);
        motorcycleNscooter.add(m10);

        motorcycleNscooter.add(s1);
        motorcycleNscooter.add(s2);
        motorcycleNscooter.add(s3);
        motorcycleNscooter.add(s4);
        motorcycleNscooter.add(s5);
        motorcycleNscooter.add(s6);
        motorcycleNscooter.add(s7);
        motorcycleNscooter.add(s8);
        motorcycleNscooter.add(s9);
        motorcycleNscooter.add(s10);

        MetArrayList.parcurgereVector(motorcycleNscooter, "Motorcycles din vector:", "Scooters din vector:");

        System.out.println("\tFiltru de cautare interval de pret si an vechime");
        System.out.println(MetArrayList.PretBunPentruAn(motorcycleNscooter));

        System.out.println("\tFiltru de cautare dupa brand si cutie de viteze");
        System.out.println(MetArrayList.CautareDupaBrandSiCutieViteze(motorcycleNscooter));

    }
}