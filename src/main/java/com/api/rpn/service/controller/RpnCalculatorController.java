package com.api.rpn.service.controller;

import com.api.rpn.service.service.RpnCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Stack;

@RestController
public class RpnCalculatorController {
    private RpnCalculatorService rpnCalculatorService;

    public RpnCalculatorController(RpnCalculatorService rpnCalculatorService) {
        this.rpnCalculatorService = rpnCalculatorService;
    }
    @GetMapping(path = "/")
    public  Stack<Integer> getStack() {
       return rpnCalculatorService.getStack();
    }
    @GetMapping(path = "/push/{element}")
    public void pushElement(Integer element) {
        rpnCalculatorService.pushStack(element);
    }

    @GetMapping(path = "/clean")
    public void cleanStack() {
        rpnCalculatorService.cleanStack();
    }

    @GetMapping(path = "/add")
    public Stack<Integer> operatorAdd() {
        return rpnCalculatorService.operatorAdd();
    }

    @GetMapping(path = "/sub")
    public Stack<Integer> operatorSub() {
        return rpnCalculatorService.operatorSub();
    }

    @GetMapping(path = "/multiplication")
    public Stack<Integer> operatorMultiplication() {
        return rpnCalculatorService.operatorMul();
    }

    @GetMapping(path = "/div")
    public Stack<Integer> operatorDiv() {
        return rpnCalculatorService.operatorDiv();
    }
}
