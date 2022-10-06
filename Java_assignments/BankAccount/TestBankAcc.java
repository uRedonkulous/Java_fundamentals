
class TestBankAcc {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		System.out.println("New Account ");
		b.deposit(400, "checking");
		b.deposit(50, "savings");
		b.displayAccBalances();
		
		System.out.println(BankAccount.totalBalance);

        b.withdrawal(100, "checking");
        b.withdrawal(51, "savings");
        b.displayAccBalances();

        System.out.println(BankAccount.totalBalance);

    BankAccount b2 = new BankAccount();
    System.out.println("New Account 2");
        b2.deposit(50, "checkings");
        b2.deposit(550, "savings");
        b2.displayAccBalances();
        b2.withdrawal(500, "savings");
        b2.displayAccBalances();

	}
}
