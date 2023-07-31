package com.api.rpn.service.service;

import com.api.rpn.service.dto.StackBean;
import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class RpnCalculatorService {

    private StackBean stackBean;

    public RpnCalculatorService() {
        this.stackBean = new StackBean();
    }

    public void pushStack(Integer i) {
        stackBean.getStack().push(i);

    }

    public void cleanStack() {
        stackBean.getStack().clear();

    }

    public Stack<Integer> operatorAdd() {
        if (stackBean.getStack().size() >= 2) {
            Integer i = stackBean.getStack().pop();
            Integer j = stackBean.getStack().pop();
            stackBean.getStack().push(i + j);
        }
        return stackBean.getStack();
    }

    public Stack<Integer> operatorSub() {
        if (stackBean.getStack().size() >= 2) {
            Integer i = stackBean.getStack().pop();
            Integer j = stackBean.getStack().pop();
            stackBean.getStack().push(i - j);
        }
        return stackBean.getStack();
    }

    public Stack<Integer> operatorDiv() {
        if (stackBean.getStack().size() >= 2) {
            Integer i = stackBean.getStack().pop();
            Integer j = stackBean.getStack().pop();
            stackBean.getStack().push(i / j);
        }
        return stackBean.getStack();
    }
    public Stack<Integer> operatorMul() {
        if (stackBean.getStack().size() >= 2) {
            Integer i = stackBean.getStack().pop();
            Integer j = stackBean.getStack().pop();
            stackBean.getStack().push(i * j);
        }
        return stackBean.getStack();
    }

    public Stack<Integer> getStack() {
        return stackBean.getStack();
    }
}
