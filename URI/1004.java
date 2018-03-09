import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String args[]) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int X = (A*B);
	System.out.println("PROD = "+X);
	
	sc.close();
	}
}