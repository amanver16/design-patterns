package com.aman.gof.calculator.app.nonterminalexpression;

import com.aman.gof.calculator.app.abstractexpression.Expression;
import com.aman.gof.calculator.app.context.CalculatorContext;

/**
 * This class represents non-terminal expression for minus operator. A
 * non-terminal expression is nothing but an expression or node which has child
 * in abstract syntax tree. Which means it needs to be further evaluated by
 * calling its interpret method recursively on its child
 */
public class MinusExpression extends NonTerminalExpression {

    public int evaluateExpression(CalculatorContext calculatorContext) {
        return getLeftTreeNode().evaluateExpression(calculatorContext)
                - getRightTreeNode().evaluateExpression(calculatorContext);
    }

    public MinusExpression(Expression leftTreeNode, Expression rightTreeNode) {
        super(leftTreeNode, rightTreeNode);
    }

}