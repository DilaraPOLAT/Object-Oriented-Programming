package lab;
/*� �rnek 1; Yar��ap� verilen dairenin alan�n� ve �evresini hesaplayan Java
kodunu yaz�n�z.*/

public class daire {
	static public void main(String[] args)
	{
		double yaricap=3,alan,cevre;
		double pi=3.14;
		
		alan=(pi*yaricap*yaricap);
		cevre=(2*pi*yaricap);
		
		System.out.println("yaricap:"+yaricap+" olan dairenin alan�:"+alan+" cevresi:"+cevre);
	}
	

}
