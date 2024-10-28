package Hola;
import java.util.Scanner;

public class Login {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        String pas = "";

        System.out.println("Introduce nombre");
        nombre = entrada.nextLine();

        System.out.println("Introduce tu contraseña: ");
        pas = entrada.nextLine();


        if (nombre.equalsIgnoreCase("Paula")) {

            System.out.println("Tu nombre es correcto");
        }else{
            System.out.println("Tu nombre no es correcto");
        }

        if(pas.equalsIgnoreCase("123")){
            System.out.println("Tu contraseña es correcta");
        }else{
            System.out.println("Tu contraseña no es correcta");

        }
    }
}



