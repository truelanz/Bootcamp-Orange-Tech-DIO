package edu.truelanz.Arrays;

import java.util.Scanner;

public class Exercicio2_Consoantes {

    /*
     * FAÇA UM PROGRAMA QUE LEIA UM VETOR DE 6 CARACTERES,
     * E DIGA QUANTAS CONSOANTES FORAM LIDAS.
     * IMPRIMA AS CONSOANTES.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;        
        int contador = 0;
        
    do {
        System.out.println("Letra: ");
        String letra = scan.next();
        
        if(!(letra.equalsIgnoreCase("a") |
        letra.equalsIgnoreCase("e") |
        letra.equalsIgnoreCase("i") |
        letra.equalsIgnoreCase("o") |
        letra.equalsIgnoreCase("u"))) {
            consoantes[contador] = letra;
            quantidadeConsoantes++;
        }
        
        contador++;
        
    }while(contador < consoantes.length);

        System.out.print("As consoantes são: ");
        for (String consoante : consoantes) {
            if(consoante != null){ // <- Caso queira que "null" NÃO apareça.
                System.out.print(consoante + " | ");
            
        }    
    }

    System.out.println("- Foram lidas: " + quantidadeConsoantes + " consoantes.");
    
 }

}
