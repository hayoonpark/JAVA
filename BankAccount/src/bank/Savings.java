package bank;
import java.util.Scanner;

public class Savings extends Account {
	
	Scanner scn = new Scanner(System.in);
	
	public Savings() {
		this.interestRate = 0.045;
	}
	
	@Override
	public void setDeposits() {
		System.out.println("초기 입금 금액을 입력하세요");
		this.amountOfMoney = scn.nextInt();
		System.out.println(amountOfMoney + "원을 입력하셨습니다");		
	}

	@Override
	public void calcInterest(int period) {
		this.interest = this.amountOfMoney * this.interestRate * period;
	}
	@Override
	public void maturityAmount() {
		this.maturityAmount = this.amountOfMoney + this.interest;
	} 

	@Override
	public void showInfo() {
		System.out.println("★저축 통장 개설 완료★");
		super.showInfo();
		System.out.println("입금액 : " + this.amountOfMoney);
		System.out.println("이자율 : " + this.interestRate * 100 + "%");
		System.out.println("이자액 : " + this.interest);
		System.out.println("만기 환금액 : " + this.maturityAmount);
	}
	
	


	
	
	
}
