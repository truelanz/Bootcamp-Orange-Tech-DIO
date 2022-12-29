package edu.truelanz.SmartTv;

import java.util.Scanner;

public class SmartTv {

        static boolean onOff = false;
        static int canal = 1;
        static int volume = 25;

        //LIGANDO/DESLIGANDO A TV.
        public static void ligar(){
            onOff = true;
        }
        public static void desligar(){
            onOff = false;
        }


        //AUMENTANDO/DIMINUINDO O VOLUME.
        public static void aumentarVolume(){
            volume++;
            System.out.println("Aumentando volume: " +volume);
        }
        public static void diminuirVolume(){
            volume--;
            System.out.println("Diminuindo volume: " +volume);           
    }


        //MUDANDO DE CANAL.
        public static void canalMaior(){
            canal++;
            System.out.println("Canal " +canal);
            if(canal>=3)
                System.out.println(canal +" Esse canal NÃO existe, diminua!");
                else if(canal ==2){
                    System.out.println("(truelanz Channel)");
                    }else if(canal ==1){
                        System.out.println("(Shit Channel) #Perigo, alerta para derretimento de cérebro!");
                    }
                }
                
        
        public static void canalMenor(){
            canal--;
            System.out.println("Canal " +canal);
            if(canal<=0)
                System.out.println(canal +" Esse canal NÃO existe, aumente!");
                else if (canal == 2){
                    System.out.println("(truelanz Channel)");
                }else if (canal == 1){
                    System.out.println("(Shit Channel) #Perigo, alerta para derretimento de cérebro!");
                }

            }

            static Scanner in = new Scanner(System.in);
        public static void escolhaCanal(int escolhaCanal){
            System.out.println("Escolha de 1 a 2 para qual canal você quer ir");
            escolhaCanal = in.nextInt();
            if(escolhaCanal<=0 && escolhaCanal>=3)
                System.out.println(" Esse canal NÃO existe, aumente!");
            else if (escolhaCanal == 2){
                System.out.println("(truelanz Channel)");
            }else if (escolhaCanal == 1){
                System.out.println("(Shit Channel) #Perigo, alerta para derretimento de cérebro!");
            }
            
        }
}