package n15$n44;

public class MainClass43$5 {
	   public static void main(String[] args) {
	        int a = 1;
	        int b = 1;
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Умножим: " + a + " на 2");
	            int c = a << b;
	            System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
	            System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
	            System.out.println("Результат: " + c);
	            a = c;
	        }
	    }
}
