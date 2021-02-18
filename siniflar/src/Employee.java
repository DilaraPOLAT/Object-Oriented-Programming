
public class Employee {
	private String name;
	public double salary;
	private int workHours,hireYear;
	//degismemesi icin private olarak olusturdum
	Employee(int hireYear,int workHours,double salary,String name){
		this.name=name;
		this.hireYear=hireYear;
		this.salary=salary;
		this.workHours=workHours;
		
	}
	
	public double tax() {
		if(this.salary>=1000) {
			return salary*0.03;
		}
		return 0.0;
	}
	
	public double bonus() {
		int exstraHours=this.workHours- 40;
		if(exstraHours > 0) {
			return 30*exstraHours;	
		}
		return 0.0;
		
	}
	
	public double icrase() {
		int year=2020-this.hireYear;
		if(year<10) {
			return salary*0.5;
		}
		else if(year>=10 && year<20) {
			return salary*0.10;
		}
		else {
			return salary*0.15;
		}
	}
	public void toString(Employee emp) {
		System.out.println("Tax :"+ emp.tax());
		System.out.println("Bonus :"+ emp.bonus());
		System.out.println("Incrase salary :"+ emp.icrase());
		double totalsalary=emp.salary-emp.tax()+emp.bonus();
		System.out.println("Total salary with tax and bonus :"+ totalsalary);
		System.out.println("Total salary with the raise of salary :"+ (emp.salary+emp.icrase()));
	}

}








