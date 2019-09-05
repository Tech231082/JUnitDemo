package ignoreTestDemo;

public class MessageUtil {
	 String message;
	public MessageUtil(String message) {
		this.message=message;
	}
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	public String SalutationMessage() {
		System.out.println("Hi"  +message);
		return message;
	}

}
