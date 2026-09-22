package edu.eci.dosw.OficioYa.model;

import java.math.BigDecimal;
import java.util.List;

public class Work {
    private Integer id;
    private BigDecimal approxRate;
    private Boolean availableNow;
    private String status;
    private int completeJobs;
    private Double averageRating;
    private Trade mainTrade;
    private List<Trade> secondaryTrades;
    private List<Zone> zones;
    private List<AvailabilitySlot> availabilitySlots;
    private List<WorkPhoto> photos;

    public Work() {
    }

    public Work(Integer id, BigDecimal approxRate, Boolean availableNow, String status, int completeJobs,
                Double averageRating, Trade mainTrade, List<Trade> secondaryTrades, List<Zone> zones,
                List<AvailabilitySlot> availabilitySlots, List<WorkPhoto> photos) {
        this.id = id;
        this.approxRate = approxRate;
        this.availableNow = availableNow;
        this.status = status;
        this.completeJobs = completeJobs;
        this.averageRating = averageRating;
        this.mainTrade = mainTrade;
        this.secondaryTrades = secondaryTrades;
        this.zones = zones;
        this.availabilitySlots = availabilitySlots;
        this.photos = photos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getApproxRate() {
        return approxRate;
    }

    public void setApproxRate(BigDecimal approxRate) {
        this.approxRate = approxRate;
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

    public int getCompleteJobs() {
        return completeJobs;
    }

    public void setCompleteJobs(int completeJobs) {
        this.completeJobs = completeJobs;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public Trade getMainTrade() {
        return mainTrade;
    }

    public void setMainTrade(Trade mainTrade) {
        this.mainTrade = mainTrade;
    }

    public List<Trade> getSecondaryTrades() {
        return secondaryTrades;
    }

    public void setSecondaryTrades(List<Trade> secondaryTrades) {
        this.secondaryTrades = secondaryTrades;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    public List<AvailabilitySlot> getAvailabilitySlots() {
        return availabilitySlots;
    }

    public void setAvailabilitySlots(List<AvailabilitySlot> availabilitySlots) {
        this.availabilitySlots = availabilitySlots;
    }

    public List<WorkPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(List<WorkPhoto> photos) {
        this.photos = photos;
    }
}
