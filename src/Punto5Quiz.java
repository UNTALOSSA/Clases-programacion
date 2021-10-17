import java.text.DecimalFormat;
import java.util.Scanner;

public class Punto5Quiz {
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;
        double redondeo;
        DecimalFormat df= new DecimalFormat("###.##");

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingreso tu peso:");
        peso=capturaDatos.nextDouble();
        System.out.println("Ingresa tu altura:");
        altura=capturaDatos.nextDouble();

        imc = (peso/(altura*altura));

        System.out.println("Tu indice de masa corporal es: "+df.format(imc));

    }
}
