import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args){
        double base;
        double altura;
        int formula=2;
        double area;

        Scanner calculoArea= new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo:");
        base=calculoArea.nextInt();
        System.out.println("Ingrese la altura del triangulo:");
        altura=calculoArea.nextInt();

        area=(base*altura)/formula;

        System.out.println("El area es: "+area);
    }
}
