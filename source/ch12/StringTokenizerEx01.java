package ch12;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
	public static void main(String[] args) {
		String s1 = "�ڹ� JSP Android Spring";
		StringTokenizer st1 = new StringTokenizer(s1);
		int n1 = st1.countTokens();
		System.out.println("���ҵ� ���ڿ� ���� : " + n1);
		while(st1.hasMoreTokens()){
			System.out.println(st1.nextToken());
		}
		System.out.println("--------------------");
		String s2 = "����,��õ;����;�λ�;����,�뱸";
		StringTokenizer st2 = new StringTokenizer(s2,",;");
		int n2 = st2.countTokens();
		String arr[] = new String[n2];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = st2.nextToken();
			System.out.println(arr[i]);
		}	
	}
}