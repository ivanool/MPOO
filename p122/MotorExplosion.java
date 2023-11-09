

import javax.swing.JOptionPane;

public class MotorExplosion extends Motor{
    private int cilindros;
    private int eficienciaTermica;
    private String tipoCombustible;
    
    @Override
    public void capturarDatos() {
        super.capturarDatos();
        cilindros = Integer.parseInt(JOptionPane.showInputDialog("Cilindros:"));
        eficienciaTermica = Integer.parseInt(JOptionPane.showInputDialog("Eficiencia termica: "));
        tipoCombustible = (String) (JOptionPane.showInputDialog(null,"Tipo de combustible: ","Combustible",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Gasolina", "Diesel"},"Gasolina"));
    }

    @Override
    public String toString() {
        return "MOTOR EXPLOSIÓN\n" +super.toString()+ "Cilindros=" + cilindros + "\nEficiencia termica=" + eficienciaTermica + "\nTipo de combustible=" + tipoCombustible + "\n";
    }

    
    
}
