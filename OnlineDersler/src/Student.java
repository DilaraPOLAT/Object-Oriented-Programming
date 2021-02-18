
public class Student {
	public String name;
	public int id,point;
	private static int counter=0;
	//her zaman ulasýrým
	
	Student(String name,int id,int point){//Constructor(yapýcýlar)
		this.name=name;
		this.id=id;
		this.point=point;
		Student.counter++;
		//neden id ve name yazmayýz cunku onlar static degil
	}
	
	public void exit() {
		Student.counter--;
	}
	
	public static int HowStudent() {//hic bir nesne uretmeden buraya ulasabilirim.
		return Student.counter;
	}
	
	public static double calcOverall(int[] arr) {
		double overall=0;
		for(int i=0;i<arr.length;i++) {
			
			overall+=arr[i];
		}
		
		return overall / arr.length;
	}
	
	

}
