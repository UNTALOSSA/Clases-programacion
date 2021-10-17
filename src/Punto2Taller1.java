import java.util.Scanner;

public class Punto2Taller1 {
    public static void main(String[] args){
        double numero1;
        int numero2;
        double suma;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero decimal");
        numero1=capturaDatos.nextDouble();
        System.out.println("Ahora or favor ingrese un numero entero");
        numero2=capturaDatos.nextInt();

        suma = numero1+numero2;

        System.out.println("El resultado de la suma es: "+suma);
    }
}
