package brmlab2;

public class Mynumber {
	public int reverse(int num) {
		int Rev =0;
		while(num > 0) {
			Rev = Rev*10 + num%10;
			num = num/10; 
		}
		return Rev;
	}
	
	public int sum(int p,int v) {
		return p+v;
	}
	
	
}
