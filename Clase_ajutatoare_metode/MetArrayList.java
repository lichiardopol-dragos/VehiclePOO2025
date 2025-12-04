package Clase_ajutatoare_metode;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Clase.ATV;
import Clase.Car;
import Clase.ElectricBike;
import Clase.Motorcycle;
import Clase.Scooter;
import Clase.Truck;
import Clase.Vehicle;


public class MetArrayList {

    public static void parcurgereVector(ArrayList<Vehicle> v, String part1, String part2)
    {
        for (Vehicle vehicul : v) {
            if (vehicul instanceof ATV || vehicul instanceof Car ||  vehicul instanceof ElectricBike ||
                vehicul instanceof Motorcycle || vehicul instanceof Scooter || vehicul instanceof Truck) {
                System.out.println(part1 + " \n\n\n");
                System.out.println(vehicul.toString() + "\n");
            } 
            else {
                System.out.println("\n\n " + part2 + " \n\n");
                System.out.println(vehicul.toString() + "\n");
            }
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
                afisare += v.get(i)+"\n\n";
        }
        
        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }

    public static String CautareDupaBrandSiCutieViteze(ArrayList<Vehicle> v, int a){
        String afisare="";
        String brand = JOptionPane.showInputDialog("Brand: ");
        String cutieViteze = JOptionPane.showInputDialog("Cutie de viteze: ");
        
        String thisBrand=v.get(a).getBrand();
        String thisCutieViteze=v.get(a).getTipCutieViteze();
        if(thisBrand.equals(brand) && thisCutieViteze.equals(cutieViteze))
            afisare+=v.get(a);
        
        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }

    public static String CautareDupaBrandSiPret(ArrayList<Vehicle> v){
        String afisare="";
        Scanner scanner=new Scanner(System.in);
        System.out.print("Brand: ");
        String brand=scanner.next();
        System.out.print("Pret 1: ");
        String pret1=scanner.next();
        System.out.print("Pret 2: ");
        String pret2=scanner.next();

        for(int i=0;i<v.size();i++) {
            String thisBrand=v.get(i).getBrand();
            int thisPret=v.get(i).getPret();
            if(!(thisBrand.equals(brand)) && (thisPret>=Integer.parseInt(pret1) || thisPret<=Integer.parseInt(pret2)))
                afisare+=v.get(i)+"\n\n";
        }
        
        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }

}
