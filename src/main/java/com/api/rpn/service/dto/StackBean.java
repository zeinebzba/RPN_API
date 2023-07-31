package com.api.rpn.service.dto;

import java.util.Stack;

public class StackBean {

    private Stack<Integer> stack;

    public StackBean() {
        this.stack =  new Stack<Integer>();
    }


    public Stack<Integer> getStack() {
        return stack;
    }

    public void setStack(Stack<Integer> stack) {
        this.stack = stack;
    }
}
