package polymorphism01;


public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
//		customerLee.setCustomerName("�̼���");
//		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerinfo());
		
		Customer customerkim = new VIPCustomer(10020, "������");
//		customerkim.setCustomerName("������");
//		customerkim.setCustomerID(10020);
		customerkim.bonusPoint = 10000;
		System.out.println(customerkim.showCustomerinfo());

		
	}

}
