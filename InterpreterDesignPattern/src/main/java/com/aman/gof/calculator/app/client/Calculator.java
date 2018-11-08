package com.aman.gof.calculator.app.client;

import java.util.HashMap;
import java.util.Stack;

import com.aman.gof.calculator.app.abstractexpression.Expression;
import com.aman.gof.calculator.app.context.CalculatorContext;
import com.aman.gof.calculator.app.nonterminalexpression.DivisionExpression;
import com.aman.gof.calculator.app.nonterminalexpression.MinusExpression;
import com.aman.gof.calculator.app.nonterminalexpression.MultiplicationExpression;
import com.aman.gof.calculator.app.nonterminalexpression.NonTerminalExpression;
import com.aman.gof.calculator.app.nonterminalexpression.PlusExpression;
import com.aman.gof.calculator.app.terminalexpression.TerminalExpression;

/**
 * This class represents the client which is responsible for building the syntax
 * tree representing the expression. The abstract syntax tree is collection of
 * nodes. Nodes are nothing but terminal and non-terminal expressions. The
 * client is also responsible for invoking the calculate or evaluate operation
 * on the syntax tree
 */
public class Calculator {

    private HashMap<String, String> operatorsMap;

    // Constructor to initialize operators map
    public Calculator() {

        operatorsMap = new HashMap<>();

        operatorsMap.put("+", "1");
        operatorsMap.put("-", "1");
        operatorsMap.put("*", "2");
        operatorsMap.put("/", "2");
        operatorsMap.put("(", "0");

    }

    public static void main(String[] args) {

        // Create instance of context
        CalculatorContext calculatorContext = new CalculatorContext();

        // Hardcoding context
        calculatorContext.putValueInVariableMap("a", 10);
        calculatorContext.putValueInVariableMap("b", 30);
        calculatorContext.putValueInVariableMap("c", 40);
        calculatorContext.putValueInVariableMap("d", 50);

        // Creating the expression to be evaluated using above context
        String expression = "a+b";

        // Calling the evaluate operation on the context and expression
        Calculator calculator = new Calculator();
        int result = calculator.evaluateExpression(calculatorContext, expression);
        System.out.println("Result: " + result);

    }

    // The evaluate expression method
    public int evaluateExpression(CalculatorContext calculatorContext, String expression) {

        // Converting the expression to postfix
        String postfixExpression = convertInfixToPostfix(expression);
        System.out.println("Postfix Expression: " + postfixExpression);

        // Build the expression tree
        Expression rootNode = buildExpressionTree(postfixExpression);

        // Evaluate the expression tree
        return rootNode.evaluateExpression(calculatorContext);

    }

    // Method to convert the expression from infix to postfix
    private String convertInfixToPostfix(String expression) {

        Stack<String> stack = new Stack<>();
        String postfixExpression = "";
        String tempExpression = "";

        for (int i = 0; i < expression.length(); i++) {

            String currentCharacter = expression.substring(i, i + 1);

            if ((isOperator(currentCharacter) == false) && (!currentCharacter.equals("("))
                    && (!currentCharacter.equals(")"))) {
                postfixExpression = postfixExpression + currentCharacter;
            }

            if (currentCharacter.equals("(")) {
                stack.push(currentCharacter);
            }

            // for ')' pop all stack contents until '('
            if (currentCharacter.equals(")")) {

                tempExpression = stack.pop();

                while (!tempExpression.equals("(")) {
                    postfixExpression = postfixExpression + tempExpression;
                    tempExpression = stack.pop();
                }

                tempExpression = "";
            }

            // if the current character is an operator
            if (isOperator(currentCharacter)) {

                if (stack.isEmpty() == false) {

                    tempExpression = stack.pop();
                    String stringValue1 = operatorsMap.get(tempExpression);
                    int value1 = new Integer(stringValue1).intValue();
                    String stringValue2 = (String) operatorsMap.get(currentCharacter);
                    int value2 = new Integer(stringValue2).intValue();

                    while ((value1 >= value2)) {

                        postfixExpression = postfixExpression + tempExpression;
                        value1 = -100;

                        if (stack.isEmpty() == false) {
                            tempExpression = (String) stack.pop();
                            stringValue1 = (String) operatorsMap.get(tempExpression);
                            value1 = new Integer(stringValue1).intValue();
                        }

                    }

                    if ((value1 < value2) && (value1 != -100)) {
                        stack.push(tempExpression);
                    }
                }

                stack.push(currentCharacter);
            }
        }

        while (stack.isEmpty() == false) {
            tempExpression = (String) stack.pop();
            postfixExpression = postfixExpression + tempExpression;
        }

        return postfixExpression;
    }

    // Method to check symbol is operator ?
    private boolean isOperator(String str) {

        if ((str.equals("+")) || (str.equals("-")) || (str.equals("*")) || (str.equals("/"))) {
            return true;
        }

        return false;
    }

    // Method to build expression tree
    private Expression buildExpressionTree(String expression) {

        Stack<Expression> expressionStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            String currentCharacter = expression.substring(i, i + 1);

            if (isOperator(currentCharacter) == false) {
                Expression terminalExpression = new TerminalExpression(currentCharacter);
                expressionStack.push(terminalExpression);

            } else {

                Expression right = expressionStack.pop();
                Expression left = expressionStack.pop();
                Expression nonTerminalExpression = getNonTerminalExpression(currentCharacter, left, right);
                expressionStack.push(nonTerminalExpression);
            }
        }

        return (Expression) expressionStack.pop();
    }

    // Method to get non-terminal expression
    private NonTerminalExpression getNonTerminalExpression(String operation, Expression leftNode,
            Expression rightNode) {

        if (operation.trim().equals("+")) {
            return new PlusExpression(leftNode, leftNode);
        }

        if (operation.trim().equals("-")) {
            return new MinusExpression(leftNode, leftNode);
        }

        if (operation.trim().equals("*")) {
            return new MultiplicationExpression(leftNode, leftNode);
        }

        if (operation.trim().equals("/")) {
            return new DivisionExpression(leftNode, leftNode);
        }

        return null;
    }

}