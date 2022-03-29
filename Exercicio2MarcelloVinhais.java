import java.util.Scanner;

//Faça um programa que leia três valores inteiros e mostre sua soma.
//-------------------------------------------------------------------[]

public class Exercicio2MarcelloVinhais {
    
    public static void main(String[] args){

        //------------------------------------------[]
        Scanner Entrada = new Scanner(System.in);
        //-----------------[]
        int valor1;
        int valor2;
        int valor3;
        //-----------------[]


        //---------------------------------------------------------------------------------[]
        
        System.out.println("-------------------------------------------------------[]\n\n");
        System.out.println("A Seguir, insira 3 valores:\n\n");
        
        //---------------------------------------------------------------------------------[]
        
        valor1 = Entrada.nextInt();
        System.out.println("----------------------------------[]");
        valor2 = Entrada.nextInt();
        System.out.println("----------------------------------[]");
        valor3 = Entrada.nextInt();
        System.out.println("----------------------------------[]\n\n");
        
        //---------------------------------------------------------------------------------[]

        int soma;
        soma = valor1 + valor2 + valor3;

        //---------------------------------------------------------------------------------[]

        System.out.println("A Soma dos Valores Inseridos É De: "+soma+"\n\n");

        System.out.println("----------------------------------[]");

        //---------------------------------------------------------------------------------[]

    }
}