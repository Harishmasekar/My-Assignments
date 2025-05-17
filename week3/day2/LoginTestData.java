package week3.day2;

public class LoginTestData extends TestData {

	
	public void enterUserName() {
		System.out.println("Kindly enter the user name-->sub class");
	}
	
	public void enterPassword() {
		System.out.println("Kindly enter your password-->subclass");
		
	}

		public static void main(String[] args) {
			
			LoginTestData testdata=new LoginTestData();
			testdata.enterCredentials();
			testdata.enterUserName();
			testdata.enterPassword();
			testdata.navigateToHomePage();
			
		}
	}
	