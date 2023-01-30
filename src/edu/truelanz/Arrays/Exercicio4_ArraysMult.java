package edu.truelanz.arrays;

import java.util.Random;

public class Exercicio4_ArraysMult {

    // GERE E IMPRIMA UMA MATRIZ M 4X4 COM VALORES ALEATÓRIOS ENTRE 0-9.

    public static void main(String[] args) {

        Random random = new Random();


        int[][] m = new int[4][4];

        random.nextInt(9);

        for(int i = 0; i < m.length; i++){ // i e j - dois contadores.
            for(int j = 0; j < m.length; j++) {
                m[i][j] = random.nextInt(9); 
            }

        }
        System.out.println("matriz: ");
        for (int[] linha : m) { //foreach
            for (int coluna : linha) {
                System.out.print(coluna + " | ");
                
            }

            System.out.println("");
        }
        
    }
    
}
