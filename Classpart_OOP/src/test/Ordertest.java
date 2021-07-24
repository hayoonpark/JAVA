package test;

public class Ordertest {

	public static void main(String[] args) {
		Order order = new Order();
		order.orderNum = "201907210001";
		order.id = "abc123";
		order.date = "2019년 7월 21일";
		order.name = "홍길순";
		order.productNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주분 번호 : " + order.orderNum);
		System.out.println("주분자 아이디: " + order.id);
		System.out.println("주분 날짜 : " + order.date);
		System.out.println("주분자 이름 : " + order.name);
		System.out.println("주분 상품 번호 : " + order.productNum);
		System.out.println("배송 주소 : " + order.address);
		

	}

}
