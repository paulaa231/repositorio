import java.util.Scanner;

public class Pre_ExamenEj4 {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        float nota = 0;

        System.out.println("Pon tu nota: ");
        nota = entrada.nextFloat();

        int nota_final = Math.round(nota);

        System.out.println("Redondeado es " + nota_final);
        //Me redondea los numeros y los vuelve int


        switch (nota_final){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENTE " + nota_final);
                break;

            case 5:
                System.out.println("SUFICIENTE " + nota_final);
                break;

            case 6:
                System.out.println("BIEN " + nota_final);
                break;

            case 7:
            case 8:
                System.out.println("NOTABLE " + nota_final);
                break;
            case 10:
                System.out.println("SOBRESALIENTE " + nota_final);
                break;
            default:
                System.out.println("no válido");
                break;


        }

    }
}