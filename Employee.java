
public class Employee {
	String name;
	Float salary;
	int workHours;
	int hireYear;
	
	//Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
	public Employee(String name,float salary,int workHours,int hireYear) {
		this.salary = salary;
		this.name=name;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	//tax() : Sadece Maaşa uygulanan vergiyi hesaplayacaktır.
	public float tax() {
		float tax = 0;
	
		//Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
		if(this.salary <1000) {
			return tax;
			
		//Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.	
		}else {
			tax = (float)(salary * 0.03);
			return tax;
		}
		
		
	}
	//bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
	public float bonus() {
		float bonus = 0;
		if(this.workHours <40) {
			return bonus;
		}else {
			bonus = (float)(30 * (workHours - 40 ));
			return bonus;
		}
	
		
	}
	
	//raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. 
	public float raiseSalary() {
		float extra = 0;
		//Şuan ki yılı 2021 olarak alındı.
		int yilFarki = 2021 - this.hireYear;
			
		//Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
		if(yilFarki<10) {
				return extra = (float)(this.salary * 0.05);
				
		//Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
		}else if(yilFarki>9 && yilFarki <20) {
				return extra = (float)(this.salary * 0.1);
				
		//Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
		}else if(yilFarki>19) {
				return extra = (float)(this.salary * 0.15);
				
		}else {
				return extra;
			}
		}
	
		
	//toString() : Çalışana ait bilgileri ekrana bastıracaktır.
	public String toString() {
		
		////Toplam maaş: çalışanın kendi maaşı +artış+ bonus
		float vergilerVeBonustoplam = this.salary + bonus() - tax();
		//Vergi ve bonuslarla birlikte maaş için: vergi, bonus ve çalışanın kendi maaşı ile bulunacak.
		float maasToplam = this.salary + bonus() - tax() + raiseSalary();
		String text = "\n Adı : "+ this.name+"\n Maaşı : "+this.salary+"\n Çalışma Saati : "+this.workHours+"\n Başlangıç Yılı : "+this.hireYear+"\n Vergi : "+ tax()+"\n Bonus : "+ bonus()+"\n Maaş Artışı : "+ raiseSalary() +"\n Vergi ve Bonuslar ile birlikte maaş : "+ vergilerVeBonustoplam +"\n Toplam Maaş : "+ maasToplam;
		
		return text;		
	}
	

}
