package com.codewithmosh.template_done;

public class ChatWindow extends Window {

    @Override
    protected void onClosing() {
        System.out.println("Doing something with ChatWindow on closing");
    }

    @Override
    protected void onClosed() {
        System.out.println("Doing something with ChatWindow when its closed");
    }
}
