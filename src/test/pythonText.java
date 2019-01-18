package test;

public class pythonText {
    private int id;
    private float balance;
    private float annualInterestRate;

    public pythonText(int id,float balance, float annualInterestRate) {
        this.id = id;
        this. balance = balance;
        this. annualInterestRate = annualInterestRate;
        this.id = -10;
        setId(-10);
    }

    public void setId(int id){
        if (id < 0) id = 0;
        this.id = id;
    }
    public int getId() {
        if (id < 0) {
            id = 0;
        }
        return id;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public float getMonthlyInterestRate() {
        float monthlyInterestRate = annualInterestRate / 12;
        return monthlyInterestRate;
    }

    public float getMonthlyInterest() {
        return (this.getMonthlyInterestRate() / 100) * this.getBalance();
    }

    public boolean withdraw(float amount) {
        if (amount > this.getBalance()) return false;
        else this.balance -= amount; return true;
    }

    public float deposit(float amount) {
        return this.balance += amount;
    }

}



