package ch09;

class Outer02{
	
	String arr[] = {"ù��°", "�ι�°", "����°"};
	
	public Outer02() {
		for (int i = 0; i < arr.length; i++) {
			Inner02 inner = new Inner02(arr[i]);
			inner.prn();
		}
	}
	
	class Inner02{
		
		String str;
		
		Inner02(String str){
			this.str = str;
		}
		
		public void prn(){
			System.out.println(str);
		}
	}
}

public class InnerTest02 {
	public static void main(String[] args) {
		new Outer02();
	}
}