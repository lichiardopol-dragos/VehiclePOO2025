import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import Clase.Vehicle;
import java.util.ArrayList;

public class InterfataGrafica {
    public static void main(String[] args) {
        
        ArrayList<Vehicle> vectorPrincipal = new ArrayList<Vehicle>(20);
        
        //cream cadrul
        JFrame cadru = new JFrame();
        cadru.setVisible(true);
        cadru.setSize(800,400);
        //setam size-ul sa nu poti redimensiona fereastra
        cadru.setTitle("Lucru cu vectori de vehicule");
        cadru.setMinimumSize(new Dimension(800,400));
        cadru.setMaximumSize(new Dimension(800,400));
        cadru.setLocationRelativeTo(null);
        cadru.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panou = new JPanel();
        cadru.add(panou);

        Dimension dimensiuneButon = new Dimension(100,40);

        String tooltipCarTruck = "Initializeaza vectorul principal cu 10 obiecte de tip Car, respectiv 10 de tip Truck.";

        ActionListener CarTruck = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                
            }
        };

        JButton initCarTruck = InterfataGrafica.createButton("Initializare Car Truck", dimensiuneButon, tooltipCarTruck);
        cadru.add(initCarTruck, BorderLayout.NORTH);
    }

    public static JButton createButton(String name, Dimension dimensiune, String toolTip) {
         JButton button = new JButton(name);
         button.setPreferredSize(dimensiune);
         button.setFocusable(false);
         button.setToolTipText(toolTip);
         button.addActionListener(null);
         return button;
    }

}
