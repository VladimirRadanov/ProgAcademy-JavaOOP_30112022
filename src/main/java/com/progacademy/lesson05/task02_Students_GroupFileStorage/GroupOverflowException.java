package com.progacademy.lesson05.task02_Students_GroupFileStorage;

public class GroupOverflowException extends Exception{
    public GroupOverflowException() {
    }

    public GroupOverflowException(String message) {
        super(message);
    }

    public GroupOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public GroupOverflowException(Throwable cause) {
        super(cause);
    }
}
