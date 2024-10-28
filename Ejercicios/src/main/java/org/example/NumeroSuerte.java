package Hola;

import java.util.Scanner;

public class NumeroSuerte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que introduzca la fecha de nacimiento
        System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa:");
        String fecha = sc.nextLine();

        // Dividir la fecha de nacimiento en día, mes y año
        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);

        // Sumar el día, mes y año
        int sumaFecha = dia + mes + año;

        // Calcular el número de la suerte sumando los dígitos de la suma
        int numeroSuerte = sumarDigitos(sumaFecha);

        // Mostrar el número de la suerte
        System.out.println("Tu número de la suerte es: " + numeroSuerte);
    }

    // Método para sumar los dígitos de un número
    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;  // Extraer el último dígito
            numero /= 10;         // Eliminar el último dígito
        }

        // Si la suma tiene más de un dígito, volver a sumar
        if (suma >= 10) {
            suma = sumarDigitos(suma);
        }

        return suma;
    }
}
