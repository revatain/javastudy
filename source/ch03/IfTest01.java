package ch03;
public class IfTest01 {
	public static void main(String[] args) {
		String myJob1 = "홍길동";
		String myJob2 = "이순신";
		String myJob3 = "이성계";
		String myJob4 = "정도전";
		if(myJob1 == "홍길동"){
			System.out.println("홍길동은 의적");
		} else if(myJob2 == "이순신"){
			System.out.println("이순신은 장군");
		} else if(myJob3 == "이성계"){
			System.out.println("이성계는 왕");
		} else{
			System.out.println("정도전은 책사");
		}
	}
} 
