package test;

import informationHide.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setYear(2021);
		date.setMonth(7);
		date.setDay(25);

		date.showDate();
	}

}
