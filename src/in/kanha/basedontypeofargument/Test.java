package in.kanha.basedontypeofargument;

class Demo{
	
	public void m1(int a) {
		System.out.println("Integer...");
	}
	public void m1(String s) {
		System.out.println("String");
	}
	public void m1(char ch) {
		System.out.println("Character");
	}
	public void m1(double d) {
		System.out.println("Double");
	}
}
public class Test {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1(12.00);
		d.m1("kanha");
		d.m1(2);
	}
}
