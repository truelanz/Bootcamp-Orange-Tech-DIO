package edu.truelanz.Estrutura_Repeticao;

import java.util.Scanner;

        /*
         * FAÇA UM PROGRAMA QUE PEÇA "N" NÚMEROS INTEIROS, CALCULE
         * E MOSTRE A QUANTIDADE DE NÚMEROS PARES E A QUANTIDADE DE
         * NÚMEROS IMPARES. 
         */

public class Exercicio4_ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 0;
        int quantidadePar = 0, quantidadeImpar = 0;

        System.out.println("Digite uma quantidade de números: ");
        int quantidadeNumeros = scan.nextInt();

        do{
            System.out.println("Número: ");
            int numero = scan.nextInt();
            System.out.println("");

            if(numero % 2 == 1)
            quantidadeImpar++;                          
            else 
            quantidadePar++;
                     
        contador++;
        }while(contador < quantidadeNumeros);

        System.out.println("A quantidade de números pares é de: " + quantidadePar + " números.");
        System.out.println("A quantidade de números ímpares é de: " + quantidadeImpar + " números.");
        System.out.println("");
    
    }
    
}
