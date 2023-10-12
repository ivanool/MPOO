
public class Disco  extends MedioLocal{
    Disco(){
       System.out.println("\tSe creo un objeto de tipo Disco");
   }

    void grabar(){
        super.grabar();
        System.out.println("\tGrabando a disco ...");
   } 
}
