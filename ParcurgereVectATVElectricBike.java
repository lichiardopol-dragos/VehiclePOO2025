import java.util.*;

import Clase.ATV;
import Clase.ElectricBike;
import Clase.Vehicle;
import Clase_ajutatoare_metode.MetArrayList;

public class ParcurgereVectATVElectricBike {
    public static void main(String[] args) {

        ATV a1 = new ATV(4, "Verde Deschis", "Yamaha", 2015, 30000, "Benzina",
        300, "Automata", 90, 60,
         90, 0, 1, false);
                
        ATV a2 = new ATV(4, "Verde Deschis", "Yamaha", 2015, 30000, "Benzina",
        300, "Automata", 90, 60,
         90, 0, 1, false);

        ATV a3 = new ATV(4, "Verde Deschis", "Yamaha", 2015, 30000, "Benzina",
        300, "Automata", 90, 60,
         90, 0, 1, false);

        ATV a4 = new ATV(4, "Verde Deschis", "Yamaha", 2015, 30000, "Benzina",
        300, "Automata", 90, 60,
         90, 0, 1, false);

        ATV a5 = new ATV(4, "Verde Deschis", "Yamaha", 2015, 30000, "Benzina",
        300, "Automata", 90, 60,
         90, 0, 1, false);

        ATV a6 = new ATV(4, "Verde Deschis", "Yamaha", 2015, 30000, "Benzina",
        300, "Automata", 90, 60,
         90, 0, 1, false);

        ATV a7 = new ATV(4, "Verde Deschis", "Yamaha", 2015, 30000, "Benzina",
        300, "Automata", 90, 60,
         90, 0, 1, false);

        ATV a8 = new ATV(4, "Verde Deschis", "Yamaha", 2015, 30000, "Benzina",
        300, "Automata", 90, 60,
         90, 0, 1, false);

        ATV a9 = new ATV(4, "Verde Deschis", "Yamaha", 2015, 30000, "Benzina",
        300, "Automata", 90, 60,
         90, 0, 1, false);

        ATV a10 = new ATV(4, "Verde Deschis", "Yamaha", 2015, 30000, "Benzina",
        300, "Automata", 90, 60,
         90, 0, 1, false);

        ElectricBike eb1 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        ElectricBike eb2 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        ElectricBike eb3 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        ElectricBike eb4 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        ElectricBike eb5 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        ElectricBike eb6 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        ElectricBike eb7 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        ElectricBike eb8 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        ElectricBike eb9 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        ElectricBike eb10 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        System.out.println("\n\tTestare met toString()");
        System.out.println(a1.toString());

        System.out.println("\n\tTestare met interfata");
        System.out.println("Este a1 Second Hand?: " + a1.esteSH());
        System.out.println("Impozitul anual pentru a1: " + a1.calcImpozitAnual());

        System.out.println("\n\tTestare Gettere si Settere");
        System.out.println("Brand a1: " + a1.getBrand());
        System.out.println("Are a1 vinci?: " + a1.getIsVinci());
        a1.setAnLansare(2019);
        System.out.println("Anul lansarii a1 a fost schimbat in: " + a1.getAnLansare());

        ArrayList<Vehicle> atvNelectricbike = new ArrayList<Vehicle>(20);
        atvNelectricbike.add(a1);
        atvNelectricbike.add(a2);
        atvNelectricbike.add(a3);
        atvNelectricbike.add(a4);
        atvNelectricbike.add(a5);
        atvNelectricbike.add(a6);
        atvNelectricbike.add(a7);
        atvNelectricbike.add(a8);
        atvNelectricbike.add(a9);
        atvNelectricbike.add(a10);

        atvNelectricbike.add(eb1);
        atvNelectricbike.add(eb2);
        atvNelectricbike.add(eb3);
        atvNelectricbike.add(eb4);
        atvNelectricbike.add(eb5);
        atvNelectricbike.add(eb6);
        atvNelectricbike.add(eb7);
        atvNelectricbike.add(eb8);
        atvNelectricbike.add(eb9);
        atvNelectricbike.add(eb10);

        MetArrayList.parcurgereVector(atvNelectricbike, "ATVs din vector:", "Electric Bikes din vector:");

        System.out.println("\tFiltru de cautare interval de pret si an vechime");
        System.out.println(MetArrayList.PretBunPentruAn(atvNelectricbike));

        System.out.println("\tFiltru de cautare dupa brand si cutie de viteze");
        System.out.println(MetArrayList.CautareDupaBrandSiCutieViteze(atvNelectricbike));

    }
}