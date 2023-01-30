package edu.truelanz.tratamento_exceptions;

/* import java.io.FileNotFoundException;
import java.io.*; */

public class ExceptionPersonalizada2 {

    public static void main(String[] args) {
        
        int [] numerador = {4, 5, 8, 10};
        int [] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            System.out.println("----------------");
            try {
                
                if(numerador[i] % 2 != 0) 
                    throw new ExceptionPersonalizada3(" Divisão não exata!", numerador [i], denominador[i]);
                
                int resultado = numerador [i] / denominador [i];
                System.out.println(resultado);
                
            } catch (ExceptionPersonalizada3 erro1) {
                System.out.println("ERROR " + erro1.getMessage());
                //erro2.printStackTrace(); */

            } catch (ArithmeticException erro2){
                System.out.println("Não é possível dividir um número por 0.");  

            } catch (ArrayIndexOutOfBoundsException erro3) { //Exception usada para identificar array acessado por um index 'ilegal'.
                System.out.println("Não foi encontrado um numerador para esse denominador. " + erro3.getMessage());
            }
            
        }

        System.out.println("...");

         
    }
    
 }


