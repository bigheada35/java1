package t59_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test59_Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("대기중");
			Socket soc = ss.accept();
			System.out.println("접속받음");
			
			Sender snd = new Sender(soc);
			Receiver rcv = new Receiver(soc);
			snd.start();
			rcv.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

class Sender extends Thread{
	private Socket soc;
	Sender(Socket soc){
		this.soc = soc;
	}
	public void run() {
		try {
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			while(dos!=null) {
				Scanner sc = new Scanner(System.in);
				dos.writeUTF(sc.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

class Receiver extends Thread{
	private Socket soc;
	Receiver(Socket soc){
		this.soc = soc;
	}
	public void run() {
		try {
			DataInputStream dis = new DataInputStream(soc.getInputStream());
		
			while(dis!=null) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}