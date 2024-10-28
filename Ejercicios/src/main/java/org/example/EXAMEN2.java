package Hola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXAMEN2 {

    public static void main(String[] args) {
        try {
            Scanner entradaEscaner = new Scanner(System.in);

            System.out.println("Introduce un número: ");
            int num1 = entradaEscaner.nextInt();
            {
                if (num1 < 0)
                    num1 = num1 * (-1);
            }
            System.out.println("El valor absoluto es " + num1);


        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Introduce un número valido. ");
        }

    }
}
