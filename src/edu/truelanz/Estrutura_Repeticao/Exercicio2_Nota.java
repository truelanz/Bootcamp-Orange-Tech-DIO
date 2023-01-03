package edu.truelanz.Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio2_Nota {
    
    /*
     * FAÇA UM PROGRAMA QUE PEÇA UMA NOTA, ENTRE ZERO E DEZ.
     * MOSTRE UMA MENSAGEM CASO O VALOR SEJA INVÁLIDO
     * E CONTINUE PEDINDO ATÉ QUE O USUÁRIO INFORME UM
     * VALOR VÁLIDO.
     */

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


       System.out.println("Informe uma nota entre '0' e '10'");
       double nota = scan.nextDouble();

       while(nota < 0 | nota > 10) { //loop caso a proposta não seja cumprida.
        System.out.println("VALOR INVÁLIDO!");
        nota = scan.nextDouble();
      }

      System.out.println("Obrigado, nota válida");
                   
  }
}



