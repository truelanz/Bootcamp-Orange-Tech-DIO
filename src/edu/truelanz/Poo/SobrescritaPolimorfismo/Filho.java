package edu.truelanz.Poo.SobrescritaPolimorfismo;


//(extends) Subordinando 
class Filho extends Mae {

    /* 
    Override(Sobrescrever) só funciona se os métodos aos quais ele estiver
    Também existirem na classe "MÃE". 
    */
    @Override 
    void metodo1(){
        System.out.println("Filho 1 - Este é o teste do métodos 1");
    }
    

}
