package prob7;

public class Prob7 {
	public static void main(String[] args) {
		Duck d = new Duck();
		d.setName( "꽥꽥이" );
		
		d.fly();
		d.sing();
		System.out.println( d.toString() );
		
		Sparrow s = new Sparrow();
		s.setName( "짹짹이" );
		s.fly();
		s.sing();
		System.out.println( s.toString() );
	}
}
