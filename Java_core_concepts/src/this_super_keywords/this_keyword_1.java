package this_super_keywords;

public class this_keyword_1 
{
	int x=10;
	int y=20;
	

	public this_keyword_1() {
		System.out.println(this.x=x);
		System.out.println(this.y=y);
	}
	public static void main(String[] args) {
		new this_keyword_1();
	}
}
