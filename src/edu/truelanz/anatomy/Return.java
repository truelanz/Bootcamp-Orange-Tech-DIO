package edu.truelanz.anatomy;

public class Return {

    public static void main(String [] args) {

        String primeiroNome = "Alan";
        String segundoNome = "Oliveira";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
}

 public static String nomeCompleto (String primeiroNome, String segundoNome){

    return "O seu nome é: ".concat (primeiroNome).concat(" ").concat(segundoNome);
    
 }

}
