
import java.util.*;

public class Testare {
    public static void main(String[] args) {

        // cream obiecte tip Motorcycle
        Motorcycle m1 = new Motorcycle(
                2, "Rosu", "Yamaha", 2022, 7500, "Benzina", 110,
                "Manuala", 80, 15, 220, 15000, 2,
                "Lant", "ABS"
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
        vehicles.add(m2);
        vehicles.add(m3);
        vehicles.add(m4);
        vehicles.add(m5);
        vehicles.add(m6);
        vehicles.add(m7);
        vehicles.add(m8);
        vehicles.add(m9);
        vehicles.add(m10);

        //testare metoda 1
        System.out.println("\tFiltru de cautare interval de pret si an vechime");
       System.out.println(PretBunPentruAn(vehicles));

       //testare metoda 2
        System.out.println("\tFiltru de cautare dupa brand si cutie de viteze");
        System.out.println(CautareDupaBrandSiCutieViteze(vehicles));
    }
    //Metode pt ArrayList
    //1. metoda de gasire vehicule dupa pret si an
    public static String PretBunPentruAn(ArrayList<Vehicle> vehicles){
        String afisare="";
        Scanner scanner=new Scanner(System.in);
        System.out.print("Anul minim cerut: ");
        int anMinim=scanner.nextInt();
        System.out.print("Pretul maxim cerut: ");
        int pretMaxim=scanner.nextInt();

        for(int i=0;i<vehicles.size();i++) {
            int an = vehicles.get(i).getAnLansare();
            int pret = vehicles.get(i).getPret();
            if (an >= anMinim && pret <= pretMaxim)
                afisare += vehicles.get(i)+" ";
        }
        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }

    //2. metoda de gasire vehicule dupa brand si tip cutie viteze
    public static String CautareDupaBrandSiCutieViteze(ArrayList<Vehicle> vehicles){
        String afisare="";
        Scanner scanner=new Scanner(System.in);
        System.out.print("Brand: ");
        String brand=scanner.next();
        System.out.print("Cutie de viteze: ");
        String cutieViteze=scanner.next();

        for(int i=0;i<vehicles.size();i++) {
            String thisBrand=vehicles.get(i).getBrand();
            String thisCutieViteze=vehicles.get(i).getTipCutieViteze();
            if(thisBrand.equals(brand) && thisCutieViteze.equals(cutieViteze))
                afisare+=vehicles.get(i)+" ";
        }
        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }
}
