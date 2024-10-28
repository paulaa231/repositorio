package Hola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {


    public  void practica3() {

        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String nombre = entradaEscaner.next();
        int edad=0;

        try {

            System.out.println("Hola " + nombre + " introduce tu edad:");
             edad = entradaEscaner.nextInt();

        } catch (InputMismatchException ex){
            System.out.println("Vuelve a introducir tu edad");

        }

        if (edad >= 18) {
            System.out.println("Enhorabuena " + nombre + " puedes votar");
        } else {
            int contador = 0;
            while (edad < 18) {
                contador++;
                edad++;
            }

            System.out.println("Lo siento " + nombre + " no puedes votar. Te faltan " + contador + " años para ser mayor de edad.");
        }

    }
}