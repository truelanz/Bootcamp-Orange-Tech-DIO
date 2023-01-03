package edu.truelanz.LogiCondiContrFluxo;

import java.util.Scanner;

public class ExercicioMes {

    public static void main(String [] args) {

        
            Scanner scanner = new Scanner(System.in);
    
           System.out.println("Digite o número de um mês: ");
           int mes = scanner.nextInt();
    
           /*
            * MOSTRE NA TELA O NOME DOS MÊSES DE ACORDO COM O NÚMERO DO MESMO.
            CASO FOR O MÊS DE JULHO, DEZEMBRO OU JANEIRO, INCLUA A PALAVRA "FÉRIAS"
            NO MÊS;
            */
    
           //Método de condicionais de controle de fluxo com "switch case break e default".
    
           switch (mes) { 
            case 1:
            case 7:
            case 12:
            System.out.println("O mês " + mes + " é mês de férias." );
            break;
            case 2:
            System.out.println("O mês " + mes + " é o mês de Fevereiro");
            break;
            case 3:
            System.out.println("O mês " + mes + " é o mês de Março");
            break;
            case 4:
            System.out.println("O mês " + mes + " é o mês de Abril");
            break;
            case 5:
            System.out.println("O mês " + mes + " é o mês de Maio");
            break;
            case 6:
            System.out.println("o mês " + mes + " é o mês de Junho");
            break;
            case 8:
            System.out.println("O mês " + mes + " é o mês de Agosto");
            break;
            case 9:
            System.out.println("O mês " + mes + " é o mês de Setembro");
            break;
            case 10:
            System.out.println("O mês " + mes + " é o mês de Outubro");
            break;
            case 11:
            System.out.println("O mês " + mes + " é o mês de Novembro");   
            break;
            default:
            System.out.println("'ERRO' - Digite apenas números inteiros de 1 a 12.");
            
           }
    
           //Método de condicionais de controle de fluxo com "if e else if"
    
    
         
           if ((mes == 1) || (mes == 12) || (mes == 7)) {
            System.out.println("O mês " + mes + " é um mês de férias." ); 
            if (mes == 2) {
            System.out.println("O mês " + mes + " é o mês de Fevereiro");
           } else if (mes == 3) {
            System.out.println("O mês " + mes + " é o mês de Março");
           } else if (mes == 4) {
            System.out.println("O mês " + mes + " é o mês de Abril");
           } else if (mes == 5) {
            System.out.println("O mês " + mes + " é o mês de Maio");
           } else if (mes == 6) {
            System.out.println("o mês " + mes + " é o mês de Junho");
           } else if (mes == 8) {
            System.out.println("O mês " + mes + " é o mês de Agosto");
           } else if (mes == 9) {
            System.out.println("O mês " + mes + " é o mês de Setembro");
           } else if (mes == 10) {
            System.out.println("O mês " + mes + " é o mês de Outubro");
           } else if (mes == 11) {
            System.out.println("O mês " + mes + " é o mês de Novembro");
           } else {
            System.out.println("Digite apenas números inteiros de número de 1 a 12.");     
         }
    
      }
        
    }
    
 }




   