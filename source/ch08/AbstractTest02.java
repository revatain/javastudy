 package ch08;

 abstract class Animal { 
 
	 abstract void speak(); 
	
	 void listen() { 
		System.out.println("���"); 
	 }
 }
 
 public class AbstractTest02 extends Animal{

 	@Override
 	void speak() {
 		System.out.println("���ϴ�");
	}

	public static void main(String[] args) {
		AbstractTest02 abs = new AbstractTest02(); 
		abs.speak(); 
		abs.listen(); 
	}
}