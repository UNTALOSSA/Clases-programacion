import java.util.Scanner;

public class clase4 {
    public static void main(String[] args) {
        double valorProducto;

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingrese el valor del producto:");
        valorProducto=capturaDatos.nextDouble();

        if (valorProducto>20000){
            valorProducto=valorProducto*1.19;
            System.out.println("El valor con iva del 19% incluido es: "+valorProducto);
        }else{
            valorProducto=valorProducto*1.16;
            System.out.println("El valor con iva del 16% incluido es: "+valorProducto);
        }
    }
}
