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
  public void Capturar() {
    super.Capturar();
    codigo_supervision = JOptionPane.showInputDialog(null, "Código de supervisión: ", "R E G I S T R O", JOptionPane.QUESTION_MESSAGE);
    try {
      Integer.parseInt(codigo_supervision); 
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Error: El código de supervisión debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
      codigo_supervision = "0";
    } 
    System.out.println(nombre + "," + caducidad + "," + masa + "," + lote + "," + codigo_supervision);
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
}