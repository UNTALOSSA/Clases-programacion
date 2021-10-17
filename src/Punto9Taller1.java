import java.util.Scanner;

public class Punto9Taller1 {
    public static void main(String[] args){
        String palabra1;
        int tamañoCadena;
        int numeroPositivo;
        char primerLetra;
        char segundaLetra;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Por favor ingrese la primera palabra:");
        palabra1=capturaDatos.nextLine();
        primerLetra=palabra1.charAt(0);
        System.out.println("La primera letra es: "+primerLetra);

        tamañoCadena=palabra1.length();
        System.out.println("Ingresa un numero positivo menor que: "+tamañoCadena);

        numeroPositivo=capturaDatos.nextInt();
        segundaLetra=palabra1.charAt(numeroPositivo-1);
        System.out.println("El caracter en la posicion "+numeroPositivo+" es: "+segundaLetra);




    }
}
