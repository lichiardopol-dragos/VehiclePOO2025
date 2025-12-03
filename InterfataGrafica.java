import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import Clase.*;
import java.util.ArrayList;

public class InterfataGrafica {
    public static void main(String[] args) {
 
        //importare de elemente test
        // 1. Car
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

        // 2. Truck
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

        // 3. Motorcycle
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

        // 4. Scooter
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

        // 5. ATV
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

        // 6. ElectricBike
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

        //creare arraylist
        ArrayList<Vehicle> vectorPrincipal = new ArrayList<Vehicle>(20);
        
        //cream cadrul
        JFrame cadru = new JFrame();
        cadru.setVisible(true);
        cadru.setSize(800,400);
        cadru.setTitle("Lucru cu vectori de vehicule");

        cadru.setMinimumSize(new Dimension(800,400));
        cadru.setMaximumSize(new Dimension(800,400));

        cadru.setLocationRelativeTo(null);
        cadru.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panou = new JPanel();
        

        GridLayout asezare = new GridLayout(2, 3, 100, 100);
        panou.setLayout(asezare);

        Dimension dimensiuneButon = new Dimension(60, 20);

        String tooltipCarTruck = "Initializeaza vectorul principal cu 10 obiecte de tip Car, respectiv 10 de tip Truck.";
        ActionListener CarTruck = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                if (!vectorPrincipal.isEmpty()){
                    vectorPrincipal.clear();
                }   
                    vectorPrincipal.add(c1);
                    vectorPrincipal.add(c2);
                    vectorPrincipal.add(c3);
                    vectorPrincipal.add(c4);
                    vectorPrincipal.add(c5);
                    vectorPrincipal.add(c6);
                    vectorPrincipal.add(c7);
                    vectorPrincipal.add(c8);
                    vectorPrincipal.add(c9);
                    vectorPrincipal.add(c10);

                    vectorPrincipal.add(t1);
                    vectorPrincipal.add(t2);
                    vectorPrincipal.add(t3);
                    vectorPrincipal.add(t4);
                    vectorPrincipal.add(t5);
                    vectorPrincipal.add(t6);
                    vectorPrincipal.add(t7);
                    vectorPrincipal.add(t8);
                    vectorPrincipal.add(t9);
                    vectorPrincipal.add(t10);

                    JOptionPane.showMessageDialog(cadru, "Vectorul a fost initializat cu succes!");
                }
            };

        String tooltipMotorScooter = "Initializeaza vectorul principal cu 10 obiecte de tip Motorcycle, respectiv 10 de tip Scooter.";
        ActionListener MotorScooter = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                if (!vectorPrincipal.isEmpty())
                    vectorPrincipal.clear();

                    vectorPrincipal.add(m1);
                    vectorPrincipal.add(m2);
                    vectorPrincipal.add(m3);
                    vectorPrincipal.add(m4);
                    vectorPrincipal.add(m5);
                    vectorPrincipal.add(m6);
                    vectorPrincipal.add(m7);
                    vectorPrincipal.add(m8);
                    vectorPrincipal.add(m9);
                    vectorPrincipal.add(m10);

                    vectorPrincipal.add(s1);
                    vectorPrincipal.add(s2);
                    vectorPrincipal.add(s3);
                    vectorPrincipal.add(s4);
                    vectorPrincipal.add(s5);
                    vectorPrincipal.add(s6);
                    vectorPrincipal.add(s7);
                    vectorPrincipal.add(s8);
                    vectorPrincipal.add(s9);
                    vectorPrincipal.add(s10);

                    JOptionPane.showMessageDialog(cadru, "Vectorul a fost initializat cu succes!");
                
            }
        };
        
        String tooltipAtvElectricBike = "Initializeaza vectorul principal cu 10 obiecte de tip ATV, respectiv 10 de tip ElectricBike.";
        ActionListener AtvElectricBike = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                if (!vectorPrincipal.isEmpty())
                    vectorPrincipal.clear();

                    vectorPrincipal.add(a1);
                    vectorPrincipal.add(a2);
                    vectorPrincipal.add(a3);
                    vectorPrincipal.add(a4);
                    vectorPrincipal.add(a5);
                    vectorPrincipal.add(a6);
                    vectorPrincipal.add(a7);
                    vectorPrincipal.add(a8);
                    vectorPrincipal.add(a9);
                    vectorPrincipal.add(a10);

                    vectorPrincipal.add(eb1);
                    vectorPrincipal.add(eb2);
                    vectorPrincipal.add(eb3);
                    vectorPrincipal.add(eb4);
                    vectorPrincipal.add(eb5);
                    vectorPrincipal.add(eb6);
                    vectorPrincipal.add(eb7);
                    vectorPrincipal.add(eb8);
                    vectorPrincipal.add(eb9);
                    vectorPrincipal.add(eb10);

                    JOptionPane.showMessageDialog(cadru, "Vectorul a fost initializat cu succes!");
                
                }
            };

        String toolTipBrandViteze = "Cauta vehicule dupa brand si cutie de viteze.";
        
        String toolTipAnPret = "Cauta vehicule dupa anul de lansare si pretul maxim cerut.";

        JButton initCarTruck = InterfataGrafica.createButton("Initializare Car Truck", dimensiuneButon, tooltipCarTruck, CarTruck);
        JButton initMotorScooter = InterfataGrafica.createButton("Initializare Motorcycle Scooter", dimensiuneButon, tooltipMotorScooter, MotorScooter);
        JButton initAtvElectricBike = InterfataGrafica.createButton("Initializare ATV ElectricBike", dimensiuneButon, tooltipAtvElectricBike, AtvElectricBike);
        JButton cautBrandViteze = InterfataGrafica.createButton("Cautare Brand si Cutie Viteze", dimensiuneButon, toolTipBrandViteze);
        JButton cautAnPret = InterfataGrafica.createButton("Cautare An si Pret", dimensiuneButon, toolTipAnPret);
        panou.add(initCarTruck);
        panou.add(initMotorScooter);
        panou.add(initAtvElectricBike);
        panou.add(cautBrandViteze);
        panou.add(cautAnPret);
        cadru.add(panou);
    }

    public static JButton createButton(String name, Dimension dimensiune, String toolTip, ActionListener actiune) {
         JButton button = new JButton(name);
         button.setPreferredSize(dimensiune);
         button.setFocusable(false);
         button.setToolTipText(toolTip);
         button.addActionListener(actiune);
         return button;
    }

    public static JButton createButton(String name, Dimension dimensiune, String toolTip){
            JButton button = new JButton(name);
            button.setPreferredSize(dimensiune);
            button.setFocusable(false);
            button.setToolTipText(toolTip);
            return button;
    }

}
