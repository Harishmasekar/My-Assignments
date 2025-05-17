package week3.day2;




public class JavaConnection implements DataBaseConnection {

	
	public void connect() {
		System.out.println("Connected to java");
	}

	
	public void disConnect() {
		System.out.println("Disconnected from java");
	}


	public void execute() {
		System.out.println("execute java");
	}

	public void getOutput() {
		System.out.println("get the output from console");
	}
	
	public static void main(String[] args) {
		JavaConnection java= new JavaConnection();
		java.connect();
		java.disConnect();
		java.execute();
		java.getOutput();
	}
}