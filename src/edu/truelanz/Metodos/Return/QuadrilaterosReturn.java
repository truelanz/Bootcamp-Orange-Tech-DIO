package edu.truelanz.Metodos.Return;

public class QuadrilaterosReturn {

    /*
  * RECRIE A APLICAÇÃO QUE CALCULA A ÁREA DOS 3 QUADRILÁTEROS
  * NOTÁVEIS. PORÉM, AGORA COM RETURN.
   */
    
    public static double quadrilatero(double lado) {
        return lado * lado;        
    }
    
    public static double quadrilatero(double ladoMaior, double ladoMenor) {
        return ladoMaior * ladoMenor;        
    }

    public static double quadrilatero(double baseMaior, double baseMenor, double altura) {
        return (baseMaior + baseMenor) * altura / 2;        
    }
    
}
