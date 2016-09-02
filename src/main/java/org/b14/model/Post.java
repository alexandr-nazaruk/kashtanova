package org.b14.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Size;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by onazaruk on 18.02.2016.
 */
@Component
public class Post {
    @Size(min = 3, max = 200, message = "Title must be between 3 and 200 characters long.")
    private String title;
    private String text;
    private Date publicationDate;
    private String author;

    public long getId() {
        return id;
    }

    private long id;

    public Post(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Post() {
    }

    public Post(long id, String title, Date publicationDate, String author, String text) {

        this.id = id;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    public void setPublicationDate(Date publicationDate) throws IllegalAccessException {
        if (this.publicationDate == null) {
            this.publicationDate = publicationDate;
        } else {
            throw new IllegalAccessException("publicationDate cannot be modified, once it has been initialized. Current value is " + this.publicationDate);
        }
    }

    public void setAuthor(String author) throws IllegalAccessException {
        if (this.author==null || this.author.isEmpty()) {
            this.author = author;
        } else {
            throw new IllegalAccessException("Author cannot be modified, once it has been initialized. Current value is " + this.author);
        }

    }


    public String getAuthor() {
        return author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
