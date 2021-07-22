package use;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import homework.InstallmentSavingBankBook;
import homework.LoanBankBook;
import homework.SavingBankBook;

public class BankBook {
	
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		

		System.out.println("���� ���� �޴��Դϴ�. ������ ���ϴ� ������ ��ȣ�� ��������" );
		System.out.println("[1]���� ���� / [2] ���� ���� / [3] ���� ���� / [0] ���� ");
		
		int selectNum = scn.nextInt();
		switch(selectNum) {
		case 1:
			homework.BankBook saving = new SavingBankBook();
			saving.baseInput();
			saving.calc();
			saving.output();
			break;
		case 2:
			homework.BankBook iSavings = new InstallmentSavingBankBook();
			iSavings.baseInput();
			iSavings.calc();
			iSavings.output();
			break;
		case 3:
			homework.BankBook loan = new LoanBankBook();
			loan.baseInput();
			loan.calc();
			loan.output();
			break;
		case 0:
			System.out.println("�����մϴ�");
			break;
		}
	}


	}

