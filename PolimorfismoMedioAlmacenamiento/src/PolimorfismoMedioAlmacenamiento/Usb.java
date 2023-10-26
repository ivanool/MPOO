
public class Usb extends MedioLocal{
    Usb(){
       System.out.println("\tSe creo un objeto de tipo Usb");
    }
    public void grabar(){
       System.out.println("\tGrabando a una Usb * * *");
    }
    public void sePuedeGrabar(){
        System.out.println("\n\t-->Usb con permisos para grabar");
    }
}
