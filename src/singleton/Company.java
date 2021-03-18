package singleton;

public class Company {
	public static void main(String[] args) {
		Employee e = Employee.getInstance();
		System.out.println(e);
		e.empId();
	}
}
