import java.util.Scanner;

public class Punto6Taller1 {
    public static void main(String[] args){
        double numero1;
        double numero2;
        double numero3;
        double promedio;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer numero:");
        numero1= capturaDatos.nextDouble();
        System.out.println("Por favor ingrese el segundo numero:");
        numero2= capturaDatos.nextDouble();
        System.out.println("Por favor ingrese el tercer numero:");
        numero3= capturaDatos.nextDouble();

        promedio=(numero1+numero2+numero3)/3;

        System.out.println("El promedio de los numeros ingresados es: "+promedio);

    }
}
