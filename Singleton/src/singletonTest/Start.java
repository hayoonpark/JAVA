package singletonTest;

public class Start {
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			close();
		}
		Builder builder = null;	//Builder가 abstract라 null로 지정
		if (args[0].equals("plain")) {
			builder = new TextBuilder();
		} else if (args[0].equals("html")) {
			builder = new HTMLBuilder();
		} else {
			usage();
			close();
		}
		Director director = new Director(builder);
		String result = director.create();
		System.out.println(result + "이 작성되었다");
	}

	public static void usage() {
		 System.out.println("화면에 일반 텍스트 출력하기는 ");
		 System.out.println("Usage: java Start plain");
		 System.out.println(" HTML 파일 문서작성은");
		 System.out.println("Usage: java Start html");
		 }

	public static void close() {	//main이 static이라 인스턴스 안만드려고 같이 static으로 해줌
		System.exit(0);
	}
}
