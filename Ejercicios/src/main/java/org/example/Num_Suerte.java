package Hola;

import java.util.Scanner;

public class Num_Suerte {

    public static void main(String args[]){

        int dia = 0, mes = 0, ayo = 0, resultado = 0;
        Scanner in = new Scanner(System.in);




        System.out.println("Introduce tu dia de nacimiento: ");
        dia = in .nextInt();

        System.out.println("Introduce tu mes de nacimiento: ");
        mes = in .nextInt();

        System.out.println("Introduce tu año de nacimiento: ");
        ayo = in .nextInt();


        if(dia<=0) {
            System.out.println("ERROR, introduce un número valido que no sea negativo ni 0 ");
        } else if (mes <= 0) {
            System.out.println("ERROR, introduce un número valido que no sea negativo ni 0 ");
        }else if (ayo <= 0) {
            System.out.println("ERROR, introduce un número valido que no sea negativo ni 0 ");
        }


        resultado = dia + mes + ayo;

        System.out.println("La suma da: " + resultado);

        String numA = Integer.toString(resultado);
        String numA_1 = numA.substring(0,1);
        int num1 =Integer.parseInt(numA_1);

        String numB = Integer.toString(resultado);
        String numB_1 = numB.substring(1,2);
        int num2 =Integer.parseInt(numB_1);

        String numC = Integer.toString(resultado);
        String numC_1 = numC.substring(2,3);
        int num3 =Integer.parseInt(numC_1);

        String numD = Integer.toString(resultado);
        String numD_1 = numD.substring(3,4);
        int num4 =Integer.parseInt(numD_1);

        resultado = num1 + num2 + num3 + num4;
        System.out.println("Tu número de la suerte es " + resultado);


    }
}
