import java.util.ArrayList;
import java.util.Scanner;

public class MetArrayList {
    public static void parcurgereVector(ArrayList<Vehicle> v, String part1, String part2)
    {
        for(int i=0; i<v.size(); i++){
                System.out.println(part1 + " \n\n\n");
                if (i==(v.size())/2)
                        System.out.println("\n\n " +  part2 + " \n\n");
                System.out.println((v.get(i)).toString()+"\n");
        }
    }

    public static String PretBunPentruAn(ArrayList<Vehicle> v){
        String afisare="";
        Scanner scanner=new Scanner(System.in);
        System.out.print("Anul minim cerut: ");
        int anMinim=scanner.nextInt();
        System.out.print("Pretul maxim cerut: ");
        int pretMaxim=scanner.nextInt();
        

        for(int i=0;i<v.size();i++) {
            int an = v.get(i).getAnLansare();
            int pret = v.get(i).getPret();
            if (an >= anMinim && pret <= pretMaxim)
                afisare += v.get(i)+" ";
        }
        
        scanner.close();

        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }

    public static String CautareDupaBrandSiCutieViteze(ArrayList<Vehicle> v){
        String afisare="";
        Scanner scanner=new Scanner(System.in);
        System.out.print("Brand: ");
        String brand=scanner.next();
        System.out.print("Cutie de viteze: ");
        String cutieViteze=scanner.next();
        

        for(int i=0;i<v.size();i++) {
            String thisBrand=v.get(i).getBrand();
            String thisCutieViteze=v.get(i).getTipCutieViteze();
            if(thisBrand.equals(brand) && thisCutieViteze.equals(cutieViteze))
                afisare+=v.get(i)+" ";
        }

        scanner.close();
        
        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }


}
