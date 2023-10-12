import java.awt.Image;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Fresco extends Producto {
    private String Fechaenvasado;
    private String Paisdeorigen;
    Scanner scan = new Scanner(System.in);

    public Fresco(String nombre, String caducidad, float masa, int lote) {
        super(nombre, caducidad, masa, lote);
    }
    
public void Capturar() {
        super.Capturar();
        Fechaenvasado = JOptionPane.showInputDialog(null, "Fecha de envasado: ", "R E G I S T R O", JOptionPane.QUESTION_MESSAGE);
        Paisdeorigen = JOptionPane.showInputDialog(null, "País de origen: ", "R E G I S T R O", JOptionPane.QUESTION_MESSAGE);
        
        
        if (Paisdeorigen.isEmpty()) { 
                JOptionPane.showMessageDialog(null, "Error: El país de origen no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                Paisdeorigen = "Desconocido"; 
        }
        
        System.out.println(nombre + "," + caducidad + "," + masa + "," + cantidad + "," + lote + ","
                        + Fechaenvasado + "," + Paisdeorigen);
        public void Listar(){
                String info = "Nombre: " + nombre + "\n" +
                        "Caducidad: " + caducidad + "\n" +
                        "Masa: " + masa + "\n" +
                        "Cantidad: " + cantidad + "\n" +
                        "Lote: " + lote + "\n" +
                        "Fecha de envasado: " + Fechaenvasado + "\n" +
                        "Pais de origen: " + Paisdeorigen;
                JOptionPane.showMessageDialog(null, info,
                        "Información del Producto", JOptionPane.INFORMATION_MESSAGE);
        } 
}