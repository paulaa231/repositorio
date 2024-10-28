package Hola;

public class pruebas {

    public static void main(String args[]) {

        int i = 0;

        System.out.println("Estructura de for: ");
        for (i = 1; i < 10; i++) {
                System.out.print(i + ",");
            if (i == 9) {
            i++;
                System.out.print(i);
            }
        }
        System.out.println("");
        i = 1;
        System.out.println("Estructura de while: ");

        while (i<10){
            System.out.print(i + ", ");
            i++;
        }
        System.out.print(i);
        i=1;
        System.out.println("");
        System.out.println("Estructura de do-while: ");

        do {
            i++;

            if (i < 10) {
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            }
        }while (i <= 9) ;
  }
}