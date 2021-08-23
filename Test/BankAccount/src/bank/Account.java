package bank;
import java.util.Scanner;

public class Account {
	protected String name;
	protected String accountNumber;
	protected int amountOfMoney;
	protected int period;
	protected double interestRate;
	protected double maturityAmount;
	protected double interest;
	
	public Account() {
		
	}
	
	Scanner scn = new Scanner(System.in);
	
	public void start() {
		

		System.out.println("통장 개설 메뉴입니다. 개설을 원하는 통장의 번호를 누르세요" );
		System.out.println("[1]저축 통장 / [2] 적금 통장 / [3] 대출 통장 / [0] 종료 ");
		int selectNum = scn.nextInt();
		
		switch(selectNum) {
		case 1:
			Account saving = new Savings();
			saving.makeAccount();
			break;
		case 2:
			Account iSavings = new InstallmentSavings();
			iSavings.makeAccount();
			break;
		case 3:
			Account loan = new Loan();
			loan.makeAccount();
			break;
		case 0:
			System.out.println("종료합니다");
			break;
		}
	}
		
	public void getName() {
		System.out.println("고객님의 성함을 입력해주세요");
		this.name = scn.next();
		System.out.println(name + "님을 입력하셨습니다");
	}
	
	public void getTerm() {
		System.out.println("원하는 기간을 입력해주세요(년단위)");
		this.period = scn.nextInt();
	}
	
	public void makeAccountNumber() {
		int acNum1 = (int) (Math.random() * 10000);
		int acNum2 = (int) (Math.random() * 10000);
		this.accountNumber = "01-" + acNum1 + "-" + acNum2;
	}
	public void showInfo() {
		System.out.println("고객명 :" + name);
		System.out.println("계좌번호 : " + accountNumber);
		
	}
	
	public void setDeposits() {}
	
	public void calcAmountofmoney(int period) {}
	
	public void calcInterest(int period) {}
	
	public void maturityAmount() {
	} 
	
	public void calcMontlyRepayment(int period) {
		
	}
	
	public void makeAccount() {
		getName();
		makeAccountNumber();
		setDeposits();
		getTerm();
		calcInterest(this.period);
		calcAmountofmoney(this.period);
		calcMontlyRepayment(this.period);
		maturityAmount();
		
		showInfo();
	}

	
	
	
}
