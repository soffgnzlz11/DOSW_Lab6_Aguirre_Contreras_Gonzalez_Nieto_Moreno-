package edu.eci.dosw.OficioYa.model;

import java.time.LocalDateTime;
import java.util.Set;

public class User {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String photoUrl;
    private String fcToken;
    private LocalDateTime createdAt;
    private Set<String> roles;

    public User() {
    }

    public User(Long id, String name, String email, String phone, String password, String photoUrl,
                String fcToken, LocalDateTime createdAt, Set<String> roles) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.photoUrl = photoUrl;
        this.fcToken = fcToken;
        this.createdAt = createdAt;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getFcToken() {
        return fcToken;
    }

    public void setFcToken(String fcToken) {
        this.fcToken = fcToken;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
