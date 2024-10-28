package Hola;

import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {

        Scanner entradaEscaner = new Scanner(System.in);


        System.out.println("Introduce el multiplicando (3 cifras): ");
        int num1 = entradaEscaner.nextInt();

        System.out.println("Introduce el multiplicador (3 cifras): ");
        int num2 = entradaEscaner.nextInt();

        int resultado = num1 * num2;
        System.out.println("El resultado es " + resultado);;

        String num1C = Integer.toString(num2);
        String numC_1 = num1C.substring(0,1);
        int num_1 = Integer.parseInt(numC_1);
        System.out.println("La primera cifra es " + num_1);

        String num2C = Integer.toString(num2);
        String numC_2 = num2C.substring(1,2);
        int num_2 = Integer.parseInt(numC_2);
        System.out.println("La segunda cifra es " + num_2);

        String num3C = Integer.toString(num2);
        String num3_2 = num2C.substring(2,3);
        int num_3 = Integer.parseInt(num3_2);
        System.out.println("La tercera cifra es " + num_3);


    }
}