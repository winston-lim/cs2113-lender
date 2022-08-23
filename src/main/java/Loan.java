public class Loan {
    private int amount;
    private boolean isPaid;
    private final String borrower;
    private final double interestRate;
    private final String contactNumber;

    public Loan(int amount, String borrower, double interestRate, String contactNumber) {
        this.amount = amount;
        this.borrower = borrower;
        this.interestRate = interestRate;
        this.isPaid = false;
        this.contactNumber = contactNumber;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getBorrower() {
        return this.borrower;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public boolean isIsPaid() {
        return this.isPaid;
    }

    public boolean getIsPaid() {
        return this.isPaid;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setAsPaid() {
        this.isPaid = true;
    }

}
