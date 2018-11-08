package com.aman.gof.calculator.app.nonterminalexpression;

import com.aman.gof.calculator.app.abstractexpression.Expression;

/**
 * This class represents non-terminal expression. A non-terminal expression is
 * nothing but an expression or node which has child in abstract syntax tree.
 * Which means it needs to be further evaluated by calling its interpret method
 * recursively on its child
 */
public abstract class NonTerminalExpression implements Expression {

    private Expression leftTreeNode;
    private Expression rightTreeNode;

    public NonTerminalExpression(Expression leftTreeNode, Expression rightTreeNode) {
        this.leftTreeNode = leftTreeNode;
        this.rightTreeNode = rightTreeNode;
    }

    public Expression getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(Expression leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public Expression getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(Expression rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

}