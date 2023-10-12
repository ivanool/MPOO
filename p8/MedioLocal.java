
public class MedioLocal  extends EntradaSalida{
   MedioLocal(){
       System.out.println("\tSe creo un objeto de tipo MedioLocal");
   }
   void grabar(){
    super.grabar();
    System.out.println("\tPreparando dispositivo MedioLocal para grabar");
   }
}
