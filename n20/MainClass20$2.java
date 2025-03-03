package n15$n44;

public class MainClass20$2 {
	 public static void main(String args[]){
		 
	        for (int da = 1; da <= 3; da++) {
	            System.out.println("Это первый цикл! Я выполняюсь " + da + " раз");
	            for (int ad = 1; ad <= 10; ad++) {
	                System.out.println("    Это второй цикл! Я выполняюсь " + ad + " раз");
	                if (ad == 2)
	                    break;
	            }
	        }
	    }
}
