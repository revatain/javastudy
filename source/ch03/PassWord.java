package ch03;
public class PassWord {
	public static void main(String[] args) {
		int pw = 86215334;
		for (int i = 0; i<100000000; i++){
			if (i == pw){
				System.out.println("����� �������� ��й�ȣ�� "+i+"�Դϴ�.");
			}
		}
	}
	void ss(){
		System.out.println("����");
	}
}