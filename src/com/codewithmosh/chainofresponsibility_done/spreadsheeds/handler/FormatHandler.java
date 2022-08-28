package com.codewithmosh.chainofresponsibility_done.spreadsheeds.handler;

public abstract class FormatHandler {

    private final FormatHandler next;

    public FormatHandler(FormatHandler next) {
        this.next = next;
    }

    public void handleRequest(String fileName) {
        if (fileName == null) {
            System.out.println("Please type in a valid file name.");
            return;
        }
        if (doHandle(fileName)) {
            System.out.println("Handling request using class " + getClass().getSimpleName());
        } else {
            if(next == null) throw new UnsupportedOperationException("File format not supported.");
            next.handleRequest(fileName);
        }

    }

    protected abstract boolean doHandle(String fileName);

}
