import java.util.Scanner;

public class Punto3Quiz {
    public static void main(String[] args){
        int pesoPayaso=112;
        int pesoMuñeca=75;
        int pedidoPayaso;
        int pedidoMuñeca;
        int pedidototal;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de payasos comprados:");
        pedidoPayaso=capturaDatos.nextInt();
        System.out.println("Ingrese la cantidad de muñecas compradas:");
        pedidoMuñeca=capturaDatos.nextInt();

        pedidototal=((pesoPayaso*pedidoPayaso)+(pesoMuñeca*pedidoMuñeca));
        System.out.println("El pedido total tiene un peso de: "+pedidototal+"Kg");



    }
}
