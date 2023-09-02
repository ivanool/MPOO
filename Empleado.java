import java.util.Scanner;

public class Empleado {
    // ATRIBUTOS
    private int nEmpleado;
    private String nombre;
    private float sueldo;
    private Scanner sc;
    private static int empleados;

    // CONSTRUCTOR
    public Empleado() {
        sc = new Scanner(System.in);
    }

    // Este código esta insertado en la clase Empleado
    public void capturar() {
        System.out.println("Ingresa el número del empleado:");
        nEmpleado = sc.nextInt();
        sc.nextLine(); // Limpia el buffer de entrada
        System.out.println("Ingresa el nombre del empleado:");
        nombre = sc.nextLine();
        System.out.println("Ingresa el sueldo del empleado:");
        sueldo = sc.nextFloat();
        // empleados++;
    }

    // Método de presentación en pantalla
    public void listar() {
        System.out.println("Los datos del empleado son los siguientes:");
        System.out.println("Nombre: " + nombre + ", Numero: " + nEmpleado + ", Sueldo: " + sueldo);
        // System.out.println("Numero total empleados: " + empleados);
    }

    // Métodos setter para actualizar atributos
    public void setNEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter para obtener atributos
    public float getSueldo() {
        return sueldo;
    }

    public int getNEmpleado() {
        return nEmpleado;
    }

    public String getNombre() {
        return nombre;
    }
}

//aplicacion carbon para las imagenes con el codigo