package ch03;

public class BreakTest01 {
	public static void main(String args[]){
		int n = 7;
		//while���� ����Ͽ� 7���� ���� ���� ����϶�
		int i=1;
		while(true){
			if(i==7) break;
			System.out.println(i);
			i++;
		}
	}
}