package edu.truelanz.Poo.SobrescritaPolimorfismo;

class Filho2 extends Mae {

    /* 
    Override(Sobrescrever) só funciona se os métodos aos quais ele estiver
    Também existirem na classe "MÃE". 
    */
    @Override
    void metodo1(){
        System.out.println("Filho 2 - Este é o teste do métodos 1");
    }
    
    @Override
    void metodo2(){
        System.out.println("Filho 2 - Este é o teste do métodos 2");
       }
    
    
}
