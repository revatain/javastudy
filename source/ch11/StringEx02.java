package ch11;

public class StringEx02 {
	public static void main(String[] args) {
		String s1 =  "Java Programming";
		int len = s1.length();
		System.out.println("���ڿ� ���� : " + len);
		System.out.println("�빮�� : " + s1.toUpperCase());
		System.out.println("�ҹ��� : " + s1.toLowerCase());
		String s2 = s1.substring(5);
		System.out.println("5��° �ڸ� ������ ���ڿ� : " + s2);
		char c1 = s1.charAt(8);
		System.out.println("8��° �ڸ��� ���� : " + c1);
		int idx1 = s1.indexOf('a');
		System.out.println("a������ ù��° �ڸ��� : " + idx1);
		int idx2 = s1.lastIndexOf('a');
		System.out.println("a������ ��������° �ڸ��� : " + idx2);
		String s3 = s1.replace('a', 'q');
		System.out.println("a�� q�� ��ȯ�� ���ڿ� : " + s3);
		String s4 = "Java&JSP&Android&Spring";
		String s5[] = s4.split("&");
		for (int i = 0; i < s5.length; i++) {
			System.out.println("s5["+i+"] : " +s5[i]);
		}
		String s6 = "   JSPStudy   ";
		System.out.println("***"+s6.trim()+"***");
		int idx3 = 22;
		int idx4 = 23; 
		String s7 = String.valueOf(idx3) + String.valueOf(idx4);
		System.out.println("������ ���ڿ��� ��ȯ�Ͽ� ������ �� : " + s7);
	}
}