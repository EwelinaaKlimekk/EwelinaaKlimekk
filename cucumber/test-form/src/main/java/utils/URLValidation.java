package utils;

import java.net.URL;

public class URLValidation {
    public static boolean isValid(String url) {
        /* Try creating a valid URL */
        try {
            new URL(url).toURI();
            System.out.println("Link is correct.");
            return true;
        }

        // If there was an Exception
        // while creating URL object
        catch (Exception e) {
            System.out.println("Link is broken.");
            return false;
        }
    }
}
