import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;
import java.util.stream.Stream;


public class Code {
    private static List<String> lista_nombres  = new ArrayList<>();
    private static Scanner sc;

    public Code() {
        sc = new Scanner(System.in);
    }

    public static void nombres(){
        for(int i = 0;i<5;i++){
            lista_nombres.add("Nombre {i}");
            System.out.println(i);
        }
    }
    public static void imprimir(){
        for(String string: lista_nombres){
            System.out.println(string);
        }
    }

    public static void insertar(){
        lista_nombres.add(0,"Juan x");  
    }

    public static void borrar(){
        lista_nombres.remove("Juan x");
    }

    public static void iterar(){
        Iterator <String> it = lista_nombres.iterator();

        System.out.print(it.next()); 
    }

    public static void sustituir(){
        lista_nombres.set(0, "Pedro z");
    }

    public static void streamer(){
        Stream <String> stream =lista_nombres.stream();
        stream.forEach(elemento -> System.out.print(elemento));
    }

    public static void buscar(){
        System.out.println(lista_nombres.indexOf("Juan x"));
    }

    public static void get_1(){
        String valor =lista_nombres.get(0);
        System.out.print(valor);
    }
    public static void get_ultimo(){
        int size = lista_nombres.size();
        String nombre = lista_nombres.get(size-1);
        System.out.println(nombre);
    }

    public static void main(String[] args){
        nombres();
        
        insertar();
        get_1();
        get_ultimo();

    

    }   

}
