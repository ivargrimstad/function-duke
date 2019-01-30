package eu.agilejava.fn;

public class HelloFunction {

    public String handleRequest(String input) {

        String place = System.getenv("place");

        String name = (input == null || input.isEmpty()) ? place  : input;

        return "Hello, " + name + "\n";
    }

}