package edu.truelanz.padroes_de_projetos.strategy;

public class Robo {

    /**
     * -- Strategy --
     * 
     * " O objeto original, chamado contexto, mantém uma referência
     * a um objeto strategy e o delega a execução do comportamento. 
     *  Para alterar a maneira como o contexto executa seu trabalho,
     * outros objetos podem substituir o objeto strategy atualmente
     * vinculado por outro."
     * 
     * @see <a href = "https://www.youtube.com/watch?v=rC296hM-S4g&ab_channel=AlgaWorks">Aula vídeo
     * @see <href = "https://www.devmedia.com.br/estudo-e-aplicacao-do-padrao-de-projeto-strategy/25856">Artigo
     */

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    
    public void mover() {
        comportamento.mover();
    }
    
}
