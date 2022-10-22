package practice;

public class countOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int countodd = 0, countEven = 0;
			int a = 1;
			int b = 23;
		for(int i = a;i <= b;i++) {
			if(i % 2 != 0) {
				countodd += 1;
			}
			else {
				countEven += 1;
			}
			
		}
		System.out.println("Total odd numbers between "+a+" and "+b+" is:"+countodd);
		System.out.println("Total even numbers between "+a+" and "+b+" is:"+countEven);
	}

}
