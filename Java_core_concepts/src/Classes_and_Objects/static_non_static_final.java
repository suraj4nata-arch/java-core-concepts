package Classes_and_Objects;

public class static_non_static_final 
{
	final int x=10;
	final static int y=20;
	
	public static void main(String[] args) {
		static_non_static_final s =new static_non_static_final();
		//s.x=20; variable is final, hence cannot reassign the value
	}
}


