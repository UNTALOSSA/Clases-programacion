package Taller3;

import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        int numero;
        int multiplicacion=1;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        numero = capturaDatos.nextInt();

        for (int i=1;i<=10;i++){
            multiplicacion=numero*i;

            System.out.println(numero+" X "+i+" = "+multiplicacion);
        }
    }
}
