package com.vinayak.finance_tracker.Investmentservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.vinayak.finance_tracker.dto.InvestmentDTO;
import com.vinayak.finance_tracker.dto.InvestmentResponseDTO;
import com.vinayak.finance_tracker.dto.PortfolioSummaryDTO;
import com.vinayak.finance_tracker.entity.Investment;
import com.vinayak.finance_tracker.exception.ResourceNotFoundException;
import com.vinayak.finance_tracker.repository.InvestmentRepository;

@Service
public class InvestmentService {

    private final InvestmentRepository repo;

    public InvestmentService(InvestmentRepository repo) {
        this.repo = repo;
    }

    // CREATE
    public InvestmentResponseDTO addInvestment(InvestmentDTO dto) {

        Investment inv = new Investment();
        inv.setType(dto.getType());
        inv.setInvestedAmount(dto.getInvestedAmount());
        inv.setCurrentValue(dto.getCurrentValue());

        return mapToDTO(repo.save(inv));
    }

    // READ
    public List<InvestmentResponseDTO> getAllInvestments() {
        return repo.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    // DELETE
    public void deleteInvestment(Long id) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException("Investment not found");
        }
        repo.deleteById(id);
    }

    // Map + Profit Cal
    private InvestmentResponseDTO mapToDTO(Investment inv) {
        InvestmentResponseDTO dto = new InvestmentResponseDTO();
        dto.setId(inv.getId());
        dto.setType(inv.getType());
        dto.setInvestedAmount(inv.getInvestedAmount());
        dto.setCurrentValue(inv.getCurrentValue());

        double profit = inv.getCurrentValue() - inv.getInvestedAmount();
        dto.setProfit(profit);

        return dto;
    }
    public PortfolioSummaryDTO getSummary() {

        List<Investment> list = repo.findAll();

        double totalInvested = list.stream()
                .mapToDouble(Investment::getInvestedAmount)
                .sum();

        double totalCurrent = list.stream()
                .mapToDouble(Investment::getCurrentValue)
                .sum();

        double totalProfit = totalCurrent - totalInvested;

        return new PortfolioSummaryDTO(totalInvested, totalCurrent, totalProfit);
    }
}
