package Taller2;
import java.util.Scanner;

public class Punto3Taller2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;

        System.out.println("Indique un número: ");
        numero = input.nextInt();

        if ((numero % 2) == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }
    }
}
