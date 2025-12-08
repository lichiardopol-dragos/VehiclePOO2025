package Clase_ajutatoare_metode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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

    public static String PretBunPentruAn(ArrayList<Vehicle> v, int a, int anMinim, int pretMaxim){
        String afisare="";

        int an = v.get(a).getAnLansare();
        int pret = v.get(a).getPret();
        if (an >= anMinim && pret <= pretMaxim)
                afisare += v.get(a);
        
        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }

    public static String CautareDupaBrandSiCutieViteze(ArrayList<Vehicle> v, int a, String brand, String cutieViteze){
        String afisare="";

        String thisBrand=v.get(a).getBrand();
        String thisCutieViteze=v.get(a).getTipCutieViteze();
        if(thisBrand.equals(brand) && thisCutieViteze.equals(cutieViteze))
            afisare+=v.get(a);
        
        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }

    public static String CautareDupaBrandSiPret(ArrayList<Vehicle> v, int a, String brand, int pret1, int pret2){
        String afisare="";
        
        String thisBrand=v.get(a).getBrand();
        int thisPret=v.get(a).getPret();
        if(!(thisBrand.equals(brand)) && ((thisPret>=pret1) || (thisPret<=pret2)))
            afisare+=v.get(a);
        
        if(afisare.isEmpty())
            return "Nu s-a gasit un vehicul care sa indeplineasca cerintele.";
        else return afisare;
    }

    public static void ScriereVectInFisiere(ArrayList<Vehicle> v) throws IOException{
        
        FileWriter fw1 = new FileWriter("vehicule1.txt");
        FileWriter fw2 = new FileWriter("vehicule2.txt");
        BufferedWriter bw1 = new BufferedWriter(fw1);
        BufferedWriter bw2 = new BufferedWriter(fw2);

        try{
            int i = 1;
            for (Vehicle vehicul : v) {
                if (vehicul instanceof Car || vehicul instanceof Motorcycle || vehicul instanceof ATV){
                    bw1.write("Obiectul " + i + " :");
                    bw1.newLine();
                    bw1.write(vehicul.toString());
                    bw1.newLine();
                    i++;
                }
                else if (vehicul instanceof Truck || vehicul instanceof Scooter || vehicul instanceof ElectricBike){
                    bw2.write("Obiectul " + i + " :");
                    bw2.newLine();
                    bw2.write(vehicul.toString());
                    bw2.newLine();
                    i++;
                }
            }

            bw1.close();
            bw2.close();
        }

        catch (IOException e){
        }

    }


}
