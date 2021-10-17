package Taller3;

public class Punto1 {
    public static void main(String[] args) {
        int sumaPares=0;

        for (int i=1;i<=100;i++){
            if (i%2==0) {
                    sumaPares=sumaPares+i;
                }
            }
        System.out.println("La suma es: "+sumaPares);
        }
    }

