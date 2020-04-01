package app;

import app.factory.OperationFactory.Type;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        Calculator calculator = new Calculator();
        int result = calculator.calculateUsingFactory(4, 2, Type.add);
        System.out.println(result);
    }
}