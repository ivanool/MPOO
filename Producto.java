import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Producto{
 //atributo
  protected String nombre;
  protected String caducidad;
  protected float masa;
  protected int cantidad;
  protected int lote;
  

  // constructor

  public Producto(String nombre, String caducidad, float masa, int lote){
    this.nombre = nombre;
    this.caducidad = caducidad;
    this.masa = masa;
    this.lote = lote;
  }




  //Metodos
  
 ImageIcon icono = new ImageIcon("/Users/brunoortega/Downloads/r2d-reason2die-r2da-placerebuilder-gosinister-css-cool.gif");
  public void Capturar(){
      
    nombre = JOptionPane.showInputDialog(null,"Nombre: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE);
    caducidad = JOptionPane.showInputDialog(null,"Nombre: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE);
    masa = Float.parseFloat(JOptionPane.showInputDialog(null,"Nombre: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE));
    cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Nombre: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE));
    lote = Integer.parseInt(JOptionPane.showInputDialog(null,"Nombre: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE));
    
    
  }

  
  
}