package com.liumapp.pattern.exception;

/**
 * Created by liumapp on 11/22/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class WrongType extends Exception {

    public WrongType() {
    }

    public WrongType(String message) {
        super(message);
    }

    public WrongType(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongType(Throwable cause) {
        super(cause);
    }

}
