
import java.util.Scanner;

public class InstallmentSavings extends Account {
	private int montlyDeposits;
	
	Scanner scn = new Scanner(System.in);
	
	public InstallmentSavings() {
		this.interestRate = 0.012;
	}
	
	@Override
	public void setDeposits() {
		
		System.out.println("월 입금 금액을 입력하세요");
		this.montlyDeposits = scn.nextInt();
		System.out.println(montlyDeposits + "원을 입력하셨습니다.");
	}
	
	@Override
	public void calcAmountofmoney(int period) {
		this.amountOfMoney = this.montlyDeposits * (this.period *12);
	}

	@Override
	public void calcInterest(int period) {
		this.interest = (12 * period) * this.montlyDeposits * this.interestRate;
	}
	@Override
	public void maturityAmount() {
		this.maturityAmount = this.amountOfMoney + this.interest;
	} 

	@Override
	public void showInfo() {
		System.out.println("★적금 통장 개설 완료★");
		super.showInfo();
		System.out.println("월 입금액 : " + this.montlyDeposits);
		System.out.println("이자율 : " + this.interestRate * 100 + "%");
		System.out.println("이자액 : " + this.interest);
		System.out.println("만기 환금액 : " + this.maturityAmount);
	}


}
