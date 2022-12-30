package edu.truelanz.SmartTv;

public class Usuario {

    SmartTv smartTv = new SmartTv();
    
    public static void main(String []args){


        //Ligando/Desligando a TV.
        System.out.println("TV ligada? "+ SmartTv.onOff);
        System.out.println("");
        System.out.println("Canal atual: "+ SmartTv.canal);
        System.out.println("");
        System.out.println("Volume atual: "+ SmartTv.volume);
        System.out.println("");
        
        SmartTv.desligar ();
        System.out.println("Novo status -> TV ligada? "+ SmartTv.onOff);
        System.out.println("");
        SmartTv.ligar ();
        System.out.println("Novo status -> TV ligada? "+ SmartTv.onOff);


        System.out.println(""); 
        System.out.println(""); 
        
        
        //Aumentando/Diminuindo o volume.
        SmartTv.aumentarVolume();
        System.out.println("-------------------------------------------------------------");
        SmartTv.aumentarVolume();
        System.out.println("-------------------------------------------------------------");
        SmartTv.diminuirVolume();
        System.out.println("-------------------------------------------------------------");
        SmartTv.diminuirVolume();
        System.out.println("-------------------------------------------------------------");
        SmartTv.diminuirVolume();
        System.out.println("-------------------------------------------------------------");
        SmartTv.diminuirVolume();
        System.out.println("-------------------------------------------------------------");
        
        System.out.println(""); 
        System.out.println(""); 


        //Mudando de canal.
        SmartTv.canalMaior();
        System.out.println("-------------------------------------------------------------");
        SmartTv.canalMenor();
        System.out.println("-------------------------------------------------------------");
        SmartTv.canalMenor();
        System.out.println("-------------------------------------------------------------");
        SmartTv.canalMenor();
        System.out.println("-------------------------------------------------------------");
        
        SmartTv.escolhaCanal(0);
        
    }

    


}
