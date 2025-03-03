package n15$n44;

public class MainClass43$8 {
	   public static void main(String[] args) {
	        int y = 35;
	        int b = 1;
	        for (int i = 0; i < 7; i++) {
	            System.out.println("Умножим: " + y + " на 2");
	            int xd = y << b;
	            System.out.println("Представление числа: " + y + " в двоичной системе исчисления: " + Integer.toBinaryString(y));
	            System.out.println("Представление числа: " + xd + " в двоичной системе исчисления: " + Integer.toBinaryString(xd));
	            System.out.println("Результат: " + xd);
	            y = xd;
	        }
	    }
}
