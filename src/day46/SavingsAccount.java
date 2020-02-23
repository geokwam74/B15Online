package day46;

public class SavingsAccount extends BankAccount {

    double interestRate;

    public SavingsAccount(String accountHolder, long accountNum, double balance, double interestRate) {
        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;

    }
    //BAD IDEA TO HAVE MAIN HERE, JUST DOING IT ANYWAY.

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("George", 12345, 50000, 4.2);
        System.out.println("S1 = " + s1.toString());

        s1.withdraw(10000);
        System.out.println("s1 = " + s1);

    }
    @Override // this is called annotation
    // it will ensure this is actually a valid overridden method
    // if any rule does not match , it will not even compile
    public void deposit(int amount){
        // balance += amount + amount * interestRate;
        int actualAmount = (int)(amount + amount * interestRate) ;
        super.deposit( actualAmount );
    }

    //in our SavingsAccount , if you withdraw any amount of money
    //    // you will get 30 dollar penalty
    //    // so we will override the withdraw method to reflect this requirement


    public void withdraw(int amount) {
        //taking away 30$ more on top of what you withdraw
        // balance -=(amount +30);
        // balance = balance - amount-30;
        balance -= amount;
        balance -= 30;//this is the penalty


        // or super.withdraw(amount+30);



    }

    @Override// it optional,once being used, it will enforce overriding rule
    //if any rule does not match it will not even compile
    //so it's always good to use it to prevent accidental errors
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }






}