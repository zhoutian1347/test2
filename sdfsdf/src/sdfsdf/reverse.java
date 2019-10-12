package sdfsdf;

public class reverse {
	public static void main(String[] args) {
		String str = "abcdefg";
		byte[] c = str.getBytes();
		char cc[] = new char[c.length];
		int y = 0;
		String s = "";
		for(int x=c.length-1; x>=0 ; x--) {
			cc[y] = (char)c[x];
			s += cc[y];
			y++;
		}
		System.out.println(s);
	}
}
