package Repaso;

import java.util.Scanner;

public class Punto11 {
    public static void main(String[] args) {
        String cadenaTexto;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Ingresa los productos comprados separados por una coma (,)");
        cadenaTexto = capturaDatos.next();

        String vectorTexto[] = cadenaTexto.split(",");

        for (int i=0;i<= vectorTexto.length-1;i++){
            System.out.println(vectorTexto[i]);
        }


    }
}
