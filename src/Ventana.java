import javax.swing.*;
import java.awt.*;

public class Ventana {

    private JFrame frame;
    private JButton[] botones;

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
        this.botones = new JButton[9];
        for(int i=0; i < botones.length; i++){
            botones[i] = new JButton("");
            botones[i].addActionListener(new EventoBoton(botones[i]));
            this.frame.add(botones[i]);
        }
    }

    public JButton[] getBotones(){
        return this.botones;
    }
}
