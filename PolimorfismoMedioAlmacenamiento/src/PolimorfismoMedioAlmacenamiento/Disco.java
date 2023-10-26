
public class Disco  extends MedioLocal{
    Disco(){
       System.out.println("\tSe creo un objeto de tipo Disco");
   }
    @Override
   public void grabar(){
       super.grabar();
       System.out.println("\tGrabando a disco ...");
   } 
   public void recuperar(){
       System.out.println("\n\tRecuperando datos del disco ...");
   }
}
