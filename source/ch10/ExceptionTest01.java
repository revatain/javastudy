package ch10;

public class ExceptionTest01 {

	public static void main(String[] args) {
		int a = 22;
		int b = 0;
		try {
			System.out.println("a+b = " + (a+b));
			System.out.println("a-b = " + (a-b));
			System.out.println("a*b = " + (a*b));
			System.out.println("a/b" + (a/b));
			System.out.println("����� �������ϴ�.");
		} catch (Exception e) {
			System.err.println("0���� ������ �ȵǿ�.");
			System.err.println("���� �޼���: "+e.getMessage());
		}
	}
}