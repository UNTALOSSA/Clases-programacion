package Taller3;

import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        int numero;
        double sumaSucesion=0;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingresa un numero");
        numero=capturaDatos.nextInt();

        for (int i=1;i<=numero;i++){
            sumaSucesion = sumaSucesion+Math.pow(2,i);
        }
        System.out.println("La suma de la sucesion es: "+sumaSucesion);
    }
}
