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
				//system.in(inputStream)�� Reader�� ��ȯ
		}
		System.out.print("�� �̸� :");
		
		try {
			custName = reader.readLine();
			//???? subclass���� Override�� �޼ҵ� ȣ��
			input();
			System.out.print("�Ⱓ(�����)?");
			period = reader.read() - 48 ; //�ƽ�Ű�ڵ�� ��µǱ⿡ -48���ֱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//checked Exception
		
		
	}
	
	protected abstract void input();
	
	public abstract void calc();
	
	public abstract void output();
	

}
