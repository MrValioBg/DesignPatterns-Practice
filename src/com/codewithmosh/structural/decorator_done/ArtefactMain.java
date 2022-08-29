package com.codewithmosh.structural.decorator_done;

public class ArtefactMain implements ArtefactRender {

    private final ArtefactRender artefact;

    public ArtefactMain(ArtefactRender artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Main]";
    }
}
