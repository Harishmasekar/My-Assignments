package week1.day2;

public class LibraryManagement {
	
	public static void main(String[] args) {
		Library bks = new Library();
		String bookNames=bks.addBook("Kubernetes");
		System.out.println(bookNames);
		bks.issueBook();

	}

}
