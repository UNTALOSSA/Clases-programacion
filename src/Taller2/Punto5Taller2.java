package Taller2;

import java.util.Scanner;

public class Punto5Taller2 {
    public static void main(String[] args){
        String texto;
        int tamañoTexto;
        boolean decision=true;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingrese un texto");
        texto=capturaDatos.nextLine();
        tamañoTexto=texto.length();

        if ((tamañoTexto % 2)==0){
            decision=false;
            System.out.println(decision);
        }else{
            System.out.println(decision);
        }
    }





}

