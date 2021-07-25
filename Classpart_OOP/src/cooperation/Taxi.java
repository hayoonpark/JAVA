package cooperation;

public class Taxi {

	int money;

	public void take(int money) {	//승차
		this.money += money;
	}
	public void showTaxiInfo() {
		System.out.println("택시의 수입은 " + money);
	}


}
