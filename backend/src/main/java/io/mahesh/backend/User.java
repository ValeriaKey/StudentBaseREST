package io.mahesh.backend;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Data
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue
    private int id;

    private String Name;
    private String Email;

    private String Password;

    public User() {
    }
}