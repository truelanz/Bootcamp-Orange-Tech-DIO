package edu.truelanz.padroes_de_projetos.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se em modo de defesa...");
        
    }
    
}
