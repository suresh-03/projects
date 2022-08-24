
public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c;
		
		for(int i = 0; i < 10; i++) {
			if(a == 0) {
				System.out.println(1);
			}
			
			c = a + b;
			a = b;
			b = c;
			
			System.out.println(c);
		}
	}

}
