import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName,LocalDate dateOfBirth, int accountNumber, double balance) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposit(double depositValue) {
        this.balance += depositValue;
    }

    public void withdraw(double withdrawValue) {
        this.balance -= withdrawValue;
    }

    public void payInterest(double interestRate) {
        double interest = this.balance * interestRate;
        this.balance += interest;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

}
