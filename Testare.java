import java.util.*;

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
        
        scanner.close();

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

        scanner.close();
        
        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }
}
