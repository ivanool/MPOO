import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;


class Refrigerado extends Producto{
  private String codigo_supervision;
  

  public Refrigerado(String nombre, String caducidad, float masa,int lote){

    super(nombre, caducidad, masa, lote);
  }
  public Refrigerado(String nombre, String caducidad, float masa,int lote, String codigo_supervision){
    super(nombre, caducidad, masa, lote);
    this.codigo_supervision = codigo_supervision;
  }
  public void Capturar(){
    super.Capturar();
    codigo_supervision = JOptionPane.showInputDialog(null,
            "Codigo de supervision: ","R E G I S T R O", JOptionPane.QUESTION_MESSAGE);
  }

 

  public void Listar(){
    String info = "Nombre: " + nombre + "\n" +
            "Caducidad: " + caducidad + "\n" +
            "Masa: " + masa + "\n" +
            "Lote: " + lote + "\n" +
            "Codigo de supervision: " + codigo_supervision;
    JOptionPane.showMessageDialog(null, info,
            "Información del Producto", JOptionPane.INFORMATION_MESSAGE);
            
  }

  


}