package Java_bean_class;

public class MainStudent
{
	public static void main(String[] args) {
		Student s=new Student("John", 1, 99.3);
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getMarks());
		
		s.setName("Jack");
		s.setId(2);
		s.setMarks(44.2);
		
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getMarks());
	}
}
