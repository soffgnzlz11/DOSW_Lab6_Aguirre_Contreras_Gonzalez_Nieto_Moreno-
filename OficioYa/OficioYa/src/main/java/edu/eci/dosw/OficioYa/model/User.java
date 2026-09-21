package edu.eci.dosw.OficioYa.model;

import java.time.LocalDateTime;
import java.util.Set;

public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String photoUrl;
    private String fcmToken;
    private LocalDateTime createdAt;
    private Set<String> roles;
    private Work work;
    private Contractor contractor;

    public User() {
    }

    public User(Integer id, String name, String email, String password, String photoUrl, String fcmToken,
                LocalDateTime createdAt, Set<String> roles, Work work, Contractor contractor) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.photoUrl = photoUrl;
        this.fcmToken = fcmToken;
        this.createdAt = createdAt;
        this.roles = roles;
        this.work = work;
        this.contractor = contractor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getFcmToken() {
        return fcmToken;
    }

    public void setFcmToken(String fcmToken) {
        this.fcmToken = fcmToken;
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

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }
}
