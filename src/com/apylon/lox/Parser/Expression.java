package com.apylon.lox.Parser;

import com.apylon.lox.Scanner.Token;

public abstract class Expression {
    static class Binary extends Expression {
        final Expression left;
        final Token operator;
        final Expression right;

        public Binary(Expression left, Token operator, Expression right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }
    }
}
