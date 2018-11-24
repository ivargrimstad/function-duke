package eu.agilejava.fn;

public class HelloFunction {

    public String handleRequest(String input) {
        String name = (input == null || input.isEmpty()) ? "World"  : input;

        return "Hello, " + name + "\n";
    }

}