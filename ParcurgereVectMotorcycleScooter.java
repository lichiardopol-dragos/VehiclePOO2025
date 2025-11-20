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
        2, "Rosu", "CFMoto", 2005, 9991, "Motorina", 
        117, "Manuala", 106,38, 
        198, 89981, 2, "Lant", 
        "Hidraulica"
        );

        Motorcycle m3 = new Motorcycle(
        2, "Verde", "Laverda", 2021, 11130, "Benzina", 
        126, "Automata", 107, 55, 
        169, 49271, 1, "Lant", 
        "Hidraulica"
        );

        Motorcycle m4 = new Motorcycle(
        2, "Verde lime", "Kawasaki", 2022, 11248, "Benzina", 
        125, "Manuala", 73, 45, 
        191, 15893, 1, "Curea", 
        "Mecanica"
        );

        Motorcycle m5 = new Motorcycle(
        2, "Violet", "ABC", 2005, 13409, "Motorina", 
        144, "Automata", 110, 54, 
        178, 63211, 1, "Lant", 
        "Hidraulica"
        );

        Motorcycle m6 = new Motorcycle(
        2, "Alb", "BSA", 2018, 12664, "Benzina", 
        147, "Manuala", 106, 51, 
        224, 57020, 2, "Lant", 
        "Hidraulica"
        );

        Motorcycle m7 = new Motorcycle(
        2, "Negru", "Dollar", 2013, 14113, "Benzina", 
        101, "Automata", 108, 33, 
        231, 26890, 2, "Curea", 
        "Mecanica"
        );

        Motorcycle m8 = new Motorcycle(
        2, "Oranj", "Derbi", 2012, 10814, "Motorina", 
        125, "Automata", 55, 47, 
        229, 79483, 1, "Lant", 
        "Mecanica"
        );

        Motorcycle m9 = new Motorcycle(
        2, "Roz", "FN", 2019, 7333, "Benzina", 
        128, "Manuala", 100, 57, 
        213, 72221, 2, "Lant", 
        "Hidraulica"
        );

        Motorcycle m10 = new Motorcycle(
        2, "Gri", "FAMEL", 2021, 11507, "Motorina", 
        106, "Automata", 52, 37, 
        217, 0, 1, "Curea", 
        "Mecanica"
        );

        Scooter s1 = new Scooter(2, "Galben", "Jeep", 2023, 3000, "Electric",
         50, "Manuala", 140, 40,
        100, 0, 1, false, 
        200);

        Scooter s2 = new Scooter(2, "Verde", "Kymco", 2013, 5826, "Benzina",
         78, "Automata", 85, 41,
        121, 29231, 1, false, 
        181);

        Scooter s3 = new Scooter(3, "Gri", "Motosfera", 2017, 3333, "Electric",
         76, "Manuala", 108, 81,
        127, 95470, 1, true, 
        182);

        Scooter s4 = new Scooter(2, "Bej", "ZEEHO", 2020, 3617, "Benzina",
         78, "Automata", 80, 41,
        104, 55183, 1, false, 
        186);

        Scooter s5 = new Scooter(2, "Albastru inchis", "Kymco", 2015, 3986, "Electric",
         57, "Manuala", 106, 84,
        110, 3477, 2, true, 
        127);

        Scooter s6 = new Scooter(3, "Mov Galaxy", "Motosfera", 2023, 5678, "Electric",
         94, "Manuala", 128, 83,
        128, 80055, 1, true, 
        177);

        Scooter s7 = new Scooter(3, "Turcoaz", "ZEEHO", 2025, 6248, "Benzina",
         55, "Automata", 82, 66,
        116, 57121, 1, false, 
        146);

        Scooter s8 = new Scooter(2, "Visiniu", "Kymco", 2020, 4005, "Electric",
         72, "Manuala", 88, 82,
        111, 34076, 2, false, 
        135);

        Scooter s9 = new Scooter(3, "Vernil", "Jeep", 2020, 4805, "Electric",
         89, "Manuala", 130, 86,
        121, 9928, 1, true, 
        214);

        Scooter s10 = new Scooter(2, "Gri metalic", "Motosfera", 2014, 4186, "Benzina",
         77, "Automata", 108, 74,
        133, 35977, 2, true, 
        166);

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