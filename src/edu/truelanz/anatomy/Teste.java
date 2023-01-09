package edu.truelanz.anatomy;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("velocidade: ");
        int velocidade = leitor.nextInt();
        System.out.println("multas: ");
        int multas = leitor.nextInt();
        
        if (velocidade <= 80 ) {
            System.out.format("%d multas. Nao levou pontos na carteira", multas);
        }else if (multas <2){
            System.out.format("%d multas. Nao levou pontos na carteira", multas +1);
        } else{
            System.out.format("%d multas. Levou pontos na carteira", multas+1);
        }

    }
}
        // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade

        // TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação

