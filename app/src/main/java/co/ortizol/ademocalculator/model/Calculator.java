package co.ortizol.ademocalculator.model;

/**
 * Created by johno on 12/21/2015.
 */
public class Calculator {
    /**
     * Adds two numbers.
     * @param operand1 Operand 1
     * @param operand2 Operand 2
     * @return Addition.
     */
    public double plus(double operand1, double operand2){
        return operand1 + operand2;
    }

    /**
     * Substracts two numbers.
     * @param operand1 Operand 1
     * @param operand2 Operand 2
     * @return Subtraction
     */
    public double minus(double operand1, double operand2){
        return operand1 - operand2;
    }

    /**
     * Multiplies two numbers.
     * @param operand1 Operand 1
     * @param operand2 Operand 2
     * @return Multiplication
     */
    public double multiply(double operand1, double operand2){
        return operand1 * operand2;
    }

    /**
     * Divides two numbers.
     * @param operand1 Operand 1.
     * @param operand2 Operand 2.
     * @return Division
     */
    public double divide(double operand1, double operand2){
        return operand1 / operand2;
    }
}
