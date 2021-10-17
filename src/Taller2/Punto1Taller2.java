package Taller2;

import java.util.Scanner;

public class Punto1Taller2 {
    public static void main(String[] args){
        int numeroShows;
        boolean decision=true;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("A cuantos shows ha ido en el ultimo año?");
        numeroShows=capturaDatos.nextInt();

        if (numeroShows>3){
            System.out.println(decision);
        }else{
            decision=false;
            System.out.println(decision);
        }
    }
}
