package constructor;

public class First {
	public First() {
		this("9876543210l");
	System.out.println("default constructor");
	}
	
	public First(int id) {
		this("Indhu");
		System.out.println("id"+id);
		}
	
	public First(String name) {
		System.out.println("name"+name);
		}
	
	public First(long phNo) {
		this("123");
		System.out.println("phno"+phNo);
		}
	
	private void sec() {
		System.out.println("sec");
	}
	
	public static void main(String[] args) {
		First f = new First();
		f.sec();
	}
}
