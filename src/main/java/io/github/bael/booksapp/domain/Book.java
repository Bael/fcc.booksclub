package io.github.bael.booksapp.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.Year;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;

    public Book() {
    }

    private LocalDateTime createdOn;
    private String summary;
    private Year publishedYear;

    public Book(String title, String summary) {
        this.title = title;
        this.summary = summary;

        this.createdOn = LocalDateTime.now();

    }
}
