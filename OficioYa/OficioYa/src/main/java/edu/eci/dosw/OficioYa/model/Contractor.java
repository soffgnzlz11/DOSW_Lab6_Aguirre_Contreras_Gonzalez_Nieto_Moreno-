package edu.eci.dosw.OficioYa.model;

public class Contractor {
    private Long id;
    private String name;
    private Double averageRating;

    public Contractor() {
    }

    public Contractor(Long id, String name, Double averageRating) {
        this.id = id;
        this.name = name;
        this.averageRating = averageRating;
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

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }
}
