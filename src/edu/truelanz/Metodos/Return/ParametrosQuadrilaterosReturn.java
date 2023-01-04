package edu.truelanz.Metodos.Return;

public class ParametrosQuadrilaterosReturn {

    public static void main(String[] args) {
        
        double quadrado = QuadrilaterosReturn.quadrilatero(5.2);
        System.out.println("A area do quadrado é de: " + quadrado);

        double retangulo = QuadrilaterosReturn.quadrilatero(7.1, 4.9);
        System.out.println("A area do quadrado é de: " + retangulo);

        double trapezio = QuadrilaterosReturn.quadrilatero(4, 3, 6.5);
        System.out.println("A area do quadrado é de: " + trapezio);
    }
    
}
