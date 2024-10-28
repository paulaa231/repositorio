package Hola;


import java.util.Scanner;

    public class NumeroDeLaSuerte {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            String fechaNacimiento = scanner.nextLine();

            // Separar el día, mes y año
            String[] partes = fechaNacimiento.split("/");
            if (partes.length != 3) {
                System.out.println("Formato de fecha incorrecto. Por favor, usa dd/mm/aaaa.");
                return;
            }

            try {
                int dia = Integer.parseInt(partes[0]);
                int mes = Integer.parseInt(partes[1]);
                int anio = Integer.parseInt(partes[2]);

                // Calcular el número de la suerte
                int sumaTotal = dia + mes + anio;
                int numeroDeLaSuerte = calcularSumaDigitos(sumaTotal);

                System.out.println("Tu número de la suerte es: " + numeroDeLaSuerte);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce números válidos.");
            }
        }

        // Método para calcular la suma de los dígitos
        private static int calcularSumaDigitos(int numero) {
            int suma = 0;
            while (numero > 0) {
                suma += numero % 10;
                numero /= 10;
            }
            return suma;
        }
    }



