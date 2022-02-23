import java.util.Scanner;
public class Main{
	public static void main(String args[]) {
		double x, y;
		System.out.print("X = ");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextDouble();
		
		double form = 1/Math.abs(x+2);
		if(x<1) 
		{
			y = form - 7*x*x+x-8;
		}
		if(x>=1 && x<=4) 
		{
			y = form - (1/(Math.tan(x+4 / Math.pow(11, 1/2)))+3);
		}
		else //if(x>4) 
		{
			y = form - Math.pow(1+Math.abs(Math.pow(Math.cos(x), 3)), 1/2);
		}
		System.out.println("Y = " + String.format("%.4f", y));
		
		double x1, y1;
		System.out.print("X1 = ");
		x1 = scanner.nextDouble();
		scanner.close();
		double form1 = 4.95*x1*x1;

		if(x1<-3.5) {
			y1 = form1 + 4 + x1*x1;
		}
		else {
			if(x1>=-3.5 && x1<1) {
			y1 = form1 + Math.tan((3.5+x1)/5);
			}
			else {
			y1 = form1 + Math.sin(3*x1)-Math.cos(x1);
			}
		}
		System.out.println("Y1 = " + String.format("%.4f", y1));
	}
}
