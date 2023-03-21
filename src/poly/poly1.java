package poly;


class poly{
	
	void show(String name){ //method overloading
		System.out.println("hi");
	}
	void show() {
		System.out.println("bye");
	}
}

public class poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        poly s=new poly();
        s.show();
       // s.show("gaju");

	}

}
