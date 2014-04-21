import java.util.Scanner;

public class fibonnaci2 {
	public static void main (String args[]) {
	
	Scanner s = new Scanner (System.in);
	System.out.println ("inputkan angka");
	
	int b =0;
	int c =1;
	int a =s.nextInt();
	for(int i =1 ; i<=a; i++){
	System.out.print(b+" ");
	c=c+b;
	b=c-b;
	}
	}
	}
