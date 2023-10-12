
public class Registrador {
    public static void main(String[] args) {
        Disco almacenDisco;
        Usb almacenUsb;
        Impresora almacenImpresora;
        Red almacenRed1, almacenRed2;


        Red laboratorio;
        
        //CREANDO OBJETOS
        System.out.println("Perez Casas Gil Ivan");
        System.out.println("Creando el objeto Disco:");
        almacenDisco = new Disco();
        System.out.println("Creando el objeto Usb:");
        almacenUsb= new Usb();  
        System.out.println("Creando el objeto impresora");
        almacenImpresora= new Impresora();
        System.out.println("Creando el objeto red");
        laboratorio = new Red("Eri");
        System.out.println("Almacenred1");
        almacenRed1 = new Red("Nombre");
        almacenRed1.grabar();
        System.out.println("AlmacenUSB");
        almacenUsb.grabar();
        System.out.println("Grabar_disco");
        almacenDisco.grabar();

        /*
        System.out.println("GRABANDO...\n-----------------------");
        System.out.println("GRABANDO a USB:");
        almacenUsb.grabar();
        */
        /*
        System.out.println("GRABANDO a DISCO:");
        almacenDisco.grabar();
        */
        /*System.out.println("GRABANDO a RED:");
        almacenRed1.grabar();
        */
    }   
}
