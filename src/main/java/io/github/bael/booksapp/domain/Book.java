package io.github.bael.booksapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.Year;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @ManyToOne
    private Owner owner;

    public Book() {
    }


    private LocalDateTime createdOn;
    private String summary;


    public Book(String title, String summary, Owner owner) {
        this.title = title;
        this.summary = summary;
        this.owner = owner;
        this.createdOn = LocalDateTime.now();
    }
}
