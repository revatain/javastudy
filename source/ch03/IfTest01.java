package ch03;
public class IfTest01 {
	public static void main(String[] args) {
		String myJob1 = "ȫ�浿";
		String myJob2 = "�̼���";
		String myJob3 = "�̼���";
		String myJob4 = "������";
		if(myJob1 == "ȫ�浿"){
			System.out.println("ȫ�浿�� ����");
		} else if(myJob2 == "�̼���"){
			System.out.println("�̼����� �屺");
		} else if(myJob3 == "�̼���"){
			System.out.println("�̼���� ��");
		} else{
			System.out.println("�������� å��");
		}
	}
} 
