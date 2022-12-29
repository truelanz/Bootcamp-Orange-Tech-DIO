package edu.truelanz.SmartTv;

public class SmartTv {

        static boolean onOff = false;
        static int canal = 1;
        static int volume = 25;

        //Ligando/Desligando a TV.
        public static void ligar(){
            onOff = true;
        }
        public static void desligar(){
            onOff = false;
        }

        //Aumentando/Diminuindo o volume.
        public static void aumentarVolume(){
            volume++;
            System.out.println("+1 " +volume);
        }
        public static void diminuirVolume(){
            volume--;
            System.out.println("-1 " +volume);           
    }

        //Mudando de Canal.
        public static void canalMaior(){
            canal++;
            System.out.println("Canal " +canal);
            if(canal>=10)
                System.out.println("Esse canal NÃO existe, diminua!");
        }
        public static void canalMenor(){
            canal--;
            System.out.println("Canal " +canal);
            if(canal<=0)
                System.out.println("Esse canal NÃO existe, aumente");
            }
}