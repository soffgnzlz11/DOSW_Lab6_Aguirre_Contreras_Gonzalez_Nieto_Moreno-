package edu.eci.dosw.OficioYa.model;

public class Contractor {
    private Integer id;
    private Double averageRating;

    public Contractor() {
    }

    public Contractor(Integer id, Double averageRating) {
        this.id = id;
        this.averageRating = averageRating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }
}
