package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerEx02 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(20000);
			System.out.println("��������~~ Ŭ���̾�Ʈ ���� �����!!!"); 
			Socket s = ss.accept(); 
			System.out.println(s.getRemoteSocketAddress()+" Ŭ���̾�Ʈ�� ���ӵ�");
			DataInputStream din = new DataInputStream(s.getInputStream()); 
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());

			String strIn = "";
			String strOut = ""; 
			
			while(!strIn.equals("stop")){ 
				System.out.println("�޼��� ���Ŵ����..."); 
				strIn = din.readUTF(); 
				System.out.println("Ŭ���̾�Ʈ�κ��� ���� ���Ÿ޼���: "+strIn);
				strOut = "echo: "+strIn; 
				dout.writeUTF(strOut); 
				dout.flush(); 
			}  
			
			din.close();
			s.close();
			ss.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}