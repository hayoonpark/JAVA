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
		

		System.out.println("통장 개설 메뉴입니다. 개설을 원하는 통장의 번호를 누르세요" );
		System.out.println("[1]저축 통장 / [2] 적금 통장 / [3] 대출 통장 / [0] 종료 ");
		
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
			System.out.println("종료합니다");
			break;
		}
	}


	}

