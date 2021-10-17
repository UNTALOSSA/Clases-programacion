import java.util.Scanner;

public class PrimeraClase {
    public static void main(String[] args){
       int suma;

       Scanner miScanner = new Scanner(System.in);
        System.out.println("Mi perro ingrese el numero 1:");
        int num1=miScanner.nextInt();
        System.out.println("Mi perro ingrese el numero 2:");
        int num2=miScanner.nextInt();

        suma=num1+num2;
         System.out.println("La suma da "+suma);
    }
}
