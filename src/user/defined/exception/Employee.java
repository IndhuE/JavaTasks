package user.defined.exception;
// RETURN
public class Employee {
	private int add() {
		int a =10,b=20,c;
		c=a+b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		int avg=e.add()/2;
		System.out.println(avg);
	}
}
