package strategy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DailyPricingStrategy implements PricingStrategy {

    public double calculatePrice(LocalDate start, LocalDate end) {
        long days = ChronoUnit.DAYS.between(start, end);
        return days * 50;
    }
}
