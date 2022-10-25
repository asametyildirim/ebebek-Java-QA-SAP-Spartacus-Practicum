
public class main {

	public static void main(String[] args) {
	
	String name = "Samet Yıldırım";
	float salary = 24000;
	int workHours = 45;
	int hireYear = 2;
	
	Employee employee = new Employee(name,salary,workHours,hireYear);
	System.out.println(employee.toString());
		
		
		
/*
 Adı : Samet Yıldırım
 Maaşı : 24000.0
 Çalışma Saati : 45
 Başlangıç Yılı : 2
 Vergi : 720.0
 Bonus : 150.0
 Maaş Artışı : 3600.0
 Vergi ve Bonuslar ile birlikte maaş : 23430.0
 Toplam Maaş : 27030.0
*/

		
	}

}
