import javax.swing.*;
import java.awt.*;

public class InterfataGrafica {
    public static void main(String[] args) {
        //cream cadrul
        JFrame cadru = new JFrame();
        cadru.setVisible(true);
        cadru.setSize(400,400);
        //setam size-ul sa nu poti redimensiona fereastra
        cadru.setMinimumSize(new Dimension(400,400));
        cadru.setMaximumSize(new Dimension(400,400));
        cadru.setLocationRelativeTo(null);
        cadru.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //panels
        cadru.setLayout(new BoxLayout(cadru.getContentPane(), BoxLayout.X_AXIS));
        JPanel panouStanga = new JPanel();
        JPanel panouDreapta = new JPanel();

        panouStanga.setBackground(new Color(160, 32, 240));//mov
        panouDreapta.setBackground(new Color(133,6,6));//rosu

        cadru.add(panouStanga);
        cadru.add(panouDreapta);

    }
}
