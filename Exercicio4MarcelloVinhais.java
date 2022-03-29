import java.util.Scanner;

/*leia uma velocidade em km/h (quilômetros por hora) e apresente 
convertida em m/s (metros por segundo). A fórmula 
de conversão é M = K/36, sendo K a velocidade em km/h e M em m/s.*/
//-----------------------------------------------------------------[]

public class Exercicio4MarcelloVinhais {
    
    public static void main(String[] args){

        //-------------------------------------------[]

        Scanner Entrada = new Scanner(System.in);

        //-------------------------------------------[]
        
        System.out.println("------------------------------------------------[]\n");
        System.out.println("Insira uma velocidade a seguir:");
        int velocidadeKmH;
        velocidadeKmH = Entrada.nextInt();
        System.out.println("");
        System.out.println("------------------------------------------------[]\n");



        //-------------------------------------------[]
        
        double velocidadeMs;
        velocidadeMs = velocidadeKmH / 3.6;

        System.out.println("A velocidade inserida equivale a\n"+velocidadeMs+"m/s(Metros por segundo)\n");
        System.out.println("------------------------------------------------[]");

        //-------------------------------------------[]




    }

}
