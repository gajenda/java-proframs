package poly;
class papa{
	void drink() {
		System.out.println("drinking tea");
		
	}
	
}
class son extends papa{ //method overriding
	void drink() {
		super.drink();
		System.out.println("water");
		
	}
}



public class poly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s=new son();
		s.drink();

	}

}
