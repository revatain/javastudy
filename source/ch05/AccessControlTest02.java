package ch05;

public class AccessControlTest02 {
	
	public static void main(String[] args) {
		PrivateTest02 pv = new PrivateTest02();
		String id = pv.getId("����ȣ");
		System.out.println("���̵�� "+ id);
	}
}

class PrivateTest02 {

	String id;
	String key;

	private void myIdPw(){
		String pw;
		this.id = "ssarmango";
		pw = "1234";
		if(key == "����ȣ") {
			System.out.println("��й�ȣ�� "+pw);
		}
	}

	 public String getId(String key){
		this.key = key;
		myIdPw();
		return id;
	}
}