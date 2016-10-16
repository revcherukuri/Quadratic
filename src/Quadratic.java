import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		printOutput();
	}
		public static void printOutput(){
			double root1;
		
		double root2;
		double root3;
		Scanner read = new Scanner(System.in);
		System.out.println("Welcome to the quadratic equation solver. You will be asked to enter your quadratic, and I will return the roots");
		System.out.println("Please enter your a value");
		int a = read.nextInt();
		System.out.println("Please enter your b value");
		int b = read.nextInt();
		System.out.println("Please enter your c value");
		int c = read.nextInt();
		double discriminant = (b*b)+(-4*a*c);
		if(discriminant > 0);
		{
			root1 = (-b + Math.sqrt(discriminant))/(2*a);
			root2 = (-b - Math.sqrt(discriminant))/(2*a);
			System.out.println("Your first root is " + root1);
			System.out.println("Your second root is " + root2);
			
		}
		
			if(discriminant < 0)
		{
			root1 = discriminant*-1;
			root2 = a*2;
			
			System.out.println("Your first root is " + -b + "+ i*root (" + root1 + ") All divided by " + root2);
			System.out.println("Your first root is " + -b + "- i*root (" + root1 + ") All divided by " + root2);
			System.out.println("The square root of " + root1 + " = " + Math.sqrt(root1));
			
		}
		
		if(discriminant == 0)
		{
			root1 = b*(-1);
			root2 = 2*a;
			root3 = ((root1)/(root2));
			System.out.println(root3 + " is your only root");
		}

		}

}
