package edu.truelanz.Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio6_Fatorial {

    /*
     * FAÇA UM PROGRAMA QUE CALCULE O FATORIAL DE UM NÚMERO
     * INTEIRO FORNECIDO PELO USUÁRIO.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Digite um número inteiro: ");
        long numero = scan.nextInt();
        
        long resultado = 1;

        for(long i = numero; i >= 1; i--){
            resultado *= i;
    }
             System.out.println(numero + "! = " + resultado);
  }
    
}
