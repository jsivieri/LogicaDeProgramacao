import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String args[]) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	double A = sc.nextDouble();
	double B = sc.nextDouble();
	double D = sc.nextDouble();
	double med = ((A*2)+(B*3)+(D*5)) / 10 ;
	System.out.printf("MEDIA = %.1f%n",med);
	
	sc.close();
	}
}