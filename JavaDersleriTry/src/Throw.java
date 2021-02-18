
public class Throw {
	public static void main(String[] args) {
		int a=0;
		if(a==0) {
			System.out.println("a 0 esit olamaz");
			throw new ArithmeticException("Exception");
		}
		System.out.println("kodun devamý");
	}

}
