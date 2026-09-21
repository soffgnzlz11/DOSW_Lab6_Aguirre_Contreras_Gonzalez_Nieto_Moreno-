package edu.eci.dosw.OficioYa.model;

import java.math.BigDecimal;

public class Worker {
    private Long id;
    private String oficioPrincipal;
    private String oficiosSecundarios;
    private BigDecimal aproxRate;
    private Boolean availableNow;
    private String status;
    private Integer completedJobs;
    private Double averageRating;

    public Worker() {
    }

    public Worker(Long id, String oficioPrincipal, String oficiosSecundarios, BigDecimal aproxRate,
                  Boolean availableNow, String status, Integer completedJobs, Double averageRating) {
        this.id = id;
        this.oficioPrincipal = oficioPrincipal;
        this.oficiosSecundarios = oficiosSecundarios;
        this.aproxRate = aproxRate;
        this.availableNow = availableNow;
        this.status = status;
        this.completedJobs = completedJobs;
        this.averageRating = averageRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOficioPrincipal() {
        return oficioPrincipal;
    }

    public void setOficioPrincipal(String oficioPrincipal) {
        this.oficioPrincipal = oficioPrincipal;
    }

    public String getOficiosSecundarios() {
        return oficiosSecundarios;
    }

    public void setOficiosSecundarios(String oficiosSecundarios) {
        this.oficiosSecundarios = oficiosSecundarios;
    }

    public BigDecimal getAproxRate() {
        return aproxRate;
    }

    public void setAproxRate(BigDecimal aproxRate) {
        this.aproxRate = aproxRate;
    }

    public Boolean getAvailableNow() {
        return availableNow;
    }

    public void setAvailableNow(Boolean availableNow) {
        this.availableNow = availableNow;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCompletedJobs() {
        return completedJobs;
    }

    public void setCompletedJobs(Integer completedJobs) {
        this.completedJobs = completedJobs;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }
}
