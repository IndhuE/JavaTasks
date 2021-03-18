package singleton;

public class Employee {
	static Employee e;
	private Employee() {

	}
	public static Employee getInstance() {
		if(e==null) {
		 e = new Employee();
		}
		System.out.println(System.identityHashCode(e));
		return e;
	}
	public void empId() {
		System.out.println("emp id is:3245");
	}
	public static void main(String[] args) {
		Employee e = getInstance();
		e.empId();
	}
}
