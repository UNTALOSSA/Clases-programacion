import java.util.Scanner;

public class Punto4Quiz {
    public static void main(String[] args){
        int ahorros;
        double intereses=1.04;
        double valorAhorroFinal;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Cantidad de dinero depositado:");
        ahorros=capturaDatos.nextInt();

        valorAhorroFinal=ahorros*intereses;
        System.out.println("El valor de ahorro el primer año es: "+valorAhorroFinal);
        valorAhorroFinal=valorAhorroFinal*intereses;
        System.out.println("El valor de ahorro del segundo año es: "+valorAhorroFinal);
        valorAhorroFinal=valorAhorroFinal*intereses;
        System.out.println("El valor de ahorro del segundo año es: "+valorAhorroFinal);

    }
}
