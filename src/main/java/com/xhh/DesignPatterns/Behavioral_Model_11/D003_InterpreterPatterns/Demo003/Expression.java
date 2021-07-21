package com.xhh.DesignPatterns.Behavioral_Model_11.D003_InterpreterPatterns.Demo003;

import java.util.Map;

public interface Expression {
    boolean interpret(Map<String, Long> stats);
}