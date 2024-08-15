package com.example.usermanager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name is required")
    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters.")
    private String name;

    @NotEmpty(message = "Email is required")
    @Pattern(regexp = "^[a-zA-z0-9\\-]{3,}@[a-z]{3,}\\.[a-z]{2,4}$", message = "Email should be valid")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotEmpty(message = "Name is required") @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters.") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "Name is required") @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters.") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty(message = "Email is required") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }
}
