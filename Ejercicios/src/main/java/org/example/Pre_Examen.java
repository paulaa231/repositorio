import java.util.Scanner;

public class Pre_Examen {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        int num = 0;

        System.out.println("Introduce numeros");
        num = entrada.nextInt();

        if (num>0){
            System.out.println(num +" es mayor que 0");

        } else if (num<0) {
            System.out.println(num +" es menor que 0");

        }else{
            System.out.println(num +" es igual que 0");
        }


        int numbase = 0;
        int numexp = 0;
        int contador = 0;

        System.out.println("Introduce base");
        numbase = entrada.nextInt();

        System.out.println("Introduce exponente");
        numexp = entrada.nextInt();

        while (contador == numexp){
            numbase=numbase*numbase;
            contador++;
        }
        System.out.println("El resultado es " + numbase);
    }
}

