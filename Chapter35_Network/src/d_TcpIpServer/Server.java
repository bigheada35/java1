package d_TcpIpServer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
			name = "Server"+"["+ socket.getInetAddress() + ":" + socket.getPort() + "]";
					
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(out != null) {
			try {
				out.writeUTF(name + scanner.nextLine());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}


public class Server {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {

			serverSocket = new ServerSocket(7777);
			System.out.println("기달리는중");
			socket = serverSocket.accept();//기다리는 소스
			System.out.println("하나붙음");
			Sender sender  = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch (Exception e) {
			
		}
		
	}
		

}

