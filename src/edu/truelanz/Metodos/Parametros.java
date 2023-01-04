package edu.truelanz.Metodos;

public class Parametros {

    public static void main(String[] args) {
        
        // Calculadora

        System.out.println("Resultados:");
        Calculadora.soma(8.5, 8.8);
        Calculadora.subtracao(50.2, 30.4);
        Calculadora.multiplicacao(3, 2);
        Calculadora.divisao(12, 2.5);

        // Cumprimentos
        
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(20);

        //Emprestimo

        Emprestimo.juroPessoal(119.5, 8500);
        Emprestimo.juroConsignado(22.5, 180000);
        Emprestimo.duasParcelas(1000);
        Emprestimo.tresParcelas(1000);
        Emprestimo.calcularParcelas(1000, 2); //Teste de outro método
        Emprestimo.calcularParcelas(1000, 3); //Teste de outro método
        Emprestimo.calcularParcelas(1000, Emprestimo.metodoTresParcelas()); // Invocando uma Classe e método, dentro de uma Classe e método
        Emprestimo.calcularParcelas(1000, 5); //Valor inválido

    }
    
}
