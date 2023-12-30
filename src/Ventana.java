import javax.swing.*;
import java.awt.*;

public class Ventana {

    private JFrame frame;
    private JPanel panel;

    public Ventana(){
        this.configVentana();
        this.agregarBotones();
    }

    private void configVentana(){
        this.frame = new JFrame("TATETI");
        this.frame.setVisible(true);
        this.frame.setBounds(200, 200, 300, 300);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.frame.setLayout(new GridLayout(3,3, 0, 0));
    }

    private void agregarBotones(){
        JButton b1 = new JButton("1");
        b1.addActionListener(new EventoBoton(b1));
        JButton b2 = new JButton("2");
        b2.addActionListener(new EventoBoton(b2));
        JButton b3 = new JButton("3");
        b3.addActionListener(new EventoBoton(b3));
        JButton b4 = new JButton("4");
        b4.addActionListener(new EventoBoton(b4));
        JButton b5 = new JButton("5");
        b5.addActionListener(new EventoBoton(b5));
        JButton b6 = new JButton("6");
        b6.addActionListener(new EventoBoton(b6));
        JButton b7 = new JButton("7");
        b7.addActionListener(new EventoBoton(b7));
        JButton b8 = new JButton("8");
        b8.addActionListener(new EventoBoton(b8));
        JButton b9 = new JButton("9");
        b9.addActionListener(new EventoBoton(b9));

        this.frame.add(b1);
        this.frame.add(b2);
        this.frame.add(b3);
        this.frame.add(b4);
        this.frame.add(b5);
        this.frame.add(b6);
        this.frame.add(b7);
        this.frame.add(b8);
        this.frame.add(b9);
    }
}
