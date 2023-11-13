

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Taller {
    public static void main(String[] args) {

        Motor m = new MotorElectrico();
        Motor mEx = new MotorExplosion();
        Motor mv = new MotorVapor();
        System.out.println("Pérez, Pérez y Ocampo");
        // Actividad 1
        
        m.capturarDatos();
        mEx.capturarDatos();
        mv.capturarDatos();
        System.out.println(m.toString());
        System.out.println(mEx.toString());
        System.out.println(mv.toString());
        
        //Actividad 2
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