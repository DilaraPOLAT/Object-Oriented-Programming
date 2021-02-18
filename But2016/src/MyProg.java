
public class MyProg {
	public static void main(String[] args) {
		o o1=new o();
		u u1=new u();
		o ou=u1;
		String s=",";
		System.out.println("i: "+o1.i+s+u1.i+s+ou.i);
		u1.setI(1);
		System.out.println("i: "+o1.i+s+u1.i+s+ou.i);
		o1.i=2;
		System.out.println("i: "+o1.i+s+u1.i+s+ou.i);
		ou.i=3;
		System.out.println("i: "+o1.i+s+u1.i+s+ou.i);
		((o)u1).i=4;
		System.out.println("i: "+o1.i+s+u1.i+s+ou.i);
		((u)ou).i=5;
		System.out.println("i: "+o1.i+s+u1.i+s+ou.i);
	}

}
