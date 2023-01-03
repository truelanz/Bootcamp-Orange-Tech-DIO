package edu.truelanz.LogiCondiContrFluxo;

public class OpLogicos {

    public static void main(String [] args) {

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println((i1 + i2) < (f2 - f1) && true); //true se tudo for true;       
        System.out.println((i1 > i2) || (f2 < f1)); //false se ambos forem falsos.
               


        
    }
    
}
