package Taller3;

import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        int numero;
        int factorial=1;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingresa un numero");
        numero=capturaDatos.nextInt();

        for (int i=1;i<=numero;i++){
             factorial= factorial*i;
        }

        System.out.println("El factorial es: "+factorial);
    }
}
