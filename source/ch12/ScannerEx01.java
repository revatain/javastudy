package ch12;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���. : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ���. : ");
		int age = sc.nextInt();
		System.out.print("������ ������ true ������ false�� �Է��ϼ���. : ");
		boolean lover  = sc.nextBoolean();
		System.out.println(name + " : " + age + " : " + (lover ? "��������":"���ξ���"));
		sc.close();
	}
}