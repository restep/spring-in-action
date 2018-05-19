package com.ch08.exception;

/**
 * @author restep
 * @date 2018/5/19
 */
public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException() {

    }

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
