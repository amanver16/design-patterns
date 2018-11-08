package com.aman.gof.calculator.app.terminalexpression;

import com.aman.gof.calculator.app.abstractexpression.Expression;
import com.aman.gof.calculator.app.context.CalculatorContext;

/**
 * This class represents terminal expression. A terminal expression is nothing
 * but an expression or node which has no child nodes in abstract syntax tree
 * which means it is a leaf node.
 */
public class TerminalExpression implements Expression {

    private String variable;

    public TerminalExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int evaluateExpression(CalculatorContext calculatorContext) {
        return calculatorContext.getValueFromMap(this.variable);
    }

}