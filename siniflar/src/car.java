
public class car {
	private int enginePower,model;
	//private sadece bu class a ait di�er s�n�flar ula�amaz.
	public int speed;
	//biz basa public yazmasak bile java default olarak di�er classlarda kullanmam�z� sagliyor.fakat bazen error verbilir.
	//public her yerde eri�ilebilir
	protected String colour;
	//bu package dekiler ve classlar erisebilir.
	car(){//constructor
		this.model=2020;
		this.enginePower=300;
		this.colour="red";
		this.speed=120;
	}
	private void print(){//metot
		System.out.println(model);
		
	}
	public void run() {
		print();
	}

}
;