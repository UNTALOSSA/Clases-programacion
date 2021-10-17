package Taller2;


import java.util.Scanner;

public class Punto2Taller2 {
    public static void main(String[] args){
        int fechaEntera;
        char dia1;
        char dia2;
        char mes1;
        char mes2;
        char año1;
        char año2;
        char año3;
        char año4;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingrese la fecha en formato DDMMAAAA");
        fechaEntera=capturaDatos.nextInt();

        String fechaTexto= String.valueOf(fechaEntera);
        dia1=fechaTexto.charAt(0);
        dia2=fechaTexto.charAt(1);
        mes1=fechaTexto.charAt(2);
        mes2=fechaTexto.charAt(3);
        año1=fechaTexto.charAt(4);
        año2=fechaTexto.charAt(5);
        año3=fechaTexto.charAt(6);
        año4=fechaTexto.charAt(7);

        System.out.println(dia1+""+dia2+" / "+mes1+""+mes2+" / "+año1+""+año2+""+año3+""+año4);

    }
}
