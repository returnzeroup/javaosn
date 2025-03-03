package n11;

public class TestMainClass11$2 {
	public static void main(String[] args) {
		int s = 2;
		s++;
		System.out.println (s);
		int f = 2;
		f--;
		System.out.println (f);
		int g = 2;
		int h = 2;
		int a = 2 * g++;
		int b = 2 * ++g;
		System.out.println(a);
		System.out.println(b);
		System.out.println(g);
		System.out.println(h);
	}
}
