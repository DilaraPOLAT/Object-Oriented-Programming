
public class HesapMakinesi {
	public int sayi1;
    public int sayi2;
    public String renk;
    final static double PI=3.14;//sabit her yerde degisemez.static yazarsak her yerde kullanırım nesne olusturmadan
    
    //constructor(yapıcılar)
    //biz bunu yazmasak bile java arka planda bunu bu şekilde okuyor.
    /*HesapMakinesi(){
    default olarak java ayarlar
    }*/
    
    HesapMakinesi(int sayi1,int sayi2,String renk){
    	this.sayi1=sayi1;
    	this.sayi2=sayi2;
    	this.renk=renk;
    	//this.PI=45; yazamam cunku final yani degisemez.
    }
    public int toplama() {
    	return this.sayi1+this.sayi2;
    }
    
    public int cikarma() {
    	return this.sayi1-this.sayi2;

    }
    public int carpma() {
    	return this.sayi1*this.sayi2;
  
    }
    public int bolme() {
    	return this.sayi1/this.sayi2;
    }
    public double area(int r) {
    	return HesapMakinesi.PI*(Math.pow(r, 2));//math da static tanımlı her yerde ulasabiliyorum
    }
    
    
    
    
    
    
}
