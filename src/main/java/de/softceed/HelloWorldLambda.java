package de.softceed;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Einfache Beispielklasse für einen AWS-Lambda-Service mit einem Einsprungpunkt
 */
public class HelloWorldLambda implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        context.getLogger().log("Eingabeobjekt: " + input);

        return "Mein erster Lambda-Service";
    }
}
