package edu.truelanz.desafio1;

   //------------------- //CLASSE MÃE\\ -------------------------\\

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d; //protected, somente as classe filhas terao acesso

    private String titulo, descricao;
    
    public abstract double calcularXp(); //abstract não pode ser instanciada 'new' (Criar objeto com ela.)

    public Conteudo() { //CONTRUCTOR VAZIO\\
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}
