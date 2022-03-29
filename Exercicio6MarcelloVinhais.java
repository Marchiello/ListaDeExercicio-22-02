import java.util.Scanner;

/*Leia um programa que represente uma temperatura em graus Celsius
e apresentá-la convertida em graus Fahrenheit. A fórmula de 
conversão é: F = C*(9.0/5.0)+32.0, sendo F a temperatura em 
Fahrenheit e C a temperatura em Celsius.*/

//----------------------------------------------------------------[]


public class Exercicio6MarcelloVinhais {
    
    public static void main(String[] args){

        //------------------------------------------[]

        Scanner Entrada = new Scanner(System.in);

        //------------------------------------------[]

        System.out.println("----------------------------------------------------[]\n");
        System.out.println("Insira um valor a seguir para ser convertido\nde Graus Celsius para Fahrenheit\n");
        float gCelsius;
        gCelsius = Entrada.nextFloat();
        System.out.println("");
        System.out.println("----------------------------------------------------[]\n");

        //------------------------------------------[]

        float gFahrenheit;
        gFahrenheit = (float)(gCelsius * (9.0/5.0) + 32.0);

        //------------------------------------------[]

        System.out.println(gCelsius+" graus Celsius equivalem a "+gFahrenheit+" graus Fahrenheit\n");
        System.out.println("----------------------------------------------------[]");

    }
}
