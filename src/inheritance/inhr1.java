package inheritance;
  class father{
	 static String name= "marks";
	void property() {
		System.out.println("Father having property");
	}
	father(){
		System.out.println("this is father con!");
	}
}
class son extends father{
	son(){
		System.out.println("thhis is child");
	}
	void car() {
		super.property();
		System.out.println("son's property  "+name);
		
	}
}

public class inhr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        son s=new son();	
        s.car();
        s.property();
        //s.marks=90;
        
        
	}

}
