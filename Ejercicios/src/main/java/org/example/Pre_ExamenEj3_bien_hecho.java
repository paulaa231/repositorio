import java.util.Scanner;


public class Pre_ExamenEj3_bien_hecho {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        int total = 0;
        int pago = 10;
        int mesfinal = 0;
        int mes = 0;


        System.out.println("Introduce tu mes de financiacion:");
        mesfinal = entrada.nextInt();
        if (mes>=0){
            System.out.println("mes " + 1 + " pagará " + 10);
        }

        for(mes=2;mes<=mesfinal;mes++ ){
            pago = pago*2;

            System.out.println("mes " + mes + " pagará " + pago);
        }

    }

}
