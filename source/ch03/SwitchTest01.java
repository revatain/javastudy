package ch03;

public class SwitchTest01 {
	public static void main(String[] args) {
		String myDream = "DBA";
		switch (myDream) {
		case "Programer":
			System.out.println("���� ���� �ƴմϴ�.");
			break;
		case "Doctor":
			System.out.println("���� ���� �ƴմϴ�.");
			break;
		case "DBA":
			System.out.println("���� DATABASE �������� �ǰ� �ͽ��ϴ�.");
			break;
		default:
			System.out.println("���� ���� �����ϴ�.");
			break;
		}
	}
}
