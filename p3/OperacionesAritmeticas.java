import java.util.Scanner;

public class OperacionesAritmeticas{
    
    private float num1;
    private float num2;
    private float resultado;

    Scanner sc;

    public OperacionesAritmeticas(){
        //inicializa el scanner
        sc = new Scanner(System.in);
    }


    public void sumar(){

        System.out.println("Ingrese el primer operando");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo operando");
        num2 = sc.nextFloat();
        resultado = num1 + num2;

        System.out.println("El restulado de la suma " + num1 + " + " + num2 + " es: " + resultado);
    }

    
    private void ImprimirResultado(){
        System.out.println("El restulado de la resta " + num1 + " - " + num2 + " es: " + resultado);
    }

    public void restar(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = num1 - num2;
        ImprimirResultado();
    }
    
    public float multiplicar(){
        System.out.println("Ingrese el primer operando");
        this.num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo operando");
        this.num2 = sc.nextFloat();
        this.resultado = this.num1 * this.num2;
        return this.resultado;
    }

    public float dividir(){
        //valida si la división es entre cero, para mandar error
        System.out.println("Ingrese el primer operando");
        this.num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo operando");
        this.num2 = sc.nextFloat();
        if(this.num2 == 0){
            System.out.println("No se puede dividir entre cero");
            return 0;
        }
        this.resultado = this.num1 / this.num2;
        return this.resultado;
    }

    public float getNum1(){
        return this.num1;
    }

    public float getNum2(){
        return this.num2;
    }

    public float getResultado(){
        return this.resultado;
    }
    

}