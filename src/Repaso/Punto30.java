package Repaso;

import java.util.Scanner;

public class Punto30 {
    public static void main(String[] args) {
        int tamañoTriangulo;


        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Ingresa tamaño del triangulo");
        tamañoTriangulo = capturaDatos.nextInt();

        for (int i=1;i<=tamañoTriangulo;i++){
                int multi = i*2;

                for (int z=multi;z>=1;z--){
                    if (z % 2 != 0){
                        System.out.print(z);
                    }
                }

                //System.out.print("*");

            System.out.println("");
        }
    }
}
