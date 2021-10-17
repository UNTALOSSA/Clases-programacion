package Taller3;

import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        int numero;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingresa un numero entero mayor a cero");
        numero= capturaDatos.nextInt();
        System.out.println("Los numeros divisibles de "+numero+" son:");
        for (int i=1;i<=numero;i++){
            if (numero%i == 0){
                System.out.println(i);
            }
        }
    }
}
