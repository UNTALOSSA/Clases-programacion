import java.util.Scanner;

public class Punto5Taller1 {
    public static void main(String[] args){
        double temperatura;
        double temperaturaCelsius;
        float formulaParte3= (float) 0.5555555556;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Por favor ingrese la temperatura en Fahrenheit:");
        temperatura=capturaDatos.nextDouble();
        temperaturaCelsius= formulaParte3*(temperatura-32);
        System.out.println("Temperatura en Celsius es:"+temperaturaCelsius);
    }
}
