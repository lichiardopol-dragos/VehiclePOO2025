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
                
        ATV a2 = new ATV(4, "Rosu", "ATV Logic", 2015, 46237, "Benzina",
        339, "Automata", 113, 66,
         97, 68403, 2, false);

        ATV a3 = new ATV(4, "Bej", "Bobster", 2018, 26027, "Motorina",
        344, "Manuala", 116, 76,
         91, 42668, 1, true);

        ATV a4 = new ATV(4, "Negru", "Arctiva", 2014, 49492, "Benzina",
        333, "Automata", 106, 95,
         117, 9609, 1, false);

        ATV a5 = new ATV(4, "Alb", "Yamaha", 2019, 46496, "Motorina",
        334, "Automata", 141, 83,
         90, 67369, 2, false);

        ATV a6 = new ATV(4, "Rosu caramiziu", "ATV Logic", 2023, 37433, "Motorina",
        238, "Manuala", 98, 91,
         108, 16651, 2, true);

        ATV a7 = new ATV(4, "Visiniu", "Arctiva", 2020, 49688, "Benzina",
        234, "Automata", 92, 93,
         93, 46959, 1, false);

        ATV a8 = new ATV(4, "Violet lavanda", "Bobster", 2013, 30799, "Motorina",
        223, "Automata", 132, 96,
         111, 35353, 2, true);

        ATV a9 = new ATV(4, "Oranj", "ATV Logic", 2022, 26955, "Benzina",
        308, "Manuala", 93, 79,
         104, 83725, 1, false);

        ATV a10 = new ATV(4, "Alb", "Arctiva", 2020, 32607, "Motorina",
        292, "Manuala", 101, 82,
         115, 8432, 2, true);

        ElectricBike eb1 = new ElectricBike(2, "Negru", "Vika", 2020, 3000, "Electrica",
        50, "Automata", 150, 60,
        100, 0, 1,
        10);

        ElectricBike eb2 = new ElectricBike(2, "Alb", "Blix", 2021, 6715, "Electrica",
        42, "Automata", 149, 65,
        101, 68799, 2,
        4);

        ElectricBike eb3 = new ElectricBike(2, "Verde lime", "Tauri", 2020, 8614, "Electrica",
        63, "Automata", 132, 60,
        115, 8658, 1,
        3);

        ElectricBike eb4 = new ElectricBike(2, "Galben lamaie", "Vika", 2023, 9544, "Electrica",
        67, "Automata", 157, 76,
        112, 38414, 1,
        4);

        ElectricBike eb5 = new ElectricBike(2, "Turcoaz", "Blix", 2015, 8640, "Electrica",
        62, "Automata", 123, 80,
        139, 81555, 2,
        6);

        ElectricBike eb6 = new ElectricBike(2, "Albastru deschis", "Tauri", 2015, 5181, "Electrica",
        56, "Automata", 133, 61,
        124, 78925, 1,
        4);

        ElectricBike eb7 = new ElectricBike(2, "Gri", "Vika", 2021, 4891, "Electrica",
        56, "Automata", 150, 87,
        134, 54003, 1,
        3);

        ElectricBike eb8 = new ElectricBike(2, "Roz", "Blix", 2022, 9778, "Electrica",
        41, "Automata", 114, 79,
        121, 13381, 2,
        5);

        ElectricBike eb9 = new ElectricBike(2, "Mov", "Tauri", 2020, 4124, "Electrica",
        45, "Automata", 152, 65,
        107, 51954, 1,
        6);

        ElectricBike eb10 = new ElectricBike(2, "Negru", "Tauri", 2021, 3304, "Electrica",
        43, "Automata", 133, 66,
        107, 77959, 2,
        8);

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

        //System.out.println("\tFiltru de cautare interval de pret si an vechime");
        //System.out.println(MetArrayList.PretBunPentruAn(atvNelectricbike));

        //System.out.println("\tFiltru de cautare dupa brand si cutie de viteze");
        //System.out.println(MetArrayList.CautareDupaBrandSiCutieViteze(atvNelectricbike));

        
        

    }
}