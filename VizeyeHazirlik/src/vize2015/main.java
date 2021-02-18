package vize2015;

public class main {

	public static void main(String[] args) {
		int c=0;
		int[] mnr= {1,9,0,1,0,0,1,1,0,6,4};
		int[] ar=ma(mnr,c);
		System.out.println(c);
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]);
		

	}
	private static int[] ma(final int[] a,int c) {
		int [] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			c+=b[i];
		}
		for(int i=0;i<a.length-1;i++) {
			if(b[i]>b[i+1]) {
				int temp=b[i];
				b[i]=b[i+1];
				b[i+1]=temp;
			}
		}
		return b;
		
	}
	

}
