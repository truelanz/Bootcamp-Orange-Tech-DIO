package edu.truelanz.Poo.SobrescritaPolimorfismo;

public class Executar {

    public static void main(String[] args) {
        
        Mae[] classes = new Mae[] {new Filho(), new Filho2(), new Mae()};

        for(Mae classe : classes) {
            classe.metodo1();
        }
        
        System.out.println("");
        
        for(Mae classe : classes) {
            classe.metodo2();
        }
        
        System.out.println("");

        Filho filho = new Filho();
        filho.metodo2(); //Invocando um método individualmente.
        //Sobrescrita Pura sem polimorfismo.
        
        
        
    }
    
}
