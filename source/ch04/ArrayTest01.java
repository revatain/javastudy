package ch04;

public class ArrayTest01 {

	public static void main(String[] args) {
		int a, b;
		a = 10;
		b = 20;
		ArrayTest01 arr = new ArrayTest01();
		arr.use(a, b);
		System.out.println("����a : " +a);
		System.out.println("����b : " +b);
	}
	
	void use(int a, int b){
		a = a+5;
		b = b+5;
		System.out.println("�޼ҵ�a : " + a);
		System.out.println("�޼ҵ�b : " + b);
	}
}