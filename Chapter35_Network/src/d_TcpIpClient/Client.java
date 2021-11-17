package d_TcpIpClient;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Receiver extends Thread{
	
	Socket socket;
	DataInputStream in;
	
	Receiver(Socket socket){
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void run() {
		while(in != null) {
			try {
				System.out.println(in.readUTF());
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}

class Sender extends Thread{
	
	Socket socket;
	DataOutputStream out;
	String name;
	
	Sender(Socket socket){
		
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "Client" + "["+ socket.getInetAddress() + ":" + socket.getPort() + "]";
					
		} catch (Exception e) {
			
		}
		
	}
	
	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		
		while(out != null) {
			try {
				out.writeUTF(name + scanner.nextLine());
			} catch (Exception e) {
				
			}
		}
	}
	
}


public class Client {

	public static void main(String[] args) {
		

			String serverIp = "127.0.0.1";
			Socket socket = null;
		
		try {

			socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			
			Sender sender  = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		}catch(ConnectException ce) {
			ce.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		

}

