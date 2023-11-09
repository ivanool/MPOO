

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Taller {
    public static void main(String[] args) {
        //VARIABLES LOCALES
        
        //CAPTURAR DATOS
        Motor m = new MotorElectrico();
        Motor mEx = new MotorExplosion();
        Motor mv = new MotorVapor();

  
        //LISTAR DATOS
        ArrayList <Motor> lista = new ArrayList<Motor>();
        lista.add(m);
        lista.add(mEx);
        lista.add(mv);

        for(Motor motor : lista){
            motor.capturarDatos();
            System.out.println(motor.toString());
        }
    }
}