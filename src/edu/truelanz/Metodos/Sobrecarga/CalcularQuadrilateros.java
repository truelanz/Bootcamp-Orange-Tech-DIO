package edu.truelanz.Metodos.Sobrecarga;

public class CalcularQuadrilateros {

    /*
     * CRIA UMA APLICAÇÃO QUE CALCULA A ÁREA DOS 3 QUADRILÁTEROS NOTÁVEIS:
     * QUADRADO, RETÂMGULO E TRAPÉZIO.
     */

     public static void getQuadrilateros(double lado) {

        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
    }

     public static void getQuadrilateros(double ladoMenor, double ladoMaior) {

        double area = ladoMenor * ladoMaior;
        System.out.println("A área do retângulo é: " + area);
        
    }
    
    public static void getQuadrilateros(double baseMaior, double altura, double baseMenor) {

       double area = ((baseMaior + baseMenor) * altura);
       System.out.println("A área do trapézio é: " + area);
    
    }

    //EXTRA - LOSANGULO
    
     public static void getQuadrilateros(float diagonal1, float diagonal2) {

        System.out.println("A área do losangulo é: " + diagonal1 * diagonal2);

     }

}
