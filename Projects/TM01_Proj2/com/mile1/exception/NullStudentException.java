package com.mile1.exception;

@SuppressWarnings("serial")
public class NullStudentException extends Exception {
    @Override
    public String toString() {
        return "NullStudentException occurred";
    }
}