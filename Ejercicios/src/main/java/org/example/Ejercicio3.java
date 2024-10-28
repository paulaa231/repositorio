import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entradaEscaner = new Scanner(System.in);


        System.out.println("Introduce un número: ");
        int num1 = entradaEscaner.nextInt();

        System.out.println("Introduce otro número: ");
        int num2 = entradaEscaner.nextInt();


        if (num1 == 0)
            System.out.println("ERROR: no se puede dividir entre 0");
        if (num2 == 0)
            System.out.println("ERROR: no se puede dividir entre 0");

        int resultado = num1 / num2;
        System.out.println("El resultado es " + resultado);;
    }
}