package ch10;

public class ExceptionTest06 {
	
	int a = 100;

	public void tMethod(int b) throws Exception{
		if(b==0) {
			throw new Exception("a�� 0���� ������ �ȵǿ�.");
		} else {
			System.out.println(a+"/"+ b +" = " + (a/b));
		}
	}

	public static void main(String[] args) {
		ExceptionTest06 et = new ExceptionTest06();
		try {
			et.tMethod(10);
			et.tMethod(0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}