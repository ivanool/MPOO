

import javax.swing.JOptionPane;

public class MotorElectrico extends Motor{
    private float voltaje;
    private float corriente;
    private int numeroDevanados;
    
    @Override
    public void capturarDatos() {
        super.capturarDatos();
        voltaje = Float.parseFloat(JOptionPane.showInputDialog("Voltaje:"));
        corriente = Float.parseFloat(JOptionPane.showInputDialog("Corriente: "));
        numeroDevanados = Integer.parseInt(JOptionPane.showInputDialog("Numero de devanados: "));
    }

    @Override
    public String toString() {
        return "MOTOR ELÉCTRICO\n" + super.toString()+ "Voltaje=" + voltaje + "\nCorriente=" + corriente + "\nNumero de Devanados=" + numeroDevanados + "\n";
    }
    
}
