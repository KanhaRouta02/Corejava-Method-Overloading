package in.kanha.basedonorderofaccurance;

class Demo{
	public void m1(int i, String s) {
		System.out.println("integer then string");
	}
	public void m1( String s, int i) {
		System.out.println("string then integer");
	}	
	public void m1(int i, String s, double d) {
		System.out.println("integer then string then double");
	}
}
public class Test {

	public static void main(String[] args) {

		Demo d = new Demo();
		d.m1(12, "ka");
		d.m1("knh", 12);
		d.m1(12, "kdn",12.00);
	}

}
