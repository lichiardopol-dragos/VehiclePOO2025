import java.util.*;

import Clase.Car;
import Clase.Truck;
import Clase.Vehicle;
import Clase_ajutatoare_metode.MetArrayList;

public class ParcurgereVectCarTruck {
    public static void main(String[] args) {

        Car c1 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");
                
        Car c2 = new Car(4, "Oranj", "Hyundai", 2010, 8500, "Benzina",
        180, "Automata", 145, 34, 
        238, 29056, 5,
        8, 14, "Bicorp");

        Car c3 = new Car(4, "Violet", "Peugeot", 2005, 7000, "Electrica",
        130, "Manuala", 186, 33, 
        221, 39172, 4,
        6, 12, "Hitchback");

        Car c4 = new Car(4, "Cyan", "Toyota", 2013, 14000, "Benzina",
        135, "Automata", 105, 32, 
        152, 7787, 6,
        9, 15, "Hitchback");

        Car c5 = new Car(4, "Turcoaz", "Tesla", 2018, 50000, "Electrica",
        195, "Automata", 107, 33, 
        162, 90102, 2,
        10, 14, "Hitchback");

        Car c6 = new Car(4, "Alb", "Renault", 2012, 18000, "Benzina",
        183, "Manuala", 143, 24, 
        175, 76573, 3,
        8, 10, "Bicorp");

        Car c7 = new Car(4, "Visiniu", "Chevrolet", 2003, 10000, "Benzina",
        247, "Automata", 180, 20, 
        235, 19408, 6,
        8, 10, "Bicorp");

        Car c8 = new Car(4, "Galben", "Honda", 2009, 3000, "Benzina",
        134, "Manuala", 119, 27, 
        201, 8252, 4,
        10, 12, "Hitchback");

        Car c9 = new Car(4, "Gri inchis", "Fiat", 2010, 11000, "Motorina",
        242, "Manuala", 166, 35, 
        211, 5453, 5,
        10, 13, "Hitchback");

        Car c10 = new Car(4, "Verde", "Kia", 2020, 44000, "Motorina",
        231, "Automata", 152, 28, 
        120, 12037, 4,
        9, 15, "Bicorp");

        Truck t1 = new Truck(6, "Gri", "DAF", 2006, 30000, "Benzina",
         50, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

        Truck t2 = new Truck(4, "Negru", "DAF", 2021, 34311, "Benzina",
         93, "Manuala", 116, 84, 
         176, 39067, 1, 555, 
         "Inchis");

        Truck t3 = new Truck(4, "Gri", "Nissan", 2023, 32689, "Motorina",
         130, "Manuala", 104, 100, 
         159, 92556, 2, 879, 
         "Special");

        Truck t4 = new Truck(4, "Rosu", "Iveco", 2008, 30648, "Motorina",
         75, "Semi-Automata", 125, 53, 
         205, 68597, 1, 530, 
         "Deschis");

        Truck t5 = new Truck(4, "Galben", "DAF", 2007, 28591, "Benzina",
         120, "Manuala", 101, 95, 
         210, 83246, 1, 721, 
         "Inchis");

        Truck t6 = new Truck(6, "Albastru", "Volvo", 2016, 25840, "Benzina",
         90, "Manuala", 119, 93, 
         202, 49752, 2, 644, 
         "Inchis");

        Truck t7 = new Truck(4, "Gri", "Nissan", 2015, 30580, "Motorina",
         138, "Semi-Automata", 137, 88, 
         158, 71714, 1, 622, 
         "Deschis");

        Truck t8 = new Truck(4, "Violet", "DAF", 2006, 31460, "Benzina",
         62, "Manuala", 146, 100, 
         180, 71111, 2, 758, 
         "Inchis");

        Truck t9 = new Truck(6, "Gri", "DAF", 2025, 29270, "Motorina",
         138, "Manuala", 119, 95, 
         180, 63784, 1, 915, 
         "Inchis");

        Truck t10 = new Truck(6, "Alb", "Fiat", 2006, 25862, "Benzina",
         68, "Semi-Automata", 100, 53, 
         180, 33395, 1, 720, 
         "Deschis");

        System.out.println("\n\tTestare met toString()");
        System.out.println(c1.toString());

        System.out.println("\n\tTestare met interfata");
        System.out.println("Este c1 Second Hand?: " + c1.esteSH());
        System.out.println("Impozitul anual pentru c1: " + c1.calcImpozitAnual());

        System.out.println("\n\tTestare Gettere si Settere");
        System.out.println("Brand c1: " + c1.getBrand());
        System.out.println("Aceeleratie 0-100 c1: " + c1.getAccel0100());
        c1.setCuloare("Kakki");
        System.out.println("Culoarea c1 a fost schimbata in: " + c1.getCuloare());

        ArrayList<Vehicle> carNtruck = new ArrayList<Vehicle>(20);
        carNtruck.add(c1);
        carNtruck.add(c2);
        carNtruck.add(c3);
        carNtruck.add(c4);
        carNtruck.add(c5);
        carNtruck.add(c6);
        carNtruck.add(c7);
        carNtruck.add(c8);
        carNtruck.add(c9);
        carNtruck.add(c10);

        carNtruck.add(t1);
        carNtruck.add(t2);
        carNtruck.add(t3);
        carNtruck.add(t4);
        carNtruck.add(t5);
        carNtruck.add(t6);
        carNtruck.add(t7);
        carNtruck.add(t8);
        carNtruck.add(t9);
        carNtruck.add(t10);

        MetArrayList.parcurgereVector(carNtruck, "Cars din vector:", "Trucks din vector:");

        //System.out.println("\tFiltru de cautare interval de pret si an vechime");
        //System.out.println(MetArrayList.PretBunPentruAn(carNtruck));

        //System.out.println("\tFiltru de cautare dupa brand si cutie de viteze");
        //System.out.println(MetArrayList.CautareDupaBrandSiCutieViteze(carNtruck));

        System.out.println("\tFiltru de cautare dupa brand si pret");
        System.out.println(MetArrayList.CautareDupaBrandSiPret(carNtruck));
    }
}