package edu.truelanz.Metodos;

public class Mensagem {

    /*
     * Enviar uma mensagem de Bom dia, Boa tarde ou Boa noite.
     * De acordo com o horário do dia.
     */

     public static void obterMensagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                bomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                boaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                boaNoite();
                break;
        }

    }
     
     public static void bomDia() {
        System.out.println("Olá. Bom dia!");
     }
     
     public static void boaTarde() {
        System.out.println("Olá. Boa tarde!");
     }
     public static void boaNoite() {
        System.out.println("Olá. Boa Noite!");
     }
   

}
