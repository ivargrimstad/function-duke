package eu.agilejava;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Person, String> {

    public String handleRequest(Person person, Context context) {

        LambdaLogger logger = context.getLogger();
        logger.log("received : " + person.getName());

        return String.valueOf("Hello, " + person.getName());
    }
}