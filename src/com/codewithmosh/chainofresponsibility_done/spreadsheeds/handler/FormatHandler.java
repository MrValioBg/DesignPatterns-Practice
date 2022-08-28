package com.codewithmosh.chainofresponsibility_done.spreadsheeds.handler;

public abstract class FormatHandler {

    private final FormatHandler next;

    public FormatHandler(FormatHandler next) {
        this.next = next;
    }

    public void read(String fileName) {
        if (fileName == null || fileName.isEmpty() || fileName.isBlank()) {
            System.out.println("Please type in a valid file name.");
            return;
        }
        if (fileName.endsWith(getExtension())) {
          doRead(fileName);
        } else {
            if(next == null) throw new UnsupportedOperationException("File format not supported.");
            next.read(fileName);
        }

    }

    protected abstract String getExtension();
    protected abstract void doRead(String fileName);

}
