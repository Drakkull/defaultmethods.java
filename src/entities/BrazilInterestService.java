package entities;

import java.security.InvalidParameterException;

public class BrazilInterestService {
    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }


    public double payment ( double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months MUST be greater than 1! ");

        }
        return amount * Math.pow(1.0 + interestRate / 100.0, months);
    }
}
