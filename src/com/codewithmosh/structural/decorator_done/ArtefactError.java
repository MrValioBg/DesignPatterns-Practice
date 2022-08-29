package com.codewithmosh.structural.decorator_done;

public class ArtefactError implements ArtefactRender{


    private final ArtefactRender artefact;

    public ArtefactError(ArtefactRender artefact) {

        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Error]";
    }
}
