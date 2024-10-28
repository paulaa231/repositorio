package Hola;

import java.util.Scanner;

public class Calculadora {

        public static void main(String[] args) {

            int num1 = 0, num2 = 0, resultado = 0;
            String signo ="";
            Scanner entrada = new Scanner(System.in);

            System.out.println("¡Bienvenido a la calculadora simple!");

            try{

            System.out.println("Introduce el primer operando: ");
            num1 = entrada.nextInt();

            System.out.println("Introduce el signo a aplicar (+,-,/,x,R): ");
            signo = entrada.nextLine();

            if(signo == "R"){
                if (num1 < 0) {
                    System.out.println("Error: Introduce un número positivo");
                } else {
                    resultado = (int) Math.sqrt(num1);
                    System.out.printf("El resultado de la operación es: " + resultado);
                }

            }

            System.out.println("Introduce el segundo operando: ");
            num2 = entrada.nextInt();


            switch (signo) {

                case "+":

                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case "/":
                    resultado = num1 / num2;
                    System.out.println("El resultado de la division es: " + resultado);
                    break;
                case "x":
                    resultado = num1 * num2;
                    break;
                default:
                    System.out.println("ERROR. Esa operavion no existe");
                    break;
                }
    } catch (Exception e) {
                System.out.println("Introdce un numero valido");
                throw new RuntimeException(e);
            }
        }

}


