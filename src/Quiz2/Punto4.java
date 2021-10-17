package Quiz2;

import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        int numero;
        //String numeroAlreves;
        int tamañoCadena;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Ingresa un numero positivo");
        numero = capturaDatos.nextInt();

        String numeroString = String.valueOf(numero);
        tamañoCadena= numeroString.length();

        for (int i=tamañoCadena-1;i>=0;i--){
          char letra= numeroString.charAt(i);
          System.out.print(letra);

        }


    }
}
