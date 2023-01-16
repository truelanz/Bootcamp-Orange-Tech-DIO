package edu.truelanz.TratamentoException;

import javax.swing.*;
import java.io.*;

public class ExceptionPersonalizada {


    public static void main(String[] args) {
        String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");
        leitorDoJOptionPane(nomeArquivo);
        JOptionPane.showMessageDialog(null, "Arquivo encontrado com sucesso!");
        System.out.println("\nIndependente de Exception, o programa continua...");
    } //SE INFORMAR O NOME DO ARQUIVO CORRETAMENTE, NADA QUE ESTÁ EM BAIXO DAQUI SERÁ EXECUTADO!

    public static void leitorDoJOptionPane(String nomeArquivo) { // Classe criada para ler mensagen do input 'JOptionpane'

        //-----------------------------------------------------------------------------------------\\
        
        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close(); 
            
        //-----------------------------------------------------------------------------------------\\    

        } catch (ArquivoNaoEncontrado exception1) { //<- Exception personalizada, invocar como qualquer outra exception
            JOptionPane.showMessageDialog(null, exception1.getMessage());
            //e.printStackTrace();

        } catch (IOException exception2) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado, por favor, fale com o suporte." + exception2.getMessage());
            exception2.printStackTrace();
        }
    }



    public static BufferedReader lerArquivo(String nomeArquivo) throws ArquivoNaoEncontrado {

        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new ArquivoNaoEncontrado(file.getName(), file.getPath());
        }
    }
}



       /* CRIANDO UMA EXCEPTION PERSONALIZADA */

class ArquivoNaoEncontrado extends Exception { //Cria uma classe extends Exception

    private String nomeArquivo; //Criar os atributos.
    private String diretorio;

    public ArquivoNaoEncontrado(String nomeArquivo, String diretorio) { //Criar o 'CONSTRUCTOR'
        super("O arquivo " + nomeArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }

    /* @Override
    public String toString() {
        return "ArquivoNaoEncontrado{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    } */

}
    

