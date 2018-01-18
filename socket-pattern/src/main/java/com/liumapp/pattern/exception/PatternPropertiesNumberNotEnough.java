package com.liumapp.pattern.exception;

/**
 * Created by liumapp on 11/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class PatternPropertiesNumberNotEnough extends Exception {

    public PatternPropertiesNumberNotEnough() {
    }

    public PatternPropertiesNumberNotEnough(String message) {
        super(message);
    }

    public PatternPropertiesNumberNotEnough(String message, Throwable cause) {
        super(message, cause);
    }

    public PatternPropertiesNumberNotEnough(Throwable cause) {
        super(cause);
    }

}
