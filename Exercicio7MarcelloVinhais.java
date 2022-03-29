/* A importância de R$ 780.000,00 será dividida entre três ganhadores
de um concurso, sendo que:
    O primeiro ganhador receberá 46% do total;
    O segundo receberá 32% do total;
    O terceiro receberá o restante.
Calcule e imprima a quantia recebida por cada um dos ganhadores
*/
//-----------------------------------------------------------------[]

public class Exercicio7MarcelloVinhais {
    
    public static void main(String[] args){

        //---------------------------[]

        double total;
        total = 780000.00;

        //---------------------------[]

        //---------------------------------------[]

        double valorGanhador1;
        valorGanhador1 = total * 46/100;
        System.out.println("----------------------------------------[]\n");
        System.out.println("O primeiro ganhador receberá: R$"+valorGanhador1+"\n\n");

        //---------------------------------------[]

        //---------------------------------------[]

        double valorGanhador2;
        valorGanhador2 = total * 32/100;
        System.out.println("O segundo ganhador receberá: R$"+valorGanhador2+"\n\n");

        //---------------------------------------[]
        
        double valorGanhador3;
        valorGanhador3 = total * 22/100;
        System.out.println("O terceiro ganhador receberá: R$"+valorGanhador3+"\n");
        System.out.println("----------------------------------------[]\n");


        //---------------------------------------[]
    }   
}
