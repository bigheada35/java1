package e_server_drill;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("대기중");
			Socket sock = ss.accept();
			System.out.println("접속옴");
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
			// TODO: handle exception
		}
	}
	public void run() {
		while(dos!=null) {
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