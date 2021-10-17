package Taller2;

import java.util.Scanner;

public class Punto7Taller2 {
    public static void main(String[] args) {
        int posicionUltimaLetra;
        int posicionUltimaLetra2;
        String primerNombre;
        String segundoNombre;
        char primeraLetra;
        char segundaLetra;
        char ultimaLetra1;
        char ultimaLetra2;
        boolean decision=true;


        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Favor ingresa el primer nombre:");
        primerNombre= capturaDatos.next();
        System.out.println("Favor ingresa el segundo nombre:");
        segundoNombre= capturaDatos.next();

        primeraLetra=primerNombre.charAt(0);
        segundaLetra=segundoNombre.charAt(0);
        posicionUltimaLetra=primerNombre.length()-1;
        posicionUltimaLetra2=segundoNombre.length()-1;
        ultimaLetra1=primerNombre.charAt(posicionUltimaLetra);
        ultimaLetra2=segundoNombre.charAt(posicionUltimaLetra2);




        if (primeraLetra==segundaLetra || ultimaLetra1==ultimaLetra2) {
            System.out.println(decision);
            }else{
                decision=false;
            System.out.println(decision);
            }

        }

    }

