package edu.truelanz.condicional_controle_de_fluxo;

public class OpRelacionais {

    /*
     * Operadores Relacionais, compara a relação "booleana" (true/false) de dois ou mais operandos. 
     */

    public static void main(String [] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Ciclano";
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1 >= i2);
        System.out.println(i1 != d1);
        System.out.println(f2 == i1);

        System.out.println(s1 == s2);
        System.out.println(s1 != s3);
        System.out.println(b1 == b2);
        System.out.println(b2 != b1);

        //System.out.println(s1 == i2); - Exemplos de Tipos que operações
        //System.out.println(b1 <= b2);   impossíveis de serem comparadas.
        //System.out.println(s1 >= s3);

        System.out.println(s1 == s2);
        System.out.println(c1 >= c2);
        System.out.println(f1 == c2);
    }
    
}
