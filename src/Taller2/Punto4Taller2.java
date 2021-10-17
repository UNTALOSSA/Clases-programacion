package Taller2;

import java.util.Scanner;

public class Punto4Taller2 {
    public static void main(String[] args){
        int edad;
        int cantidadProductos;
        boolean decision=true;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        edad=capturaDatos.nextInt();
        System.out.println("Ingrese la cantidad de productos comprados:");
        cantidadProductos=capturaDatos.nextInt();

        if (edad>18 && cantidadProductos>1){
            System.out.println(decision);
        }else{
            decision=false;
            System.out.println(decision);
        }
    }
}
