import java.util.Scanner;

/*Faça um programa que leia a cotação do dólar. Em seguida, imprima 
o valor correspondente em reais.*/
//-----------------------------------------------------------------[]


public class Exercicio5MarcelloVinhais {

    public static void main(String[] args){

        //-----------------------------------------[]

        Scanner Entrada = new Scanner(System.in);
        
        //-----------------------------------------[]

        //-----------------------------------------------------------[]

        System.out.println("---------------------------------[]\n");
        System.out.println("Insira a seguir um valor em\nDolar para ser convertido em Real\n");
        double valorDolar;
        valorDolar = Entrada.nextDouble();
        System.out.println("");
        System.out.println("---------------------------------[]\n");

        //-----------------------------------------------------------[]

        /* Hoje, 19/03/2022 as 14:19, a cotação do dolar está 
        a: 1 Dolar = R$5,02 Reais */

        //-----------------------------------------[]

        double valorReal;
        valorReal = valorDolar * 5.02;

        System.out.println("$"+valorDolar+" Dolar/es equivale/m a\nR$"+valorReal+" Real/is.\n");
        System.out.println("---------------------------------[]\n");

        //-----------------------------------------[]
    }
}
