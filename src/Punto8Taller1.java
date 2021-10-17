import java.util.Scanner;

public class Punto8Taller1 {
    public static void main(String[] args){
        String palabra1;
        String palabra2;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Por favor ingrese la primera palabra:");
        palabra1=capturaDatos.next();
        System.out.println("Por favor ingrese la segunda palabra:");
        palabra2=capturaDatos.next();

        System.out.println(palabra1+" "+palabra2);

    }
}
