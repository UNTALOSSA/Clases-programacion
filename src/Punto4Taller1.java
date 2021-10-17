import java.util.Scanner;

public class Punto4Taller1 {
    public static void main(String[] args){
        double kilometros;
        double litrosCombustible;
        double consumo;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Por favor ingrese el kilometraje recorrido:");
        kilometros=capturaDatos.nextDouble();
        System.out.println("Por favor ingrese los litros de combustible consumidos:");
        litrosCombustible=capturaDatos.nextDouble();
        consumo=kilometros/litrosCombustible;
        System.out.println("El consumo por kilometro es: "+consumo);

    }
}
