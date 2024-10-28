package Hola;
import java.util.Scanner;
public class Pre_ExamenEj6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el número de alumnos: ");
            int N = scanner.nextInt();

            int totalEdad = 0;
            int totalAltura = 0;
            int mayoresDe18 = 0;
            int mayoresDe175 = 0;

            for (int i = 1; i <= N; i++) {
                System.out.print("Ingrese la edad del alumno " + i + ": ");
                int edad = scanner.nextInt();

                System.out.print("Ingrese la altura (cm) del alumno " + i + ": ");
                int altura = scanner.nextInt();

                totalEdad += edad;
                totalAltura += altura;

                if (edad > 18) {
                    mayoresDe18++;
                }
                if (altura > 175) {
                    mayoresDe175++;
                }
            }

            double edadMedia = (double) totalEdad / N;
            double alturaMedia = (double) totalAltura / N;

            System.out.println("Edad media: " + edadMedia);
            System.out.println("Altura media: " + alturaMedia);
            System.out.println("Cantidad de alumnos mayores de 18 años: " + mayoresDe18);
            System.out.println("Cantidad de alumnos que miden más de 175 cm: " + mayoresDe175);

            scanner.close();
        }
    }




