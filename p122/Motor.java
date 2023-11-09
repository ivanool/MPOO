

import javax.swing.JOptionPane;

public class Motor {
    protected int torque;
    protected float velocidadGiro;
    
    public void capturarDatos() {
        torque = Integer.parseInt(JOptionPane.showInputDialog(null,"Torque:","Motor",JOptionPane.QUESTION_MESSAGE));
        velocidadGiro= Float.parseFloat(JOptionPane.showInputDialog(null,"Velocidad de giro: ","Motor",JOptionPane.QUESTION_MESSAGE));
    } 

    @Override
    public String toString() {
        return "Torque=" + torque + "\nVelocidadGiro=" + velocidadGiro + "\n" ;
    }
    
}
