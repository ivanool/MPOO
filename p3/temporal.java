import java.util.Scanner;

public class Calculadora{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int operacion = 0;
        OperacionesAritmeticas op = new OperacionesAritmeticas();
        float num1 = 0;
        float num2 = 0;
        float resultado = 0;
        do{
        System.out.println("Ingrese la operación que desea realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        operacion = sc.nextInt();
        //Aquí hay que poner los print para los nombres del equipo
        System.out.println("Perez Casas Gil Ivan, Torres Flores Manuel");
        //se supone que solo es el primer apellido no?
    //No sé, el nombre completo creo 
    // dE TODOD MODOS NO creo que diga algo xd

    //prueba el programa, solo pon java Calaculadora en la terminal, lo termine ayer
        //va, nomás deja pongo el do while para el 
        //va
        //no me deja usar la consola en anóinimo,deja me registro
        
        switch(operacion){
            case 1:
                //suma
                op.sumar();
                break;
            case 2:
                //resta
                System.out.println("Ingrese el primer operando");
                num1 = sc.nextFloat();
                System.out.println("Ingrese el segundo operando");
                num2 = sc.nextFloat();
                op.restar(num1, num2);
                break;
            case 3:
                //multiplicación
                resultado = op.multiplicar();
                System.out.println("El resultado de la multiplicación " + num1 + " * " + num2 + " es: " + resultado);

                break;
            case 4:
                //división
                resultado = op.getResultado();
                num1 = op.getNum1();
                num2 = op.getNum2();
                System.out.println("El resultado de la división " + num1 + " / " + num2 + " es: " + resultado);
                
                break;
            default:
                //error
                break;
        }
        

    }while(operacion!=5);
    }

}