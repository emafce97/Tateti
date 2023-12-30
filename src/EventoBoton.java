import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBoton implements ActionListener {

    private JButton boton;
    public EventoBoton(JButton boton){
        this.boton = boton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Turno.turnoRojo) {
            this.boton.setBackground(Color.red);
            this.boton.setFont(new Font("Unispace",Font.BOLD,28));
            this.boton.setText("X");
            Turno.turnoRojo = false;
        } else {
            this.boton.setBackground(Color.yellow);
            this.boton.setFont(new Font("Unispace",Font.BOLD,28));
            this.boton.setText("0");
            Turno.turnoRojo = true;
        }
    }
}
