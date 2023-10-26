

public class EntradaSalida extends MedioAlmacenamiento {
    protected String nombre;
    
    EntradaSalida(){
      System.out.println("\tSe creo un objeto de tipo EntradaSalida");
   }
   public void grabar(){
       System.out.println("\tPreparando dispositivo de ENTRADA/SALIDA para grabar");
   }
   public void recuperar(){
       System.out.println("\tRecuperando datos de EntradaSalida ...");
   }
}
