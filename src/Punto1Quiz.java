import java.util.Scanner;

public class Punto1Quiz {
    public static void main(String[] args){
        int horasTrabajadas;
        int costeHora;
        int valorPago;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas:");
        horasTrabajadas=capturaDatos.nextInt();
        System.out.println("Ingrese el coste de la hora:");
        costeHora=capturaDatos.nextInt();

        valorPago= horasTrabajadas*costeHora;

        System.out.println("El valor a pagar es: "+valorPago);

    }
}
