package edu.truelanz.TratamentoException;

import java.io.*;

import javax.swing.JOptionPane;

public class CheckException {

    public static void main(String[] args) throws IOException {

        String conversation = "english-conversation.txt";
        
        
        try {
            imprimirNoTerminal(conversation);
        } catch (FileNotFoundException error1) { //Casso não for encontrado o arquivo no objeto "conversation", executará o catch que contém o erro especifico apresentado;
            //System.out.println("Erro, Revise o nome do txt." + error1.getMessage());
            JOptionPane.showMessageDialog(null, "Erro, revise o nome do arquivo. " + error1.getMessage()); //Menssagem em pop up;
        } catch (IOException error2) { //IOException, como é uma classe mãe, mais genérica, tem sempre que estar abaixo das outras exceptions.
            JOptionPane.showMessageDialog(null, "Erro inesperado. Entre em contato com o suport" + error2.getStackTrace());
        }

        System.out.println("\nCom EXCEPTION ou não, o programa continua..."); 

    }

    private static void imprimirNoTerminal(String conversation) throws IOException {
        File file = new File(conversation);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        
        }while(line != null);
        bw.flush();
        br.close();

    }
    
}
