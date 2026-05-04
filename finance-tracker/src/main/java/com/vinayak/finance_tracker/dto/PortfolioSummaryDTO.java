package com.vinayak.finance_tracker.dto;



import java.util.Objects;

public class PortfolioSummaryDTO {

    private double totalInvested;
    private double totalCurrent;
    private double totalProfit;

    public PortfolioSummaryDTO() {
    }

    public PortfolioSummaryDTO(double totalInvested, double totalCurrent, double totalProfit) {
        this.totalInvested = totalInvested;
        this.totalCurrent = totalCurrent;
        this.totalProfit = totalProfit;
    }

    public double getTotalInvested() {
        return totalInvested;
    }

    public void setTotalInvested(double totalInvested) {
        this.totalInvested = totalInvested;
    }

    public double getTotalCurrent() {
        return totalCurrent;
    }

    public void setTotalCurrent(double totalCurrent) {
        this.totalCurrent = totalCurrent;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    @Override
    public String toString() {
        return "PortfolioSummaryDTO{" +
                "totalInvested=" + totalInvested +
                ", totalCurrent=" + totalCurrent +
                ", totalProfit=" + totalProfit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PortfolioSummaryDTO)) return false;
        PortfolioSummaryDTO that = (PortfolioSummaryDTO) o;
        return Double.compare(that.totalInvested, totalInvested) == 0 &&
                Double.compare(that.totalCurrent, totalCurrent) == 0 &&
                Double.compare(that.totalProfit, totalProfit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalInvested, totalCurrent, totalProfit);
    }
}