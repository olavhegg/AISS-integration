package com.example.Lab6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;


public class Commit {

    private String Id;
    private String title;
    private String message;
    private String author_email;
    private LocalDateTime authored_date;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor_email() {
        return author_email;
    }

    public void setAuthor_email(String author_email) {
        this.author_email = author_email;
    }

    public LocalDateTime getAuthored_date() {
        return authored_date;
    }

    public void setAuthored_date(LocalDateTime authored_date) {
        this.authored_date = authored_date;
    }


}
