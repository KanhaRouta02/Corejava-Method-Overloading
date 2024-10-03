package in.kanha.basedonlength;

class Adition{
	
	public void add(int i) {
		System.out.println(i+i);
	}
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
	public void add(int... args) {
		int sum = 0;
		for(int i=0;i<args.length;i++) {
			sum += args[i];
		}
		System.out.println(sum);
	}
}
public class Test {

	public static void main(String[] args) {

		Adition a = new Adition();
		a.add(10);
		a.add(12,3);
		a.add(12,3,10);
		a.add(10,15,20,30);
	}

}
