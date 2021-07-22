package homework;

import java.io.BufferedReader;
import java.io.IOException;

public class LoanBankBook extends BankBook {
	protected int montlyPaidAmount;
	private static int count; //����Ŭ������ X 
	

	public LoanBankBook() {
		//accountNum = "300-" + ++count;
		accountNum = String.format("%3d-%04d",BankCode.LOAN_ACCOUNT, ++count);
		rate = 0.078;
	}

	@Override
	public void input() { //Exceiption���� ���� ����(����Ŭ������ �������)
		System.out.println("���� �ݾ�?");
		try {
			total = Long.parseLong(reader.readLine());
		} catch (NumberFormatException e) {
			System.out.println(",�� Ư������ ������� ���ð� ���ڸ� ������");
			input(); //���ȣ��
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
		System.out.println("�ڴ��� ���� ���� �Ϸ��");
		System.out.println("���¹�ȣ : " + accountNum);
		System.out.println("�Ⱓ(��) : " + period);
		System.out.println("����ݾ� : " + total);
		System.out.println("���� : " + rate* 100 + "%");
		System.out.println("���� : " + interest );
		System.out.println("�� ���Աݾ� : " + montlyPaidAmount);
	}

	
}
