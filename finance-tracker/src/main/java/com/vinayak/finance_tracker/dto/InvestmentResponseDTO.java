package com.vinayak.finance_tracker.dto;



import java.util.Objects;

public class InvestmentResponseDTO {

    private Long id;
    private String type;
    private double investedAmount;
    private double currentValue;
    private double profit;

    public InvestmentResponseDTO() {
    }

    public InvestmentResponseDTO(Long id, String type, double investedAmount, double currentValue, double profit) {
        this.id = id;
        this.type = type;
        this.investedAmount = investedAmount;
        this.currentValue = currentValue;
        this.profit = profit;
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

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "InvestmentResponseDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", investedAmount=" + investedAmount +
                ", currentValue=" + currentValue +
                ", profit=" + profit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvestmentResponseDTO)) return false;
        InvestmentResponseDTO that = (InvestmentResponseDTO) o;
        return Double.compare(that.investedAmount, investedAmount) == 0 &&
                Double.compare(that.currentValue, currentValue) == 0 &&
                Double.compare(that.profit, profit) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, investedAmount, currentValue, profit);
    }
}