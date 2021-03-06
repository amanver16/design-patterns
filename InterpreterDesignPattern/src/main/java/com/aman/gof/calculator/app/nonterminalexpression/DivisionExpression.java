package com.aman.gof.calculator.app.nonterminalexpression;

import com.aman.gof.calculator.app.abstractexpression.Expression;
import com.aman.gof.calculator.app.context.CalculatorContext;

/**
 * This class represents non-terminal expression for division operator. A
 * non-terminal expression is nothing but an expression or node which has child
 * in abstract syntax tree. Which means it needs to be further evaluated by
 * calling its interpret method recursively on its child
 */
public class DivisionExpression extends NonTerminalExpression {

    public int evaluateExpression(CalculatorContext calculatorContext) {
        return getLeftTreeNode().evaluateExpression(calculatorContext)
                / getRightTreeNode().evaluateExpression(calculatorContext);
    }

    public DivisionExpression(Expression leftTreeNode, Expression rightTreeNode) {
        super(leftTreeNode, rightTreeNode);
    }

}