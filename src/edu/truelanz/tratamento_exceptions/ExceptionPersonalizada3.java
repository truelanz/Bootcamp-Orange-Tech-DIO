package edu.truelanz.tratamento_exceptions;

public class ExceptionPersonalizada3 extends Exception {
    
    int numerador;
    int denominador;

    public ExceptionPersonalizada3(String message, int numerador, int denominador) {
        
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

}
