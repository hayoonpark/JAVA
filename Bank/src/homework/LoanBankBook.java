package homework;

import java.io.BufferedReader;
import java.io.IOException;

public class LoanBankBook extends BankBook {
	protected int montlyPaidAmount;
	private static int count; //기초클래스에 X 
	

	public LoanBankBook() {
		//accountNum = "300-" + ++count;
		accountNum = String.format("%3d-%04d",BankCode.LOAN_ACCOUNT, ++count);
		rate = 0.078;
	}

	@Override
	public void input() { //Exceiption선언 생략 가능(기초클래스에 있을경우)
		System.out.println("대출 금액?");
		try {
			total = Long.parseLong(reader.readLine());
		} catch (NumberFormatException e) {
			System.out.println(",나 특수문자 사용하지 마시고 숫자만 쓰세요");
			input(); //재귀호출
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void calc() {
		interest = (long) (period * total * rate);
		montlyPaidAmount = (int) ((total + interest) / (period * 12));
	}
	
	@Override
	public void output() {
		System.out.println("★대출 통장 개설 완료★");
		System.out.println("계좌번호 : " + accountNum);
		System.out.println("기간(년) : " + period);
		System.out.println("대출금액 : " + total);
		System.out.println("이율 : " + rate* 100 + "%");
		System.out.println("이자 : " + interest );
		System.out.println("월 납입금액 : " + montlyPaidAmount);
	}

	
}
