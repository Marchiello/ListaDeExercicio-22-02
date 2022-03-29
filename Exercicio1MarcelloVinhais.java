import java.util.Scanner;

//Faça um programa que leia um número inteiro e retorne seu antecessor e seu sucessor.
//--------------------------------------------------------------------------------------------[]

public class Exercicio1MarcelloVinhais {

    public static void main(String[] args){

        //--------------------------[]

        Scanner Entrada = new Scanner(System.in);
        //--------------------------[]


        System.out.print("---------------------------------------------------------[]\n");
        System.out.println("Insira um Número:");
        int numero;
        numero = Entrada.nextInt();

        //---------------[]

        int antecessor;
        antecessor = numero - 1 ;
        
        //---------------[]
        
        int sucessor;
        sucessor = numero + 1;

        //---------------------------[]
        
        System.out.print("---------------------------------------------------------[]\n\n");
        System.out.println("Número Escolhido: "+numero+"\n");
        
        System.out.println("Número Sucessor: "+sucessor+"\n");

        System.out.println("Número Antecessor: "+antecessor+"\n");
        System.out.print("---------------------------------------------------------[]");

    }
}
 








