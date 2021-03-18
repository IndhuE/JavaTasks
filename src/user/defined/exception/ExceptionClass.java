package user.defined.exception;


public class ExceptionClass {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(4);
			try {
				String s=null;
				System.out.println(s.charAt(3));
			}
			catch(ArithmeticException e) {
				System.out.println("Nulll value");
			}
			
			finally {
				System.out.println("done");
			}
		}
		catch(NullPointerException e) {
			System.out.println("don't divide by zero");
		}
		catch(Exception e) {
			System.out.println("Null value");
		}
				
		finally {
			System.out.println("success");
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
	}
}
