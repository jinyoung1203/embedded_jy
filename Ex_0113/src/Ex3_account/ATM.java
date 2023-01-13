package Ex3_account;

public class ATM {

	private int money;

	// 입금을 위한 기능
	public void deposit(int money) {
		this.money += money;
		System.out.println("입금 완료");
	}

	// 출금을 위한 기능
	public int withdraw(int money) {

		if (this.money - money < 0) {
			System.out.println("출금불가");
			return 0;
		} else {
			this.money -= money;
			System.out.println("출금성공 ");
		}

		return money;

	}

	// 잔액확인을 위한 기능
	public void showMoney() {
		System.out.println("잔액 : " + money);
	}

}
