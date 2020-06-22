package com.example.tilitor.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    private String tag;

    private User author;

    public Message() { }

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }

    Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }

    String getTag() {
        return tag;
    }

    void setTag(String tag) {
        this.tag = tag;
    }

    User getAuthor() {
        return author;
    }

    void setAuthor(User author) {
        this.author = author;
    }
}
