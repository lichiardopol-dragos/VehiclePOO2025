import java.util.*;

public class ParcurgereVectCarTruck {
    public static void main(String[] args) {

        Car c1 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");
                
        Car c2 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");

        Car c3 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");

        Car c4 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");

        Car c5 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");

        Car c6 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");

        Car c7 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");

        Car c8 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");

        Car c9 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");

        Car c10 = new Car(4, "Verde", "Dacia", 2014, 8000, "Benzina",
        100, "Manuala", 100, 20, 
        240, 0, 5,
        8, 10, "Hitchback");

        Truck t1 = new Truck(4, "Gri", "DAF", 2006, 30000, "Benzina",
         100, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

        Truck t2 = new Truck(4, "Gri", "DAF", 2006, 30000, "Benzina",
         100, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

        Truck t3 = new Truck(4, "Gri", "DAF", 2006, 30000, "Benzina",
         100, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

        Truck t4 = new Truck(4, "Gri", "DAF", 2006, 30000, "Benzina",
         100, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

        Truck t5 = new Truck(4, "Gri", "DAF", 2006, 30000, "Benzina",
         100, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

        Truck t6 = new Truck(4, "Gri", "DAF", 2006, 30000, "Benzina",
         100, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

        Truck t7 = new Truck(4, "Gri", "DAF", 2006, 30000, "Benzina",
         100, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

        Truck t8 = new Truck(4, "Gri", "DAF", 2006, 30000, "Benzina",
         100, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

        Truck t9 = new Truck(4, "Gri", "DAF", 2006, 30000, "Benzina",
         100, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

        Truck t10 = new Truck(4, "Gri", "DAF", 2006, 30000, "Benzina",
         100, "Manuala", 100, 50, 
         180, 0, 1, 600, 
         "Inchis");

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

        System.out.println("\tFiltru de cautare interval de pret si an vechime");
        System.out.println(MetArrayList.PretBunPentruAn(carNtruck));

        System.out.println("\tFiltru de cautare dupa brand si cutie de viteze");
        System.out.println(MetArrayList.CautareDupaBrandSiCutieViteze(carNtruck));

    }
}