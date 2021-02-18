package lab;
/*• Örnek 1; Yarýçapý verilen dairenin alanýný ve çevresini hesaplayan Java
kodunu yazýnýz.*/

public class daire {
	static public void main(String[] args)
	{
		double yaricap=3,alan,cevre;
		double pi=3.14;
		
		alan=(pi*yaricap*yaricap);
		cevre=(2*pi*yaricap);
		
		System.out.println("yaricap:"+yaricap+" olan dairenin alaný:"+alan+" cevresi:"+cevre);
	}
	

}
