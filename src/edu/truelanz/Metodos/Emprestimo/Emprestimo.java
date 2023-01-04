package edu.truelanz.Metodos.Emprestimo;

public class Emprestimo {

     /*
     *Para calcular porcentagem de um valor multiplique a porcentagem que
      você está procurando pelo próprio valor. Por exemplo, se você quer
      calcular 35% de 500, multiplique 35 por 500. Fazendo isso você obtém
       o valor de 35 x 500 = 17500; Divida o resultado obtido por 100

       Calcule o valor final de um empréstimo, a partir
     do valor solicitado. Taxas e parcelas influenciam.
     Defina arbitrariamente as faixas que influenciam
     nos valores.
     */

     //TAXA JUROS PESSOAL

     public static void juroPessoal(double taxaEmprestimo, double valorSolicitado){

        double resultado = (valorSolicitado * taxaEmprestimo) / 100 + valorSolicitado;
        System.out.println("O valor do seu empréstimo PESSOAL será de: " + resultado + "0 Reais.");
     }
    
     //TAXA JUROS CONSIGNADO

     public static void juroConsignado(double taxaEmprestimo, double valorSolicitado) {

        double resultado = (valorSolicitado * taxaEmprestimo) / 100 + valorSolicitado;
        System.out.println("O valor do seu empréstimo CONSIGNADO será de: " + resultado + "0 Reais.");
     }

     //TAXA DUAS PARCELAS

     public static void duasParcelas(double valor) {

        final double parcelas = 0.35; // Tem que esta fora do parâmetro porque já contem um valor fixo.

        double resultado = valor * parcelas + valor;
        System.out.println("Seu empréstimo para suas parcelas é de: " + resultado);

     }

     //TAXA TRÊS PARCELAS.

     public static void tresParcelas(double valor) {

        final double parcelas = 0.43;

        double resultado = valor * parcelas + valor;
        System.out.println("Seu empréstimo para suas três parcelas é de: " + resultado);
     }


     //OUTRA MANEIRA DE FAZER:\\

     public static int metodoDuasParcelas() {
        return 2;
     }

     public static int metodoTresParcelas() {
        return 3;
     }
     
     public static double juroDuasParcelas() {
        return 0.35;
     }

     public static double jurosTresParcelas() {
        return 0.43;
     }

     public static void calcularParcelas(double valor, int parcelas) {

         if (parcelas == 2) {
            double resultado = (valor * juroDuasParcelas()) + valor;
            System.out.println("**Seu empréstimo para suas duas parcelas é de:** " + resultado);


         }else if (parcelas == 3) {
            double resultado = (valor * jurosTresParcelas()) + valor; //Usando um método dentro de um cálculo.
            System.out.println("**Seu empréstimo para suas três parcelas é de:** " + resultado);

         }else System.out.println("Valor de parcelas inválida.");
              
     }
    
}


