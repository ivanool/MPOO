

public class EntradaSalida extends MedioAlmacenamiento {
    public String nombre;
    
    EntradaSalida(){
      System.out.println("\tSe creo un objeto de tipo EntradaSalida");
   }
    
    @Override
    void grabar(){
       System.out.println("\tPreparando dispositivo de SALIDA para grabar");
   }

}
