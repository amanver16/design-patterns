package com.aman.gof.calculator.app.abstractexpression;

import com.aman.gof.calculator.app.context.CalculatorContext;

/**
 * This interface represents expression which is common to all nodes (Terminal &
 * Non Terminal Expressions) in the abstract syntax tree
 */
public interface Expression {

    public int evaluateExpression(CalculatorContext calculatorContext);

}