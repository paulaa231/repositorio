import java.util.Scanner;

public class Pre_ExamenEj5 {


        public static void main(String args[]) {

            Scanner entrada = new Scanner(System.in);
            int sueldo1 = 0;
            int sueldo2 = 0;
            int sueldo3 = 0;
            int sueldo4 = 0;
            int sueldo5 = 0;

            System.out.println("Introduce el primer sueldo:");
            sueldo1 = entrada.nextInt();

            System.out.println("Introduce el segundo sueldo:");
            sueldo2 = entrada.nextInt();

            System.out.println("Introduce el tercer sueldo:");
            sueldo3 = entrada.nextInt();

            System.out.println("Introduce el cuarto sueldo:");
            sueldo4 = entrada.nextInt();

            System.out.println("Introduce el quinto sueldo:");
            sueldo5 = entrada.nextInt();

            int sueldoMaximo = sueldo1; // Comenzar con el primer sueldo
            int contadorMasDeMil = 0;

            // Verificar los sueldos
            if (sueldo2 > sueldoMaximo) sueldoMaximo = sueldo2;
            if (sueldo3 > sueldoMaximo) sueldoMaximo = sueldo3;
            if (sueldo4 > sueldoMaximo) sueldoMaximo = sueldo4;
            if (sueldo5 > sueldoMaximo) sueldoMaximo = sueldo5;

            // Contar los sueldos mayores de 1000€
            if (sueldo1 > 1000) contadorMasDeMil++;
            if (sueldo2 > 1000) contadorMasDeMil++;
            if (sueldo3 > 1000) contadorMasDeMil++;
            if (sueldo4 > 1000) contadorMasDeMil++;
            if (sueldo5 > 1000) contadorMasDeMil++;

            // Mostrar los resultados
            System.out.println("El sueldo más alto es: " + sueldoMaximo + "€");
            System.out.println("Número de sueldos mayores de 1000€: " + contadorMasDeMil);


        }
    }