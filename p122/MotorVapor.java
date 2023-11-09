

import javax.swing.JOptionPane;

public class MotorVapor extends Motor{
    private float presionTrabajo;
    private float temperaturaCaldera;
    private String tipoCombustible;
    
    @Override
    public void capturarDatos() {
        super.capturarDatos();
        presionTrabajo = Float.parseFloat(JOptionPane.showInputDialog("Presión trabajo:"));
        temperaturaCaldera = Float.parseFloat(JOptionPane.showInputDialog("Temperatura caldera: "));
        tipoCombustible = (String) (JOptionPane.showInputDialog(null,"Tipo de combustible: ","Combustible",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Gasolina", "Diesel"},"Gasolina"));
    }

    @Override
    public String toString() {
        return "MOTOR VAPOR\n" +super.toString() + "Presion Trabajo=" + presionTrabajo + "\nTemperatura de Caldera=" + temperaturaCaldera + "\nTipo Combustible=" + tipoCombustible + "\n";
    }

   

    
    
}
