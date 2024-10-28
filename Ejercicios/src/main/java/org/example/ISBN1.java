package Hola;
import java.util.Scanner;
public class ISBN1 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String isbn = "";

        System.out.println("Introduce un ISBN:");
        isbn = entrada.nextLine();

        if (isbn.length() == 9) {
            System.out.println("El ISBN está incompleto. Falta un digito: " + isbn + "?");
        } else if (isbn.length() != 10) {
            System.out.println(isbn + " no es un ISBN.");
        }

        int sum = 0;
        boolean validacion = true;

        try {
            for (int i = 0; i < 9; i++) {
                char digit = isbn.charAt(i);
                if (digit < '0' || digit > '9') {
                    validacion = false;
                    break;
                }
                sum += (digit - '0') * (10 - i);
            }

            char letra = isbn.charAt(9);
            if (Character.toLowerCase(letra) == 'x') {
                sum += 10;
            } else if (letra >= '0' && letra <= '9') {
                sum += (letra - '0');
            } else {
                validacion = false;
            }

            if (validacion && sum % 11 == 0) {
                System.out.println(isbn + " es un ISBN válido.");
            } else {
                System.out.println(isbn + " no es un ISBN válido.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}