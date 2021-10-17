import java.util.Scanner;

public class Punto2Quiz {
    public static void main(String[] args){
        int enteroPositivo;
        int sumaEnteros;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingrese un N positivo:");
        enteroPositivo=capturaDatos.nextInt();

        sumaEnteros=(enteroPositivo*(enteroPositivo+1))/2;

        System.out.println("La suma de los N primeros enteros es: "+sumaEnteros);


    }
}
