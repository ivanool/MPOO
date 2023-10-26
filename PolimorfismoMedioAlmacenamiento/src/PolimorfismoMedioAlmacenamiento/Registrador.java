import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.stylesheets.MediaList;


public class Registrador {
    static ArrayList<MedioAlmacenamiento> lista = new ArrayList<MedioAlmacenamiento>();
    /*
    public static void main(String[] args) {
        Disco almacenDisco;
        Usb almacenUsb;
        Impresora almacenImpresora;
        Red almacenRed1, almacenRed2;
        
        System.out.println("Pèrez Casas Gil Ivàn");

        //CREANDO OBJETOS
        System.out.println("Creando el objeto Disco:");
        almacenDisco = new Disco();
        System.out.println("Creando el objeto Usb:");
        almacenUsb= new Usb();  
        System.out.println("Creando el objeto Impresora:");
        almacenImpresora = new Impresora();
        System.out.println("Creando el objeto Red:");
        almacenRed1 = new Red("laboratorio");
        almacenRed2 = new Red();

        System.out.println("GRABANDO...\n-----------------------");
        System.out.println("GRABANDO a USB:");
        almacenUsb.grabar();
        System.out.println("GRABANDO a DISCO:");
        almacenDisco.grabar();
        System.out.println("GRABANDO a RED:");
        almacenRed1.grabar();
        System.out.println("GRABANDO a IMPRESORA:");
        almacenImpresora.grabar();


    }   */

    public static void grabandoDatos1(MedioLocal dispositivo){

        dispositivo.grabar();
    }

    public static void grabandodatos2(MedioAlmacenamiento dispositivo){
        System.out.println("guagua");
        dispositivo.grabar();
    }
    
    public static void main(String []args){
        MedioLocal disco = new Disco();
        MedioLocal usb = new Usb();
        System.out.println("Pèrez Casas Gil Ivàn");
        disco.grabar();
        usb.grabar();

        ((Usb)usb).sePuedeGrabar();


        EntradaSalida red3 = new Red();

        EntradaSalida disco2 = new Disco();
        disco2.grabar();

        disco2.recuperar();
        MedioAlmacenamiento impresora = new Impresora();

        grabandodatos2(disco);
        grabandodatos2(impresora);
        grabandodatos2(red3);
        grabandodatos2(usb);


        // actividad 2
        System.out.println("Hola");
        
        lista.add(impresora);
        lista.add(red3);
        lista.add(usb);
        lista.add(disco);


        for(MedioAlmacenamiento medio : lista){
            medio.grabar();
        }





    }
    

    

}
