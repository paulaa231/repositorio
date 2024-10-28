import java.util.Scanner;

public class Pre_ExamenEj2 {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        int num = 0;

        int numbase = 0;
        int numexp = 0;
        int resultado = 0;
        int contador = 0;
        System.out.println("Introduce base");
        numbase = entrada.nextInt();

        System.out.println("Introduce exponente");
        numexp = entrada.nextInt();
        resultado = numbase;
        for (contador=1;contador<numexp;contador++){

            resultado = numbase * resultado;

        }
        System.out.println("El resultado es " + resultado);





    }
}
