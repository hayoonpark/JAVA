package templete;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("차를 주행합니다");
		System.out.println("자도차가 스스로 방향을 바꿉니다");
		
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다");
		
	}

	@Override
	public void washCar() {
		System.out.println("차를 세차합니다");
	}
	

}
