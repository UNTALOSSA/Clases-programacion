import java.util.Scanner;

public class EjercicioNumeroN {
    public static void main(String[] args) {
        int numero;
        int sumarN = 0;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero= capturaDatos.nextInt();

        for (int i=1; i<=numero; i++){
           sumarN=sumarN+i;
        }
        System.out.println("La suma es: "+sumarN);
    }
}
