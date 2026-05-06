package encapsulation;

public class MainStudent 
{
	public static void main(String[] args) {
		Student s=new Student();
		s.setMarks(90);
		System.out.println(s.getMarks());
	}
}
