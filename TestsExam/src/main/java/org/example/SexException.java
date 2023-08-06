package org.example;

public class SexException extends Exception {

    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("It`s not correct date format: %s", i);
        System.out.println();
    }
}
