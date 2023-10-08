import java.awt.Image;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Fresco extends Producto {
    //atributos
    private String Fechaenvasado;
    private String Paisdeorigen;
    Scanner scan = new Scanner(System.in);

        //constructor
    public Fresco(String nombre, String caducidad, float masa, int lote) {
        super(nombre, caducidad, masa, lote);
    }
   
public void Capturar() {
        super.Capturar();
        Fechaenvasado = JOptionPane.showInputDialog(null, "Fecha de envasado: ", "R E G I S T R O", JOptionPane.QUESTION_MESSAGE);
        Paisdeorigen = JOptionPane.showInputDialog(null, "País de origen: ", "R E G I S T R O", JOptionPane.QUESTION_MESSAGE);
        
        try {
                LocalDate.parse(Fechaenvasado); // Intentamos parsear la fecha
        } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Error: La fecha de envasado debe tener el formato yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
                Fechaenvasado = "0000-00-00"; // Asignamos un valor por defecto
        }
        
        if (Paisdeorigen.isEmpty()) { // Verificamos si el campo está vacío
                JOptionPane.showMessageDialog(null, "Error: El país de origen no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                Paisdeorigen = "Desconocido"; // Asignamos un valor por defecto
        }
        
        System.out.println(nombre + "," + caducidad + "," + masa + "," + cantidad + "," + lote + ","
                        + Fechaenvasado + "," + Paisdeorigen);
}
    
     // haz un método listar pero no pongas iconos ni uses resizeIcon

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