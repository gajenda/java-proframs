package inheritance;

class grandpa{
	void gold() {
		System.out.println("gold");
	}
}

class pa extends grandpa{
	 void property() {
		 System.out.println("father property");
	 }
	 
	 
 }

class son1  extends pa{
	 void bike() {
		 System.out.println("this is son's bike");
	 }
	 
 }

public class multi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son1 s1=new son1();//created object for son1
	     s1.gold();	
	     s1.property();
	     pa p=new pa();//created object for pa
	     p.gold();
	     
	     

	}

}
