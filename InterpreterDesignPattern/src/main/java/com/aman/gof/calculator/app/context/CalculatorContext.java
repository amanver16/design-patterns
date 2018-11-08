package com.aman.gof.calculator.app.context;

import java.util.HashMap;

/**
 * This class represents context on which regular expression is created to be
 * evaluated
 */
public class CalculatorContext {

    private HashMap<String, Integer> variableMap = new HashMap<>();

    public void putValueInVariableMap(String key, int value) {
        variableMap.put(key, value);
    }

    public int getValueFromMap(String key) {
        return variableMap.get(key);
    }

}