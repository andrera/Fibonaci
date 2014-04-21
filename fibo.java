import java.util.Scanner;

public class fibo {
	public static void main (String args[]) {
	
	Scanner s = new Scanner (System.in);
	System.out.println ("inputkan angka");
	
	int b =0;
	int c =1;
	int a =s.nextInt();
	for(int i =1 ; i<=a; i++){
	
	c=c+b;
	b=c-b;
	}
	System.out.print("angkanya adalah : ");
	System.out.print(c+b-1);
	}
	}
