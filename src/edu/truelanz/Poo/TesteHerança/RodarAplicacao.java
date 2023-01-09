package edu.truelanz.Poo.TesteHerança;

public class RodarAplicacao {

    /*
     * CLASSE RESPONSÁVEL POR INTERLIGAR E GERENCIAR AS CLASSES
     * FILHAS E A CLASSE MÃE.
     */

    public static void main(String[] args) {

        //Criando objeto funcionario
        Funcionario funcionario = new Funcionario();
        
        /*
        *Fazendo upcasts de classes/objetos
        de maneira mais direta, graças ao
        "<classe> <Filha> extends <classeMae>"
        */
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
        

    }
    
}
