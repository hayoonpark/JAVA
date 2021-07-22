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
	public void input() { //Exceiption���� ���� ����(����Ŭ������ �������)
		System.out.println("�� �Ա� �ݾ�?");
		try {
			montlyDeposits = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			System.out.println(",�� Ư������ ������� ���ð� ���ڸ� ������");
			input(); //���ȣ��
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
		System.out.println("������ ���� ���� �Ϸ��");
		System.out.println("���¹�ȣ : " + accountNum);
		System.out.println("�Ⱓ(��) : " + period);
		System.out.println("�� ���ӱݾ� : " +montlyDeposits);
		System.out.println("���� : " + rate* 100 + "%");
		System.out.println("���� : " + interest );
		System.out.println("����ȯ�ݾ� : " + maturityAmount);
	}


	

}
