package Encapsulamiento_2_MedioAlmacenamiento;
public class MedioLocal extends EntradaSalida {
    private float espacioTotal;
    private float espacioRestante;
    
   MedioLocal(){
       System.out.println("\tSe creo un objeto de tipo MedioLocal");
   }
   @Override
   void grabar(){
       System.out.println("\tPreparando dispositivo MedioLocal para grabar");
   }
}
