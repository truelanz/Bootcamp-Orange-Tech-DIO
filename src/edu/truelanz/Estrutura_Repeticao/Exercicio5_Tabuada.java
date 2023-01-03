package edu.truelanz.Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio5_Tabuada {

    /*
     * DESENVOLA UM GERADOR DE TABUADA CAPAZ DE GERAR A TABUADA DE QUALQUER
     * NÚMERO INTEIRO ENTRE 1 E 10. O USUÁRIO DEVE INFORMAR DE QUAL NÚMERO ELE DESEJA
     * VER A TABUADA. A SAÍDA DEVE SER CONFORME O EXEMPLO ABAIXO:
     * 
     * TABUADA DE 5:
     * 5 X 1 = 5
     * 5 X 2 = 10
     * ....
     * 5 X 10 = 50
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tabuada = 0;
        int i; // Esse é como o "count(contador) do while."

        System.out.println("Digite um número para que você possa ver a Tabuada: ");
        tabuada = scan.nextInt();
        
        System.out.println("Tabuada do " + tabuada + ":");
        System.out.println("...");

        for(i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + tabuada * i);


            /* 
            MANEIRA ALTERNATIVA, PORÉM PIOR DE FAZER:

            if(tabuada == 1){
                System.out.println("1 X " + i + " = " + tabuada * i);
            }else if(tabuada == 2){
                System.out.println("2 X " + i + " = " + tabuada * i);
            }else if(tabuada == 3){
                System.out.println("3 X " + i + " = " + tabuada * i);
            }else if(tabuada == 4){
                System.out.println("4 X " + i + " = " + tabuada * i);
            }else if(tabuada == 5){
                System.out.println("5 X " + i + " = " + tabuada * i);
            }else if(tabuada == 6){
                System.out.println("6 X " + i + " = " + tabuada * i);
            }else if(tabuada == 7){
                System.out.println("7 X " + i + " = " + tabuada * i);
            }else if(tabuada == 8){
                System.out.println("8 X " + i + " = " + tabuada * i);
            }else if(tabuada == 9){
                System.out.println("9 X " + i + " = " + tabuada * i);
            }else if(tabuada == 10){
                System.out.println("10 X " + i + " = " + tabuada * i);
            }
            */
        }
              
    }
    
}
