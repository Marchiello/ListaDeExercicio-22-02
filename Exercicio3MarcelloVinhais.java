import java.util.Scanner;

/*Faça um programa que calcula o ano de nascimento 
de uma pessoa a partir de sua idade e do ano atual.*/
//------------------------------------------------------[]
public class Exercicio3MarcelloVinhais {
    
    public static void main(String[] args){

        //------------------------------------------[]
        Scanner Entrada = new Scanner(System.in);
        //------------------------------------------[]


        //-------------------------------------------------------------[]
        
        System.out.println("------------------------------------[]\n");
        System.out.println("Insira seu ano de Nascimento:\n");

        //--------------------------------[]

        int anoNascimento;
        anoNascimento = Entrada.nextInt();
        System.out.println("");

        //--------------------------------[]

        System.out.println("------------------------------------[]\n");
        System.out.println("Insira o Ano Atual:\n");

        //--------------------------------[]

        int ano;
        ano = Entrada.nextInt();
        System.out.println("");

        //--------------------------------[]
        
        int idade;
        idade = ano - anoNascimento;

        //--------------------------------[]

        System.out.println("------------------------------------[]\n\n");
        System.out.println("Sua idade é de "+idade+" anos\n\n");
        System.out.println("------------------------------------[]");



    }
}
