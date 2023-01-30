package edu.truelanz.arrays;

public class Exercicio1_OrdemInversa {

    /*
     * CRIE UM VETOR DE 6 NÚMEROS INTEIROS
     * E MOSTRE NA ORDEM INVERSA.
     */

    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println(vetor);

        System.out.print("Vetor normal: ");
        int contador = 0;
        while(contador < (vetor.length)) { //length mostra a quantidade de itens que tem dentro do vetor.
           System.out.print(vetor[contador] + " | ");
           contador++;
        } 
        System.out.print("\nVetor na ordem inversa: ");
        for(int i = (vetor.length -1); i >= 0; i--) {
            System.out.print(vetor[i] + " | ");
        }
    }
    
}
