package inheritance;

class grandmom{

	void gold() {
	System.out.println("grand mother property"); 
 }
}
class papa extends grandmom{ //hierarchy inheritance 
	void car() {
		System.out.println("father having red car");
	}
	
}
class uncle extends grandmom {  //hierarchy inheritance 
	void car1() {					
		System.out.println("uncle have a blue car");
	}
	
}
public class hirch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		papa p2=new papa();
		p2.gold();
		uncle u1=new uncle();
		u1.gold();
		
	}

}
