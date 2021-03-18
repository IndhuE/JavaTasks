package user.defined.exception;

public class EmployeeNotFoundException extends Exception{
	@Override
	public String getMessage() {
		String msg="Employee not found in unit";
		return msg;
	}

}
