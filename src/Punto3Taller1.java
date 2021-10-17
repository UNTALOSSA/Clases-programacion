import java.util.Scanner;

public class Punto3Taller1 {
    public static void main(String[] args){
        int numero1;
        int numero2;
        int suma;
        int numero3;
        int multiplicacion;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Por favor ingrese un primer numero entero");
        numero1=capturaDatos.nextInt();
        System.out.println("Ahora or favor ingrese un segundo numero entero");
        numero2=capturaDatos.nextInt();
        suma = numero1+numero2;
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("Ahora or favor ingrese un tercer numero entero");
        numero3=capturaDatos.nextInt();
        multiplicacion=suma*numero3;
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);

    }
}
