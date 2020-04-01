package app;

import app.factory.OperationFactory;
import app.factory.OperationFactory.Type;
import app.strategy.Operation;

public class Calculator {
    
    public int calculateUsingFactory(int a, int b, Type operation) {
        Operation targetOperation = OperationFactory.getOperation(operation)
            .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return targetOperation.calculate(a, b);
    }
}