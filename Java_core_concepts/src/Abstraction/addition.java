package Abstraction;

public class addition extends constructor_in_abstract
{

	public addition(int x, int y) {
		super(x, y);
	}

	@Override
	void add() {
		System.out.println(x+y);
		
	}

}
