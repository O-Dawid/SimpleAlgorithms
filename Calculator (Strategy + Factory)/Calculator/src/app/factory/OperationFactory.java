package app.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import app.strategy.Operation;
import app.strategy.impl.Addition;



public class OperationFactory {

    public enum Type{
        add
    }


    static Map<Type, Operation> operationMap = new HashMap<>();
    static {
        operationMap.put(Type.add, new Addition());
    }

    public static Optional<Operation> getOperation(Type operation) {
        return Optional.ofNullable(operationMap.get(operation));
    }
}