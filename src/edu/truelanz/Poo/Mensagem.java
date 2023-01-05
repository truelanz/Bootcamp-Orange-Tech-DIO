package edu.truelanz.Poo;

public class Mensagem {

    public static void main(String[] args) {

        Ex1_Carro carro1 = new Ex1_Carro(); //Criação de OBJETO, método construtor vazio.

        carro1.setCor("Azul");
        carro1.setModelo("Honda Civic");
        carro1.setCapacidadeTanque(56);
        carro1.setPrecoCombustivel(5.38);

        System.out.println("A cor do carro é: " + carro1.getCor());
        System.out.println("O modelo do carro é: " + carro1.getModelo());
        System.out.println("A capacidade do carro é: " + carro1.getCapacidadeTanque());
        System.out.println("O valor para encher o tanque é: " + carro1.getCalculo(0));

        System.out.println("");

        Ex1_Carro carro2 = new Ex1_Carro("Preto", "Fusca 96", 41, 5.38); //Utilizando Sobrecarga

        System.out.println("A cor do carro é: " + carro2.getCor());
        System.out.println("O modelo do carro é: " + carro2.getModelo());
        System.out.println("A capacidade do carro é: " + carro2.getCapacidadeTanque());
        System.out.println("O valor para encher o tanque é: " + carro2.getCalculo(0));
        
        

    }
    
}
