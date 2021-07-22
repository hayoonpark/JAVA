package homework;

import java.io.IOException;

public class SavingBankBook extends BankBook {
	private static int count;
	
	public SavingBankBook() {
		//accountNum = "300-" + ++count;
		accountNum = String.format("%3d-%04d",BankCode.SAVING_ACCOUNT, ++count);
		rate = 0.045;
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
		interest = (long) (total * rate);
		maturityAmount = total + interest;
	}

	@Override
	public void output() {
		System.out.println("������ ���� ���� �Ϸ��");
		System.out.println("���¹�ȣ : " + accountNum);
		System.out.println("�Ⱓ(��) : " + period);
		System.out.println("�Աݾ� : " + total);
		System.out.println("���� : " + rate* 100 + "%");
		System.out.println("���� : " + interest );
		System.out.println("����ȯ�ݾ� : " + maturityAmount);
	}

	

}
