

public class Impresora extends MedioAlmacenamiento{
    Impresora(){
       System.out.println("\tSe creo un objeto de tipo Impresora");
    }
  
    @Override
    void grabar(){
       System.out.println("Imprimiendo Documento ###");
    }
}
