package sdfsdf;

abstract class Person{
	public abstract void eat();
}

public class train {
	public static void main(String[] args) {
		// �������ڲ���ʹ�ã�������һ��ǰ������������̳�һ�������ʵ��һ���ӿ�
		Person p = new Person() {
			@Override
			public void eat() {
				System.out.println("�óԷ���");
			}
		};
		p.eat();
	}
}
