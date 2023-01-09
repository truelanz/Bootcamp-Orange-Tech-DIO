package edu.truelanz.Poo.Interface;

/*
 * A classe com "implements" é obrigada a usar os metodos
 * criados pela "interface" implementada.
 */

public class Calculo implements CalculadoraBase {

    @Override
    public double soma(double operando1, double operando2) {
        return operando1 + operando2;
    }

    @Override
    public double subtracao(double operando1, double operando2) {
        return operando1 - operando2;
    }

    @Override
    public double multiplicacao(double operando1, double operando2) {
        return operando1 * operando2;
    }

    @Override
    public double divisao(double operando1, double operando2) {
        return operando1 / operando2;
    }
    
}
