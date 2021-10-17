import java.text.DecimalFormat;
import java.util.Scanner;

public class BonusQuiz {
    public static void main(String[] args) {
        double realNumero1;
        double imaginarioNumero1;
        double realNumero2;
        double imaginarioNumero2;
        double sumaReal;
        double sumaImaginaria;
        String signo;
        DecimalFormat df= new DecimalFormat("###.##");

        Scanner capturaDatos= new Scanner(System.in);
        System.out.println("Ingrese la parte real del primer numero imaginario:");
        realNumero1=capturaDatos.nextDouble();

        System.out.println("Ingrese la parte imaginaria del primer numero imaginario(sin la I):");
        imaginarioNumero1=capturaDatos.nextDouble();

        System.out.println("Ingrese la parte real del segundo numero imaginario:");
        realNumero2=capturaDatos.nextDouble();

        System.out.println("Ingrese la parte imaginaria del segundo numero imaginario(sin la I):");
        imaginarioNumero2=capturaDatos.nextDouble();

        sumaReal=realNumero1+realNumero2;
        sumaImaginaria=imaginarioNumero1+imaginarioNumero2;

        if (sumaImaginaria<0){
            signo=" ";
        }else{
            signo=" + ";
        }


        System.out.println(df.format(sumaReal)+signo+df.format(sumaImaginaria)+"i");




    }
}
