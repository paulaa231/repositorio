import java.util.Scanner;

public class Baterias {

    public static void main(String[] args) {

        Scanner entradaEscaner = new Scanner (System.in);


        System.out.println("Introduce un número: ");
        int num1 = entradaEscaner.nextInt();

        System.out.println("Introduce otro número: ");
        int num2 = entradaEscaner.nextInt();

        if (num1 > num2)
            System.out.println("El primer número es mayor que el segundo");
        if (num2 > num1)
            System.out.println("El segundo numero es mayor que el primero");
        if (num1 == num2)
            System.out.println("Los dos números son iguales");


    }
}
