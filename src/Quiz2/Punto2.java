package Quiz2;

import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        double ahorros;
        int años;
        final double interes=1.04;


        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Ingresa el ahorro inicial");
        ahorros=capturaDatos.nextInt();
        System.out.println("Ingresa los años que piensas ahorrar");
        años=capturaDatos.nextInt();

        for (int i=1;i<=años;i++){
            ahorros=ahorros*interes;
            System.out.println("La suma en el año "+i+" es: "+ahorros);
        }

    }
}
