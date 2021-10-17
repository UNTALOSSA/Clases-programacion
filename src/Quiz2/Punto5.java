package Quiz2;

import java.util.Locale;
import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        String tipoAtaque;
        String tipoPokemon;
        final String tipo1="NEUTRAL";
        final String tipo2="FUEGO";
        final String tipo3="AGUA";
        final String tipo4="PLANTA";
        int potenciaAtaque;
        double dañoRecibido;
        final double superEficaz=2;
        final int neutral=1;
        final double pocoEficaz=0.5;

        Scanner capturaDatos = new Scanner(System.in);
        System.out.println("Tipo de ataque");
        tipoAtaque = capturaDatos.next().toUpperCase(Locale.ROOT);
        System.out.println("Tipo pokemon");
        tipoPokemon = capturaDatos.next().toUpperCase(Locale.ROOT);
        System.out.println("Potencia ataque");
        potenciaAtaque = capturaDatos.nextInt();

        if (tipoAtaque.equals(tipo1)){
            switch (tipoPokemon){
                case "NEUTRAL":
                    dañoRecibido = potenciaAtaque*neutral;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "FUEGO":
                    dañoRecibido = potenciaAtaque*neutral;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "AGUA":
                    dañoRecibido = potenciaAtaque*neutral;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "PLANTA":
                    dañoRecibido = potenciaAtaque*neutral;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                default:
                    break;
            }
        }
        if (tipoAtaque.equals(tipo2)){
            switch (tipoPokemon){
                case "NEUTRAL":
                    dañoRecibido = potenciaAtaque*neutral;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "FUEGO":
                    dañoRecibido = potenciaAtaque*pocoEficaz;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "AGUA":
                    dañoRecibido = potenciaAtaque*pocoEficaz;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "PLANTA":
                    dañoRecibido = potenciaAtaque*superEficaz;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                default:
                    break;
            }

        }
        if (tipoAtaque.equals(tipo3)){
            switch (tipoPokemon){
                case "NEUTRAL":
                    dañoRecibido = potenciaAtaque*neutral;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "FUEGO":
                    dañoRecibido = potenciaAtaque*superEficaz;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "AGUA":
                    dañoRecibido = potenciaAtaque*pocoEficaz;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "PLANTA":
                    dañoRecibido = potenciaAtaque*pocoEficaz;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                default:
                    break;
            }

        }
        if (tipoAtaque.equals(tipo4)){
            switch (tipoPokemon){
                case "NEUTRAL":
                    dañoRecibido = potenciaAtaque*neutral;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "FUEGO":
                    dañoRecibido = potenciaAtaque*pocoEficaz;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "AGUA":
                    dañoRecibido = potenciaAtaque*superEficaz;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                case "PLANTA":
                    dañoRecibido = potenciaAtaque*pocoEficaz;
                    System.out.println("Daño recibido: "+dañoRecibido);
                    break;
                default:
                    break;
            }

        }

    }
}
