package ch10;

import java.util.Scanner;

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			int a, b;
			s = new Scanner(System.in);
			System.out.println("�Է� ���� �μ��� ������");
			System.out.print("ù��°���� : ");
			a = s.nextInt();
			System.out.print("�ι�°���� : ");
			b = s.nextInt();
			System.out.println(a + "/"+b+"="+(a/b));
		} catch (ArithmeticException e) {
			System.err.println("��꿹��");
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("�������˿���");
		} finally {
			s.close();
		}
	}
}