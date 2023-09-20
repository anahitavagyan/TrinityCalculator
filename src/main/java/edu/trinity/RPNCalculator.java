package edu.trinity;

import java.util.EmptyStackException;
import java.util.Stack;
public class RPNCalculator {

    public static double evaluate(String expr) {

        String[] elements = expr.split(" ");
        Stack<Double> myStack = new Stack<>();
        double op1 = 0;
        double op2 = 0;
        double result=0;

        for(String element:elements){
            if(!isOperator(element)){
                myStack.push(Double.parseDouble(element));
            }else{
                if(myStack.size()<2){
                    throw new EmptyStackException();
                }
                op2 = myStack.pop();
                op1 = myStack.pop();
                result = evaluateOperation(element, op1, op2);
                myStack.push(result);
            }
        }

        if(myStack.size() > 1){
            myStack.pop();
        }

        return myStack.pop();
    }

    //decides if the given String is an operator or not
    public static boolean isOperator(String op){
        switch(op){
            case "+": case "-": case "/": case "*":
                return true;
            default:
                return false;
        }
    }

    //returns the result of a single expression as a double
    public static double evaluateOperation(String operation, double op1, double op2){
        switch(operation) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                if(op2 == 0){
                    throw new IllegalArgumentException();
                }
                return op1 / op2;
            default:
                throw new IllegalArgumentException();
        }
    }

}
