import java.util.Scanner;

public class Punto7Taller1 {
    public static void main(String[] args){
        double numero;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero:");
        numero=capturaDatos.nextDouble();
        numero=numero-(numero*0.15);

        System.out.println("Descontando el 15% queda: "+numero);

    }
}
