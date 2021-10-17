package Taller3;

import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        int numero;
       int a=0;
       int b=1;
       int c=0;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingresa tamaño de la serie");
        numero=capturaDatos.nextInt();

        for (int i=0;i<numero;i++){
            System.out.println(a);

            c = a+b;
            a=b;
            b=c;
        }
    }
}
