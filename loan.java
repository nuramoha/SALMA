

import java.util.Date;

public class loan {

    // fields
    private double AnnualIntersetRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public loan(double intersetRate,
                int numberOfYears,
                double loanAmount,
                Date loanDate) {

        this.AnnualIntersetRate = intersetRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = loanDate;
    }

    public loan() {
        AnnualIntersetRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
        loanDate = new Date();
    }

    // getters
    public double getAnnualIntersetRate() {
        return AnnualIntersetRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    // setters
    public void setAnnualIntersetRate(double AnnualInterset) {
        this.AnnualIntersetRate = AnnualInterset;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {

        double monthlyInterestRate = AnnualIntersetRate / 100 / 12;
        int numberOfPayments = numberOfYears * 12;

        double MonthlyPayment =
                loanAmount * monthlyInterestRate /
                        (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        return MonthlyPayment;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    public static void main(String[] args) {

        // Create Loan object
        loan loan = new loan();

        System.out.println("Annual Interest Rate: "
                + loan.getAnnualIntersetRate());

        System.out.println("Number of Years: "
                + loan.getNumberOfYears());

        System.out.println("Loan Amount: "
                + loan.getLoanAmount());

        System.out.println("Loan Date: "
                + loan.getLoanDate());

        System.out.println("Monthly Payment: "
                + loan.getMonthlyPayment());

        System.out.println("Total Payment: "
                + loan.getTotalPayment());
    }
}
