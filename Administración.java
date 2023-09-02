public class Administracion {
    private static List<Empleado> lista_empleados;

    public Administracion() {
        lista_empleados = new ArrayList<>();
    }

    public void registrar() {
        Empleado empleado = new Empleado();
        empleado.capturar();
        lista_empleados.add(empleado);
    }

    public void listarinfo() {
        for (Empleado empleado : lista_empleados) {
            empleado.listar();
        }
    }

    public static void main(String[] args) {
        Administracion admin = new Administracion();
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer de entrada

            switch (opcion) {
                case 1:
                    admin.registrar();
                    break;
                case 2:
                    admin.listarinfo();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
}


//https://prod.liveshare.vsengsaas.visualstudio.com/join?46B7E9577057F0E4A1A4CE937887BC7FA9CD
