package com.javarush.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(schema = "movie", name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Short id;
    @Column(name = "country")
    String title;
    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lustUpdate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getLustUpdate() {
        return lustUpdate;
    }

    public void setLustUpdate(LocalDateTime lustUpdate) {
        this.lustUpdate = lustUpdate;
    }
}
