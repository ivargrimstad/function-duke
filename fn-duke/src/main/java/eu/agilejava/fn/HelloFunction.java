package eu.agilejava.fn;

public class HelloFunction {

    public String handleRequest(String input) {

        String configuredName = System.getenv("name");

        String name = (input == null || input.isEmpty()) ? configuredName  : input;

        return "Hello, " + name + "\n";
    }

}