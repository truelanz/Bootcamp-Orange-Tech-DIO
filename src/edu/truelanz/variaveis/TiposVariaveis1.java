package edu.truelanz.variaveis;

import java.util.Scanner;

public class TiposVariaveis1{

    public static void main(String [] args){

        //CALCULE QUAL O M2 (METRO QUADRADO) DE UM DETERMINADO LOCAL.

        try (Scanner in = new Scanner(System.in)) {
            double x = 0;
            double y = 0;
            
            System.out.println("Digite o comprimento: ");
            x = in.nextDouble();
            
            System.out.println("Digite a largura: ");
            y = in.nextDouble();
            
            double m2 = x*y;

            System.out.println(m2 + "m2");
        }




    }


}