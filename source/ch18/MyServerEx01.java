package ch18;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerEx01 {

	public static void main(String[] args) {
		try{  
			ServerSocket ss = new ServerSocket(15000); 
			System.out.println("��������~~ Ŭ���̾�Ʈ ���� �����!!!"); 
			Socket s = ss.accept(); 
			System.out.println(s.getRemoteSocketAddress()+" Ŭ���̾�Ʈ�� ���ӵ�");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println("�޼��� ���Ŵ����..."); 
			String  str = dis.readUTF();
			System.out.println("�޼���= "+str);  
			ss.close(); 
		}catch(Exception e){
			System.out.println(e);
		}  
	}    
}