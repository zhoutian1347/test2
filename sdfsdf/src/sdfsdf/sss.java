package sdfsdf;

public class sss {
	public static void main(String[] args) {
		//年数
		int year = 5;
		//兔子初始数量
		int s = 10;
		//计算兔子年龄
		int ty = 1;
		for(int x=0; year > 0; x++) {
			System.out.println("第"+ty+"年兔子数量："+s);
			s = s + s * 2;
			year--;
			ty++;
		}
	}
}
