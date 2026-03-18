package bai2;

	import java.util.ArrayList;
	
	public class main {
	    public static void main(String[] args) {
	        ArrayList<Employee> employees = new ArrayList<>();

	        // Tạo nhân viên fulltime
	        FullTimeEmployee f1 = new FullTimeEmployee();
	        f1.setId("F01");
	        f1.setName("An");
	        f1.setBasicSalary(5000);
	        f1.setBonus(2000);
	        f1.setPenalty(500);

	        FullTimeEmployee f2 = new FullTimeEmployee();
	        f2.setId("F02");
	        f2.setName("Binh");
	        f2.setBasicSalary(6000);
	        f2.setBonus(1500);
	        f2.setPenalty(300);

	        // Tạo nhân viên parttime
	        PartTimeEmployee p1 = new PartTimeEmployee();
	        p1.setId("P01");
	        p1.setName("Chi");
	        p1.setBasicSalary(0); // không dùng basicSalary
	        p1.setWorkingHours(120);
	        p1.setHourlyRate(50);

	        PartTimeEmployee p2 = new PartTimeEmployee();
	        p2.setId("P02");
	        p2.setName("Dung");
	        p2.setBasicSalary(0);
	        p2.setWorkingHours(100);
	        p2.setHourlyRate(60);

	        // Thêm một nhân viên thường
	        Employee e1 = new Employee();
	        e1.setId("E01");
	        e1.setName("Hoa");
	        e1.setBasicSalary(4000);

	        // Đưa vào danh sách
	        employees.add(f1);
	        employees.add(f2);
	        employees.add(p1);
	        employees.add(p2);
	        employees.add(e1);

	        // In danh sách nhân viên
	        System.out.println("Danh sách nhân viên:");
	        for (Employee e : employees) {
	            System.out.println(e);
	        }

	        // Tìm nhân viên có thu nhập cao nhất
	        Employee maxIncomeEmp = employees.get(0);
	        for (Employee e : employees) {
	            if (e.income() > maxIncomeEmp.income()) {
	                maxIncomeEmp = e;
	            }
	        }
	        System.out.println("\nNhân viên có thu nhập cao nhất: " + maxIncomeEmp);
	    }
	}


