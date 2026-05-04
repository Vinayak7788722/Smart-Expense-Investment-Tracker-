package com.vinayak.finance_tracker.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class InvestmentDTO {

    @NotBlank
    private String type;

    @Positive
    private double investedAmount;

    @Positive
    private double currentValue;

    public InvestmentDTO() {
    }

    public InvestmentDTO(String type, double investedAmount, double currentValue) {
        this.type = type;
        this.investedAmount = investedAmount;
        this.currentValue = currentValue;
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
        return "InvestmentDTO{" +
                "type='" + type + '\'' +
                ", investedAmount=" + investedAmount +
                ", currentValue=" + currentValue +
                '}';
    }
}