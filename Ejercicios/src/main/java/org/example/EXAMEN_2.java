
package Hola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXAMEN_2 {
    public static void main(String[] args) {

        try {
        Scanner entradaEscaner = new Scanner(System.in);


            System.out.println("Introduce la nota del primer trimestre: ");
            float num1 = entradaEscaner.nextInt();

            System.out.println("Introduce la nota del segundo trimestre: ");
            float num2 = entradaEscaner.nextInt();

            System.out.println("Introduce la nota del tercer trimestre: ");
            float num3 = entradaEscaner.nextInt();






            float nota_media = num1 + num2 + num3;
            float nota_mediareal = nota_media / 3;

            System.out.println("La nota media es " + nota_mediareal);


            if (nota_mediareal < 5)
                System.out.println("SUSPENSO ");

            if (nota_mediareal >= 5)
                System.out.println("APROBADO ");


    } catch (InputMismatchException ex) {
        System.out.println("Nota fuera de rango (0-10). Vuelve a introducirlas..." +
                "Introduce la nota del primer trimestre (0-10):  ");



    }
    }}

