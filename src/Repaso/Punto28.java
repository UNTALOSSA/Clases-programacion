package Repaso;

import java.util.Scanner;

public class Punto28 {
    public static void main(String[] args) {
        int tamañoTriangulo;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Ingresa tamaño del triangulo");
        tamañoTriangulo = capturaDatos.nextInt();

        for (int i=1;i<=tamañoTriangulo;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
