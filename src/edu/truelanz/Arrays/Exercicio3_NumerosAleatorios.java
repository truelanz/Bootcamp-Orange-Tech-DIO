package edu.truelanz.arrays;

import java.util.Random;

public class Exercicio3_NumerosAleatorios {

    /*
     * FAÇÃ UM PROGRAMA QUE LEIA 20 NÚMEROS INTEIROS ALEATÓRIOS (ENTRE 0 E 100).
     * ARMAZENE-OS NUM VETOR.
     * AO FINAL MOSTRE OS NÚMEROS E SEUS SUCESSORES.
     */

    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorNumerosaleatorios = new int[20];
        int i = 0; // <- Contador;

        for(i = 0; i < vetorNumerosaleatorios.length; i++) { // - Enquanto "i" for menor que o comprimento do vetor (.lenght) add + 1.
            int numero = random.nextInt(100); // "bound:100" (limitado a 100) - toda vez
            vetorNumerosaleatorios[i] = numero; // que passa por aqui os números aleatórios são armazenados.
        }

        System.out.print("Números aleatórios: ");
        for(int numero : vetorNumerosaleatorios){ //Aqui repetirá os números armazenados no bloco de cima.
            System.out.print(numero + " | "); // Para cada número que estiver armazenado dentro do vetor, printar na tela.
        }

        System.out.print("\nNúmeros sucessores: ");
        for(int numero : vetorNumerosaleatorios){
            System.out.print(numero + 1 + " | ");
    }
    
 } 

}
