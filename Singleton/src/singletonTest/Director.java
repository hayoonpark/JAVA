package singletonTest;

public class Director {
	 private Builder builder;
	 public Director(Builder builder) {
	 this.builder = builder;
	 }
	 public String create() {
	 builder.makeTitle("Fruit");
	 builder.makeString("좋아하는과일");
	 builder.makeItems(new String[]{"코코넛", "체리", "딸기", "메론", "참외","수박" });
	 builder.makeString("좋아하지 않는 과일");
	 builder.makeItems(new String[]{"토마토","바나나","깍아놓은 사과 " });
	 return builder.getResult();
	 }
	}

