package com.vinayak.finance_tracker.dto;


import java.util.Objects;

public class CategorySummaryDTO {

    private String category;
    private double totalAmount;

    public CategorySummaryDTO() {
    }

    public CategorySummaryDTO(String category, double totalAmount) {
        this.category = category;
        this.totalAmount = totalAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "CategorySummaryDTO{" +
                "category='" + category + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategorySummaryDTO)) return false;
        CategorySummaryDTO that = (CategorySummaryDTO) o;
        return Double.compare(that.totalAmount, totalAmount) == 0 &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, totalAmount);
    }
}