package entitites;

public class AccountModify {

	private int numberAccount;
	private String name;
	private double money;

	public AccountModify(int numberAccount, String name, double initialDeposit) {
		super();
		this.numberAccount = numberAccount;
		this.name = name;
		depositos(initialDeposit);
	}

	public AccountModify(int numberAccount, String name) {
		super();
		this.numberAccount = numberAccount;
		this.name = name;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void saques(double saque) {
		this.money -= saque + 5;
	}

	public void depositos(double deposito) {
		this.money += deposito;
	}

	public String toString() {
		return "Account " + numberAccount + ", " + "Holder: " + name + ", " + String.format("Balance: $ %.2f", money);
	}

}
