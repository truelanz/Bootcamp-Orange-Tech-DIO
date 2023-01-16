package edu.truelanz.TratamentoException;

import javax.swing.JOptionPane;

public class UncheckedException {

    public static void main(String[] args) {
        
        boolean continuelooping = true;
        
    do { 
            
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denomidador: ");

    try{
        int resultado = dividir (Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);
        continuelooping = false;

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Não é possível dividir com letras! " + e.getMessage());
        //e.printStackTrace();
        
    } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(null, "Não é possível dividir por '0'! ");
        //e.printStackTrace();

    } finally {
        System.out.println("-Chegou no finally-");
    }
    }while(continuelooping);

        System.out.println("\nContinua o código...");

    }

private static int dividir(int a, int b) {
    return a / b;
    }
    
}
