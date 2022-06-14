
public class ByMethod {
	int rollno;
	string name;
	void insertRecord(int r, String n) {
		rollno=r;
		name=n;
	}
	public static void main(String[] args) {
		Bymethod s1 = new Bymethod();
		Bymethod s2 = new Bymethod();
		s1.insertRecord(111,"Karan");
		s2.insertRecord(222,"Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}

}
