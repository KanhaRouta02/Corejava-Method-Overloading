package in.kanha.why;

class Add{
	public void add1(int i) {
		System.out.println(i+i);
	}	
	public void add2(int i,int j) {
		System.out.println(i+j);
	}
	public void add3(int i,int j, int k) {
		System.out.println(i+j+k);
	}	
}
public class Test {

	public static void main(String[] args) {

		Add a = new Add();
		a.add1(10);
		a.add2(10, 20);
		a.add3(0, 0, 0);
	}

}
