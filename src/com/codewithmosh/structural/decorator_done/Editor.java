package com.codewithmosh.structural.decorator_done;

public class Editor {
    public void openProject(String path) {
        ArtefactRender[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        artefacts[0] = new ArtefactError(new ArtefactMain(artefacts[0]));
        artefacts[1] = new ArtefactError(artefacts[1]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
