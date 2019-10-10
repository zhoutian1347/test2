package sdfsdf;

public class Outer {
	final int a = 99;
	
	public void show () {
		//方法内部类MInner，只能在方法内部使用，不能使用访问控制符和static
		class MInner{
			int c = 2;
			public void print() {
				System.out.println("方法内部类访问外部类中的常量a:" + a);
				System.out.println("访问内部类中的变量c：" + c);
			}
			
		}
		MInner mi = new MInner();
		mi.print();
	}
	
	public static void main(String[] args) {
		Outer out = new Outer();
		out.show();
	}
}
