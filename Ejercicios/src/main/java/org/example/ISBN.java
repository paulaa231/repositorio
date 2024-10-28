package Hola;

import java.util.Scanner;

public class ISBN {
    public static void main(String args[]){

        int isbn = 0;
        int resultado = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un isbn: ");
        isbn = teclado.nextInt();

        String numA = Integer.toString(isbn);
        String numA_1 = numA.substring(0,1);
        int num1 =Integer.parseInt(numA_1);

        num1 = num1*10;

        String numB = Integer.toString(isbn);
        String numB_1 = numB.substring(1,2);
        int num2 =Integer.parseInt(numB_1);

        num2 = num2*9;

        String numC = Integer.toString(isbn);
        String numC_1 = numC.substring(2,3);
        int num3 =Integer.parseInt(numC_1);

        num3 = num3*8;

        String numD = Integer.toString(isbn);
        String numD_1 = numD.substring(3,4);
        int num4 =Integer.parseInt(numD_1);

        num4 = num4*7;

        String numE = Integer.toString(isbn);
        String numE_1 = numE.substring(4,5);
        int num5 =Integer.parseInt(numE_1);

        num5 = num5*6;

        String numF = Integer.toString(isbn);
        String numF_1 = numF.substring(5,6);
        int num6 =Integer.parseInt(numF_1);

        num5 = num6*5;

        String numG = Integer.toString(isbn);
        String numG_1 = numG.substring(6,7);
        int num7 =Integer.parseInt(numG_1);

        num5 = num7*4;

        String numH = Integer.toString(isbn);
        String numH_1 = numH.substring(7,8);
        int num8 =Integer.parseInt(numH_1);

        num8 = num8*3;

        String numJ = Integer.toString(isbn);
        String numJ_1 = numH.substring(8,9);
        int num9 =Integer.parseInt(numJ_1);

        num9 = num9*2;



        isbn = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9)/11;


        if (isbn == 0) {
            System.out.println("OLE, EL ISBN ES CORRESCTO ");


        }else{
            System.out.println("OLE, EL ISBN ES CORRESCTO ");




            }
        }
    }

