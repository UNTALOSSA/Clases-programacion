package Quiz2;

import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        int valor;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Ingrese el tamaño");
        valor = capturaDatos.nextInt();

        for (int i=1;i<=valor;i++){
            for (int j=i;j>=1;j--){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
