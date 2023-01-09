package edu.truelanz.Poo.Carro;

public class Ex1_Carro {

    /*
     * DEFINA UM MÉTODO PARA CALCULAR O VALOR TOTAL PARA ENCHER O
     * TANQUE DE UM CARRO. ESTE DEVE RECEBER COMO PARÂMETRO O VALOR
     * DA GASOLINA. FAÇA TAMBÉM DUAS SOBRECARGAS DO CONSTRUTOR.
     */

    String cor;
    String modelo;
    int capacidadeTanque;
    double precoCombustivel;
    
    //Criar método CONSTRUTOR VAZIO:
     Ex1_Carro() {

     }

   //Criar uma sobrecarga no método Construtor:
     Ex1_Carro(String cor, String modelo, int capacidadeTanque, double precoCombustivel) {
        this.cor = cor; //this. recebe o valor da do atributo/classe e passa p/a variável.
        this.modelo = modelo; //o this.modelo pega do atributo "modelo" de obj criado acima.
        this.capacidadeTanque = capacidadeTanque;
        this.precoCombustivel = precoCombustivel;

   }

     
     //set-get / modificar-pegar:

    //set/modificar COR'''
     void setCor(String cor) {
      this.cor = cor;
     }

     //get/pegar e retornar
     String getCor() {
      return cor;

     }
     
     //set/modificar MODELO'''
     void setModelo(String modelo) {
      this.modelo = modelo;

     }

     //get/pergar
     String getModelo() {
      return modelo;

     }

     //set/modificar: TANQUE'''
      void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;

     }
     
     //set/modificar/ usar para inserir valores modificaveis: TANQUE'''
     int getCapacidadeTanque() {
        return capacidadeTanque;
        
      }
      
      
      
      //set/modificar/ usar para inserir valores modificaveis: COMBUSTÍVEL'''
     void setPrecoCombustivel(double precoCombustivel) {
        this.precoCombustivel = precoCombustivel;

      }
      
      //get/pegar/ usar para calcular:
       double getPrecoCombustivel(double precoCombustivel){
         return precoCombustivel;        

      }

      /*
      Não preciso do "set" dessa classe, pois ela só será usada para calcular
      de acordo com o preço do combústivel e a capacidade do tanque do carro.
      */
      //get/pegar/ usar para calcular:
      double getCalculo(double calculo) {
         return calculo = precoCombustivel * capacidadeTanque;
      
      }
   
}

     
    
    


