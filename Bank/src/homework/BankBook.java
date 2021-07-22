package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class BankBook {
	
	protected String custName;
	protected String accountNum;
	protected int period;
	protected double rate;
	protected long interest;
	protected long total;
	protected long maturityAmount;
	
	protected BufferedReader reader;
	public void baseInput() {
		if(reader == null) {
			reader = new BufferedReader(
						new InputStreamReader(System.in));
				//system.in(inputStream)을 Reader로 변환
		}
		System.out.print("고객 이름 :");
		
		try {
			custName = reader.readLine();
			//???? subclass에서 Override한 메소드 호출
			input();
			System.out.print("기간(년단위)?");
			period = reader.read() - 48 ; //아스키코드로 출력되기에 -48해주기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//checked Exception
		
		
	}
	
	protected abstract void input();
	
	public abstract void calc();
	
	public abstract void output();
	

}
