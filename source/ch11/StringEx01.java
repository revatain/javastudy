package ch11;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("Java �ڹ�");
		String s2 = new String("Java �ڹ�");
		String s3 = "Java �ڹ�";
		String s4 = "Java �ڹ�";
		
		if(s1==s2)
			System.out.println("s1==s2 : true");
		if(s2==s3)
			System.out.println("s2==s3 : true");
		if(s3==s4)
			System.out.println("s3==s4 : true");
		if(s1.equals(s2))
			System.out.println("s1.equal(s2) : true");
		if(s2.equals(s3))
			System.out.println("s2.equal(s3) : true");
		if(s3.equals(s4))
			System.out.println("s3.equal(s4) : true");

		String s5 = "apple";
		String s6 = "APPLE";
		System.out.println("Apple�� apple ��ҹ��� �������� �ʰ� �� : "
		                               + s5.equalsIgnoreCase(s6));
	}
}