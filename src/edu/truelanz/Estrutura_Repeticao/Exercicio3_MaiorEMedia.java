package edu.truelanz.Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio3_MaiorEMedia {

    /*
     * FAÇA UM PROGRAMA QUE LEIA 5 NÚMEROS E INFORME O MAIOR
     * NÚMERO E A MÉDIA DESSES NÚMEROS.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double maiorNumero = 0;
        double mediaNumero = 0;
        double soma = 0;
        double contador = 0; //Variável criada como parâmetro para o while.

        do{ //"Faça isso :"
            System.out.println("Digite um número: ");
            double numero = scan.nextDouble();

            soma = soma + numero;
            
            if(numero > maiorNumero) //Todas as vezes que o clico passar por aqui será
            maiorNumero = numero; //conferido se o "número" é maior que o "maiorNumero."
             // só se for maior será executado "maiorNumero = numero."

            mediaNumero = soma / 5;
        
             contador++;
        }while(contador < 5); // - Enquanto o contador for menor que 5. 
        
        System.out.println("----------------------------");
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("A média dos números é: " + mediaNumero);

    }
    
}
