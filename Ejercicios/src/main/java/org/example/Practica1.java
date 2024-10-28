import java.util.Date;
import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("INTRODUCE TU FECHA DE NACIMIENTO = dd/mm/aaaa");

        System.out.println("Introduce tu día de nacimiento");
        int dia = entradaEscaner.nextInt();

        System.out.println("Introduce tu mes de nacimiento");
        int mes = entradaEscaner.nextInt();

        System.out.println("Introduce tu año de nacimiento");
        int anio = entradaEscaner.nextInt();

        System.out.println("Tu fecha es "+ dia+ "/" +mes+ "/" +anio);

        int num_suerte=dia+mes+anio;
        System.out.println("El resultado es "+ num_suerte );

        String numA = Integer.toString(num_suerte);
        String numA_1 = numA.substring(0,1);
        int num_1 = Integer.parseInt(numA_1);

        String numB = Integer.toString(num_suerte);
        String numB_1 = numB.substring(1,2);
        int num_B = Integer.parseInt(numB_1);

        String numC = Integer.toString(num_suerte);
        String numC_1 = numC.substring(2,3);
        int num_C = Integer.parseInt(numC_1);

        String numD = Integer.toString(num_suerte);
        String numD_1 = numD.substring(3,4);
        int num_D = Integer.parseInt(numD_1);

        System.out.println(num_1+" + "+num_B+" + "+num_C+" + "+num_D );

       int num_suerte2=num_1+num_B+num_C+num_D;
        System.out.println("Tu número de la suerte es "+ num_suerte2 );
    }
}