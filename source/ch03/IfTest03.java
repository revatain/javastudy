package ch03;
public class IfTest03 {
	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		if ((x>y) || (x==9)){
			System.out.println("��");
		} else{
			System.out.println("����");
		}
		if ((x>y) && (x==9)){
			System.out.println("��");
		} else{
			System.out.println("����");
		}
	}
}
