package brmlab2;

public class Mynumber {
	public int reverse(int num) {
		int rev =0;
		while(num > 0) {
			rev = rev*10 + num%10;
			num = num/10; 
		}
		return rev;
	}
	
	public int sum(int a,int v) {
		return a+v;
	}
	
	
}
