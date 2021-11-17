package e_client_drill;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			//Socket sock = new Socket("127.0.0.1", 7777);
			//Socket sock = new Socket("192.168.0.19", 7777);
			Socket sock = new Socket("192.168.0.8", 7777);
			Sender snd = new Sender(sock);
			Receiver rcv = new Receiver(sock);
			snd.start();
			rcv.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Sender extends Thread{
	private Socket sock;
	private DataOutputStream dos;
	
	Sender(Socket sock){
		this.sock = sock;
		try {
			dos = new DataOutputStream(sock.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void run() {
		while(dos != null) {
			try {
				Scanner sc = new Scanner(System.in);
				dos.writeUTF(sc.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class Receiver extends Thread{
	private Socket sock;
	private DataInputStream dis;
	
	Receiver(Socket sock){
		this.sock = sock;
		try {
			dis = new DataInputStream(sock.getInputStream());	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void run() {
		while(dis != null) {
			try {
				System.out.println(dis.readUTF());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
