package com.codewithmosh.template_done;

public class ExplorerWindow extends Window{

    @Override
    protected void onClosing() {
        System.out.println("Doing something with ExplorerWindow on closing");
    }

    @Override
    protected void onClosed() {
        System.out.println("Doing something with ExplorerWindow when its closed");
    }
}
