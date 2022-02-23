import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		double P = 0;
		for(int i=1; i<15; i++) 
		{
			P += (Math.pow(Math.sin(i),2) + Math.pow(Math.cos(i/2),2)) / i * i;
		}
		System.out.println("P = "+String.format("%.4f",P));
		
		double P1 = 0;
		int K = 1, N = 10, i = K;
		Scanner scanner = new Scanner(System.in);
		System.out.print("K = ");
		K = scanner.nextInt();
		System.out.print("N = ");
		N = scanner.nextInt();
		scanner.close();
		while(i < N) 
		{
			P1 += K/i + i/N;
			i++;
		}
		System.out.println("P = " + String.format("%.4f", P1));
	}
}
