import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int selectNum = scn.nextInt();
		
		System.out.println("���� ���� �޴��Դϴ�./n ������ ���ϴ� ������ ��ȣ�� ��������" );
		System.out.println("[1]���� ���� / [2] ���� ���� / [3] ���� ���� / [0] ���� ");
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
			Account loan = new loan();
			loan.makeAccount();
			break;
		case 0:
			System.out.println("�����մϴ�");
			break;
		}

	}

}
