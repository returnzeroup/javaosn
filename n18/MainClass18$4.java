package n15$n44;
import java.util.Scanner;

public class MainClass18$4 {
	public static void main(String[] args) {
		System.out.print("Введите любое целое положительное число: ");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int sum = 0;
		for (int y=1; y<= n; y++){
			sum = sum + y;
		}
		System.out.println (sum);		
	}
}
