package edu.truelanz.SmartTv;

public class Usuario {

    SmartTv smartTv = new SmartTv();
    
    public static void main(String []args){


        //Ligando/Desligando a TV.
        System.out.println("TV ligada? "+ SmartTv.onOff);
        System.out.println("Canal atual: "+ SmartTv.canal);
        System.out.println("Volume atual: "+ SmartTv.volume);

        SmartTv.ligar ();
        System.out.println("Novo status -> TV ligada? "+ SmartTv.onOff);
        SmartTv.desligar ();
        System.out.println("Novo status -> TV ligada? "+ SmartTv.onOff);


        
        //Aumentando/Diminuindo o volume.
        SmartTv.aumentarVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        


        //Mudando de canal.
        SmartTv.canalMaior();
        System.out.println("(truelanz Channel)");
        SmartTv.canalMenor();
        System.out.println("(Shit Channel) #Perigo, alerta para derretimento de cérebro!");
        SmartTv.canalMenor();
        SmartTv.canalMenor();
        
    }

    


}
