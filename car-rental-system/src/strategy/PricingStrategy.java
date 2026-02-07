package strategy;

import java.time.LocalDate;

public interface PricingStrategy {
    double calculatePrice(LocalDate start, LocalDate end);
}
