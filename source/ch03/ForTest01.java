package ch03;
public class ForTest01 {
	public static void main(String[] args) {
		for(int i=1; i<10; i+=10){
			System.out.println(i);   //println�� �������� �ϸ鼭 ����ϴ� ��
		}
		int j;
		for(j=1; j<10; j++){
			System.out.print(j+" "); //print�� �������� ���� ����ϴ� ��
		}
		System.out.println(); //�������⸦ ���ؼ�
		System.out.println("for���� ���� �� j�� �� : "+j);
		for(int i=1; i<10; ++i){
			System.out.print(i+" ");
		}
	}
}