package sdfsdf;

abstract class Person{
	public abstract void eat();
}

public class train {
	public static void main(String[] args) {
		// ，匿名内部类使用，必须有一个前提条件，必须继承一个父类或实现一个接口
		Person p = new Person() {
			@Override
			public void eat() {
				System.out.println("该吃饭了");
			}
		};
		p.eat();
	}
}
