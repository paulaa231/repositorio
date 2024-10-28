package Hola;

import java.util.Scanner;

public class ISBN3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un ISBN: ");
        String isbn = entrada.nextLine();

        if (isbn.length() != 10) {
            System.out.println("El ISBN no es válido.");
            return;
        }

        int suma = 0;
        boolean validacion = false;
        int posicion = -1;

        for (int i = 0; i < 10; i++) {
            char x = isbn.charAt(i);
            if (x == '?') {
                validacion = true;
                posicion = i;
            }

            int conversion;

            if (x == 'X' || x == 'x') {
                conversion = 10;
            } else if (x >= '0' && x <= '9') {
                conversion = x - '0';
            } else {
                System.out.println("El ISBN no es válido.");
                return;
            }

            if (i != 9) {
                suma += conversion * (10 - i);
            } else {
                suma += conversion;
            }
        }


        if (validacion) {
            for (int digit = 0; digit <= 9; digit++) {
                int sumita = suma;


                sumita += digit * (10 - posicion);


                if (posicion == 9) {
                    sumita += 10;
                } else {
                    char ultimaLetra = isbn.charAt(9);
                    if (ultimaLetra == 'X' || ultimaLetra == 'x') {
                        sumita += 10;
                    } else {
                        sumita += ultimaLetra - '0';
                    }
                }

                if (sumita % 11 == 0) {
                    System.out.println("El ISBN es válido.");
                }
            }
            System.out.println("El ISBN no es válido.");
        }

        if (suma % 11 == 0) {
            System.out.println("El ISBN es válido.");
        } else {
            System.out.println("El ISBN no es válido.");
        }
    }
}