import java.util.Scanner;

public class Empleado {
    //ATRIBUTOS
    private int nEmpleado;
    private String nombre;
    private float sueldo;
    private Scanner sc;

    //Metodos

  

    public void capturar(){
        System.out.println("Ingresa el número del empleado:");
        nEmpleado = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el nombre del empleado:");
        nombre = sc.nextLine();
        System.out.println("Ingresa el sueldo del empleado:");
        sueldo = sc.nextFloat();
    }

    public void listar(){
        System.out.println("Los datos del empleado son los siguientes:");
        System.out.println("Nombre: " + nombre + "Numero: " + nEmpleado + "Sueldo: "+ sueldo);
    }

    public void setnEmpleado(int nEmpleado){
        this.nEmpleado = nEmpleado;
    }

    public void setSueldo(Float sueldo){
        this.sueldo = sueldo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    
    public float getSueldo(){
        return sueldo;
    }
    
    public int getnEmpleado(){
        return nEmpleado;
    }

    public String getnombre(){
        return nombre;
    }

}
