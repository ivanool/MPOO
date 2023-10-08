import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;


public class Congelado extends Producto{
    
    private String nombre;
    private String caducidad;
    private int cantidad;
    private int lote;
    private float temperatura_recomendada;
    

    public Congelado(String nombre, String caducidad, float masa, int lote) {
        super(nombre, caducidad, masa, lote);
        this.temperatura_recomendada = temperatura_recomendada;
    }
    //haz un método listar que utilice la libreria JOptionPane para mostrar los datos del producto
    //haz un método capturar que utilice la libreria JOptionPane para capturar los datos del producto

    public void Capturar() {
        super.Capturar();
        nombre = JOptionPane.showInputDialog(null,"Nombre: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE);
        caducidad = JOptionPane.showInputDialog(null,"Caducidad: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE);
        
        try {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Masa: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: La cantidad debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            cantidad = 0; // Asignamos un valor por defecto
        }
        
        try {
            lote = Integer.parseInt(JOptionPane.showInputDialog(null,"Lote: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: El lote debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            lote = 0; // Asignamos un valor por defecto
        }
        
        try {
            temperatura_recomendada = Float.parseFloat(JOptionPane.showInputDialog(null,"Temperatura recomendada: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: La temperatura recomendada debe ser un número decimal.", "Error", JOptionPane.ERROR_MESSAGE);
            temperatura_recomendada = 0.0f; // Asignamos un valor por defecto
        }
    }

     // haz un método listar pero no pongas iconos ni uses resizeIcon

        public void Listar(){
                String info = "Nombre: " + nombre + "\n" +
                        "Caducidad: " + caducidad + "\n" +
                        "Cantidad: " + cantidad + "\n" +
                        "Lote: " + lote + "\n" +
                        "Temperatura recomendada: " + temperatura_recomendada;
                JOptionPane.showMessageDialog(null, info,
                        "Información del Producto", JOptionPane.INFORMATION_MESSAGE);
        
        }

}
