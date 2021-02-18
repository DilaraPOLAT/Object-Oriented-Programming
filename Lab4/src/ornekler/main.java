package ornekler;

public class main {
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone("Samsung","S5","Gri",128,1.5);
//		sp.marka="Samsung";
//		sp.model="S20";
//		sp.renk="Gri";
//		sp.hafiza=128;
//		sp.hiz = 1.8;
//		
//		System.out.println("Telefonun markasý :"+sp.marka);
//		System.out.println("Telefonun modeli :"+sp.model);
//		System.out.println("Telefonun rengi :"+sp.renk);
//		System.out.println("Telefonun hafizasi :"+sp.hafiza);
//		System.out.println("Telefonun hýzý :"+sp.hiz);
		sp.SetMarka("Samsung");
		
		System.out.println("Telefonun markasý:"+sp.getMarka());
	 }

}
