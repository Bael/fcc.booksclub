package io.github.bael.booksapp.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Trade {

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String status;

    public Book getBookToTrade() {
        return bookToTrade;
    }

    public void setBookToTrade(Book bookToTrade) {
        this.bookToTrade = bookToTrade;
    }

    public Owner getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(Owner currentOwner) {
        this.currentOwner = currentOwner;
    }

    public Owner getNewOwner() {
        return newOwner;
    }

    public void setNewOwner(Owner newOwner) {
        this.newOwner = newOwner;
    }

    @ManyToOne
    private Book bookToTrade;
    @ManyToOne
    private Owner currentOwner;
    @ManyToOne
    private Owner newOwner;

    public Trade() {
    }

    public Trade(String status, Book bookToTrade, Owner newOwner) {
        this.status = status;
        this.bookToTrade = bookToTrade;
        this.currentOwner = bookToTrade.getOwner();
        this.newOwner = newOwner;
    }
}
