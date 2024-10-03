package in.kanha.passing_classname_as_argument;

class Apache{
	int engno = 101;
	String engType = "petrol";
	int cc = 180;
}
class Pulsure{
	int engno = 102;
	String engType = "desel";
	int cc = 120;
}
public class Garage {
	public void wash(Apache a) {
		System.out.println("Apache bike washing...");
		System.out.println(a.engno);
		System.out.println(a.engType);
		System.out.println(a.cc);
	}
	public void wash(Pulsure p) {
		System.out.println("Pulsure bike washing...");
		System.out.println(p.engno);
		System.out.println(p.engType);
		System.out.println(p.cc);
	}
	public static void main(String[] args) {

		Garage g = new Garage();
		g.wash(new Pulsure());
	}
	

}
