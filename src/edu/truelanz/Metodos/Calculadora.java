package edu.truelanz.Metodos;

public class Calculadora {

    /*
     * Crie uma aplicação que resolva as seguintes situações:
     Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. 
     Sempre 2 valores devem ser passados.
     */

     //SOMA
 
     public static void soma(double numero1, double numero2){
    //visibilidade-retorno-nome-parametros.\\
        double resultado = numero1 + numero2;

        System.out.println("O resultado da soma é: " + resultado);
    }

    //SUBTRAÇÃO
    
    public static void subtracao(double numero1, double numero2){
    
       double resultado = numero1 - numero2;
    
       System.out.println("O resultado da subtração é: " + resultado);
       
    }
    
    //MULTIPLICAÇÃO

    public static void multiplicacao(double numero1, double numero2){
    
       double resultado = numero1 * numero2;
    
       System.out.println("O resultado da multiplicação é: " + resultado);

    }

    //DIVISÃO
    
    public static void divisao(double numero1, double numero2){
    
       double resultado = numero1 / numero2;
    
       System.out.println("O resultado da divisão é: " + resultado);

    }

}