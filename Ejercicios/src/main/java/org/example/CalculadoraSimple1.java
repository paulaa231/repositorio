import java.util.Scanner;

public class CalculadoraSimple1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int resultado = 0;
        char signo = 0;
        int num2 = 0;
        int num1 = 0;
        System.out.println("¡Bienvenido a la calculadora simple!");

        try {
            System.out.print("Introduce el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Introduce el signo de la operación (+, -, /, x, R para raíz cuadrada): ");
            signo = scanner.next().toLowerCase().charAt(0);


            if (signo != 'r') {
                System.out.print("Introduce el segundo número : ");
                num2 = scanner.nextInt();
            }

            switch (signo) {
                case '+':
                    resultado = num1 + num2;
                    System.out.printf("El resultado de la suma es: " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.printf("El resultado de la resta es: " + resultado);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir por 0.");
                    } else {
                        resultado = num1 / num2;
                        System.out.printf("El resultado de la division es: " + resultado);
                    }
                    break;
                case 'x':
                    resultado = num1 * num2;
                    System.out.printf("El resultado de la multiplicación es: " + resultado);
                    break;
                case 'r':
                    if (num1 < 0) {
                        System.out.println("Error: No se puede hacer la raiz cuadrada de un numero negativo.");
                    } else {
                        resultado = (int) Math.sqrt(num1);
                        System.out.printf("El resultado de la operación es: " + resultado);
                    }
                    break;
                default:
                    System.out.println("ERROR: La operación no es válida.");
                    break;
            }

        } catch (Exception e) {
            System.out.println("ERROR: Valores no válios.");
        }
    }
}
