import java.util.Scanner;

public class PerimetroTriangulo {
    public static void main(String[] args){
        double lado1;
        double lado2;
        double lado3;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Capture el primer lado:");
        lado1=capturaDatos.nextInt();
        System.out.println("Capture el segundo lado:");
        lado2=capturaDatos.nextInt();
        System.out.println("Capture el tercer lado:");
        lado3=capturaDatos.nextInt();

        double perimetro = lado1+lado2+lado3;

        System.out.println("El perimetro es: "+perimetro);

    }
}
