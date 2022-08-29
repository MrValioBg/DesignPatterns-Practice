package com.codewithmosh.structural.decorator_done;

public class Artefact implements ArtefactRender {


    private final String name;

    public Artefact(String name) {

        this.name = name;
    }

    @Override
    public String render() {
        return this.name;
    }

}
