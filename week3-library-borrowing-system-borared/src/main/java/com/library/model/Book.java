package com.library.model;

public class Book {
    private String title;        // reference type
    private String author;       // reference type
    private boolean available;   // primitive

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        // TODO: title must not be null or empty
        if( title == null || title.isEmpty()){
            throw new IllegalArgumentException("Invalid title.");
        }else{
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        // TODO: author must not be null or empty
        if(author == null || author.isEmpty()){
            throw new IllegalArgumentException("Invalid author.");
        }else{
            this.author = author;
        }
    }

    public boolean isAvailable() {
        return available;
    }

    void markBorrowed() {
        // TODO: set available to false
        this.available = false;
    }

    void markReturned() {
        // TODO: set available to true
        this.available = true;
    }
}
