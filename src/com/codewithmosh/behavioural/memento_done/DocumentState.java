package com.codewithmosh.behavioural.memento_done;

public class DocumentState {


    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public DocumentState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }
}
