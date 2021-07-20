import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int selectNum = scn.nextInt();
		
		System.out.println("통장 개설 메뉴입니다./n 개설을 원하는 통장의 번호를 누르세요" );
		System.out.println("[1]저축 통장 / [2] 적금 통장 / [3] 대출 통장 / [0] 종료 ");
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
			System.out.println("종료합니다");
			break;
		}

	}

}
