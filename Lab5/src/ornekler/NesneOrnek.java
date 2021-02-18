package ornekler;

import java.util.Scanner;

public class NesneOrnek {

	public static void main(String[] args) {
		String marka,model;
		int ns,hafiza;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Nesne sayýsý giriniz:");
		ns=scan.nextInt();
		
		SmartPhone[] nesneler=new SmartPhone[ns];
		
		for (int i=0;i<ns;i++) {
			System.out.println(i+1+".telefonun markasýna giriniz: ");
			marka=scan.next();
			System.out.println(i+1+".telefonun modeline giriniz: ");
			model=scan.next();
			System.out.println(i+1+".telefonun hafizasina giriniz: ");
			hafiza=scan.nextInt();
			nesneler[i]=new SmartPhone(marka,model,hafiza);
			
			
		}
		for(int i=0;i<ns;i++) {
			nesneler[i].BilgileriYazdýr();
		}
		NesneleriDegistir(nesneler);
		
		for(int i=0;i<ns;i++) {
			nesneler[i].BilgileriYazdýr();
		}

	}
	private static void NesneleriDegistir(SmartPhone[] nesneler) {
		int indis1,indis2;
		indis1=(int)(Math.random()*(nesneler.length));
		indis2=(int)(Math.random()*(nesneler.length));
		while(indis1==indis2) {
			
			indis2=(int)(Math.random()*(nesneler.length));
		}
		System.out.println(indis1+".ile"+indis2+"indisleri degisecek.");
		SmartPhone gecici;
		
		gecici=nesneler[indis1];
		nesneler[indis1]=nesneler[indis2];
		nesneler[indis2]=gecici;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
