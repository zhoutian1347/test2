package sdfsdf;

public class Outer {
	final int a = 99;
	
	public void show () {
		//�����ڲ���MInner��ֻ���ڷ����ڲ�ʹ�ã�����ʹ�÷��ʿ��Ʒ���static
		class MInner{
			int c = 2;
			public void print() {
				System.out.println("�����ڲ�������ⲿ���еĳ���a:" + a);
				System.out.println("�����ڲ����еı���c��" + c);
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
