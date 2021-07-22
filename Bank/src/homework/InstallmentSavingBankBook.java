package homework;

import java.io.IOException;

public class InstallmentSavingBankBook extends BankBook {
	private static int count;
	private int montlyDeposits;
	
	public InstallmentSavingBankBook() {
		//accountNum = "300-" + ++count;
		accountNum = String.format("%3d-%04d",BankCode.INSTALLMENT_ACCOUNT, ++count);
		rate = 0.012;
	}

	@Override
	public void input() { //Exceiption선언 생략 가능(기초클래스에 있을경우)
		System.out.println("월 입금 금액?");
		try {
			montlyDeposits = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			System.out.println(",나 특수문자 사용하지 마시고 숫자만 쓰세요");
			input(); //재귀호출
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	@Override
	public void calc() {
		interest = (long) (montlyDeposits * (period * 12) * rate);
		maturityAmount = montlyDeposits * (period * 12) + interest;
		
	}
	
	@Override
	public void output() {
		System.out.println("★적금 통장 개설 완료★");
		System.out.println("계좌번호 : " + accountNum);
		System.out.println("기간(년) : " + period);
		System.out.println("월 납임금액 : " +montlyDeposits);
		System.out.println("이율 : " + rate* 100 + "%");
		System.out.println("이자 : " + interest );
		System.out.println("만기환금액 : " + maturityAmount);
	}


	

}