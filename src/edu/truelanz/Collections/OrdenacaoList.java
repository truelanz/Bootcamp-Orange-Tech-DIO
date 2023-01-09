package edu.truelanz.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Dadas as seguintes informações sobre meus gatos, crie uma lista
 * e ordene esta lista exibita:
 * (nome - idade - cor);
 * 
 * Gato 1 = nome: jon, idade: 18, cor: preto
 * Gato 2 = nome: Simba, idade: 6, cor: tigrado
 * Gato 3 = nome: jon, idade: 12, cor: amarelo
 */

public class OrdenacaoList {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("jon", 12, "amarelo"));
        }};

        //Ordem de inserção:
        System.out.println("\nOrdem Inserção:\n" + meusGatos);

        //Ordem aleatória com Collections.shuffle e for each:
        Collections.shuffle(meusGatos);
        for (Gato num : meusGatos) {
        }
        System.out.println("\nOrdem Aleatória:\n" + meusGatos);

        //Comparar com a ordem natural - 1º class "NomeDaClass" implements Comparable<class>:
        //2º @Override e comparableTo()
        Collections.sort(meusGatos);
        System.out.println("\n Ordem Natural \n" + meusGatos);

        //Ordem Idade(int) 2 maneira diferentes de fazer:
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println("\nOrdem da Idade \n" + meusGatos);

        //Ordem Cor (String) de acordo com a ordem alfabético
        //da primeira letra dos nomes das cores:
        Collections.sort(meusGatos, new ComparatorCor());
        //meusGatos.sort(new ComparatorCor());
        System.out.println("\nOrdem da Cor:\n" + meusGatos);

        //Ordem por Nome/Cor/Idade, se um for igual compare com outro.
        meusGatos.sort(new ComparatorNomeCorIdade());
        //Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println("\nComparar Nome, Cor e Idade:\n" + meusGatos);
        

    }         
        
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;


    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String nome() {
        return nome;
    }

    public Integer idade() {
        return idade;
    }

    public String cor() {
        return cor;
    }

    @Override
    public String toString(){
        return "nome: " + nome + '\'' +
        ", idade: " + idade + '\'' +
        ", cor: " + cor + '\'' + '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.nome().compareToIgnoreCase(gato.nome());
    }


}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.idade(), g2.idade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.cor().compareToIgnoreCase(g2.cor());
    }   
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.nome().compareToIgnoreCase(g2.nome());  
        if(nome != 0) return nome;

        int cor = g1.cor().compareToIgnoreCase(g2.cor());
        if(cor != 0) return cor;

        return Integer.compare(g1.idade(), g2.idade());
    }
    
}

    

