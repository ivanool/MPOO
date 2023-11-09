
public class Registrador {
    
    public static void main(String[] args) {
        MedioAlmacenamiento almacenDisco, almacenUsb, almacenImpresora,almacenRed1, almacenRed2;
        
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
        grabar(almacenUsb);
        grabar(almacenDisco);
        grabar(almacenRed1);
 
    }   


    public static void grabar(MedioAlmacenamiento dispositivo){
        dispositivo.grabar();
    }
}
