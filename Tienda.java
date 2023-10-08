import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Tienda {

    public static void main(String[] args) {
        int men1, men2, men3, men4;
        String menu1[] = {"Finalizar", "Productos frescos", "Productos refrigerados", "Productos congelados"};
        String menu2[] = {"Atras", "Registrar"};
        String menu3[] = {"Atras", "Registrar"};
        String menu4[] = {"Atras", "Registrar"};

        ImageIcon icono2 = new ImageIcon("/Users/brunoortega/Downloads/walmart_logo_icon_170230.png");

        // Redimensionar la imagen
        Image image = icono2.getImage();
        Image newImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(newImage);

        // Mostrar el cuadro de diálogo con la imagen redimensionada
        JOptionPane.showMessageDialog(null, "Hola! Bienvenido al sistema de registro de Walmart",
                "", JOptionPane.PLAIN_MESSAGE, resizedIcon);

        do {
            men1 = JOptionPane.showOptionDialog(null, "Elige una opción:",
                    "Menu General", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    resizedIcon, menu1, menu1[0]);
            switch (men1) {
                case 1:
                    men2 = JOptionPane.showOptionDialog(null, "Elige una opción:",
                            "Menu de Productos Frescos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                            resizedIcon, menu2, menu2[0]);
                    if (men2 == 0) {
                        // Salir del bucle principal si se elige "Atras" en el menú de Productos Frescos
                        break;
                    } else {
                        Fresco prodfresco1 = new Fresco("none", "none",-1,-1);
                        prodfresco1.Capturar();
                        prodfresco1.Listar();
                    }
                    break;
                case 2:
                    men3 = JOptionPane.showOptionDialog(null, "Elige una opción:",
                            "Menu de Productos Refrigerados", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                            resizedIcon, menu3, menu3[0]);
                    if (men3 == 0) {
                        // Salir del bucle principal si se elige "Atras" en el menú de Productos Frescos
                        break;
                    } else{
    
                    Refrigerado prodrefr = new Refrigerado("none","none",-1,-1);
		    prodrefr.Capturar();
                    prodrefr.Listar();
                    }
                    break;
                case 3:
                    men4 = JOptionPane.showOptionDialog(null, "Elige una opción:",
                            "Menu de Productos Congelados", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                            resizedIcon, menu4, menu4[0]);
                    if (men4 == 0) {
                        // Salir del bucle principal si se elige "Atras" en el menú de Productos Frescos
                        break;
                    } else {
                        
                        Congelado prodcong1 = new Congelado("none","none",-1,-1);
                        prodcong1.Capturar();
                        prodcong1.Listar();
                      
                    }
                    break;
            }
        } while (men1 != 0); // Salir del programa si se elige la opción "Finalizar"
    }
}
