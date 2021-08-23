import java.util.Scanner;

public class Loan extends Account {
	private double montlyRepayment;
	
	Scanner scn = new Scanner(System.in);
	
	public Loan() {
		this.interestRate = 0.078;
	}
	
	@Override
	public void setDeposits() {
		System.out.println("대출 금액을 입력하세요");
		this.amountOfMoney = scn.nextInt();
		System.out.println(amountOfMoney + "원을 입력하셨습니다.");
	}
	
	@Override
	public void calcInterest(int period) {
		this.interest = period * this.amountOfMoney * this.interestRate;
	}
	
	@Override
	public void calcMontlyRepayment(int period) {
		this.montlyRepayment = (this.amountOfMoney + this.interest) / (period * 12);
	}

	@Override
	public void showInfo() {
		System.out.println("★대출 통장 개설 완료★");
		super.showInfo();
		System.out.println("대출액 : " + this.amountOfMoney);
		System.out.println("이자율 : " + this.interestRate * 100 + "%");
		System.out.println("이자액 : " + this.interest);
		System.out.println("월 상환 금액 : " + this.montlyRepayment);
	}

}
