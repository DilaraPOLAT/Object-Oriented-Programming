
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Online Dersler :"+Student.HowStudent());
		Student s1=new Student("Ahmet",202,100);
		Student s2=new Student("Ayse",300,100);
		Student s3=new Student("Mehmet",157,100);
		System.out.println("Online Dersler :"+Student.HowStudent());
		s1.exit();
		System.out.println("Online Dersler :"+Student.HowStudent());
		
		int[] notlar=new int[3];
		notlar[0]=s1.point;
		notlar[1]=s2.point;
		notlar[2]=s3.point;
		System.out.println(Student.calcOverall(notlar));
		

	}

}
