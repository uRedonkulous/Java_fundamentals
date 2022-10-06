public class BankAccount {
    //	The class should have the following attributes: (double) 
    //	checking balance, (double) savings balance.
        private double checkingAcc;
        private double savingsAcc;
    //	Create a class member (static) that has the 
    //	number of accounts created thus far.
        public static int numOfAccs = 0;
        public static double totalBalance = 0;
    //	Create a class member (static) that tracks the total amount 
    //	of money stored in every account created.
        public BankAccount() {
            BankAccount.numOfAccs += 1;
            this.checkingAcc = 0;
            this.savingsAcc = 0;
        }
    //	In the constructor, be sure to increment the account count.
    
    //	Create a getter method for the user's checking account balance.
        public double getCheckingAcc() {
            return this.checkingAcc;
        }
    //	Create a getter method for the user's saving account balance.
        public double getSavingsAcc() {
            return this.savingsAcc;
        }
    //	Create a method that will allow a user to deposit money into 
    //	either the checking or saving, be sure to add to total amount stored.
        public void deposit(double amount, String account) {
            if (account.equals("savings"))
                this.savingsAcc += amount;
            else if (account.equals("checking"))
                this.checkingAcc += amount;
            BankAccount.totalBalance += amount;
        }
    //	Create a method to withdraw money from one balance. Do not allow 
    //	them to withdraw money if there are insufficient funds.
        public void withdrawal(double amount, String account) {
            boolean valid = false;
                if (account.equals("savings")) {
                    if(this.savingsAcc - amount >-0)
                        valid = true;
                    this.savingsAcc -= amount;
                }
                else if (account.equals("checking")) {
                    if(this.checkingAcc >= 0) {
                        valid = true;
                        this.checkingAcc -= amount;
                    }
            }
            if(valid) {
                BankAccount.totalBalance -= amount;
            }
            else {
                System.out.println("Insufficient Funds");
            }
        }
    //	Create a method to see the total money from the checking and saving.
        public void displayAccBalances() {
            System.out.println(String.format("Checkings: %f, Savings: %f", this.checkingAcc, this.savingsAcc));
        }
    //	Users should not be able to set any of the attributes from the class.
    }
    