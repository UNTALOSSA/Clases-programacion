package Quiz2;

import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        int numeroIteraciones=0;
        int numeroSolicitado=0;
        int sumaTotal=0;

        System.out.println("Favor ingresa el numero de iteracciones que requieras");
        Scanner capturaDatos= new Scanner(System.in);
        numeroIteraciones=capturaDatos.nextInt();

        for (int i = 1; i<=numeroIteraciones; i++){
            System.out.println("Ingresa un numero");
            numeroSolicitado= capturaDatos.nextInt();
            sumaTotal= sumaTotal+numeroSolicitado;
        }
        System.out.println("La suma total de los numeros ingresados es: "+sumaTotal);
    }
}
