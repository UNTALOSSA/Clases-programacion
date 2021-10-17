package Taller2;

import java.util.Scanner;

public class Punto6Taller2 {
    public static void main(String[] args){
        String palabra1;
        String palabra2;
        int tamañoPalabra1;
        int tamañoPalabra2;
        boolean decision=true;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingrese una primer palabra");
        palabra1=capturaDatos.next();
        System.out.println("Ingrese una segunda palabra");
        palabra2=capturaDatos.next();

        tamañoPalabra1=palabra1.length();
        tamañoPalabra2=palabra2.length();

        if (tamañoPalabra1<tamañoPalabra2){
            System.out.println(decision);
        }else{
            decision=false;
            System.out.println(decision);
        }
    }
}
