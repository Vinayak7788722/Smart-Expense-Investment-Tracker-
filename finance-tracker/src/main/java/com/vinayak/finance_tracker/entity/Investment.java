package com.vinayak.finance_tracker.entity;



import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private double investedAmount;
    private double currentValue;

    public Investment() {
    }

    public Investment(Long id, String type, double investedAmount, double currentValue) {
        this.id = id;
        this.type = type;
        this.investedAmount = investedAmount;
        this.currentValue = currentValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getInvestedAmount() {
        return investedAmount;
    }

    public void setInvestedAmount(double investedAmount) {
        this.investedAmount = investedAmount;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    @Override
    public String toString() {
        return "Investment{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", investedAmount=" + investedAmount +
                ", currentValue=" + currentValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Investment)) return false;
        Investment that = (Investment) o;
        return Double.compare(that.investedAmount, investedAmount) == 0 &&
                Double.compare(that.currentValue, currentValue) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, investedAmount, currentValue);
    }
}