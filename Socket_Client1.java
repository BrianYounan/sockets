import java.io.*;
import java.net.*;

public class Socket_Client1 {
	
	public static void main(String[] args) throws Exception {
		
		Socket_Client1 client = new Socket_Client1();
		client.run();
		
	}

	
	public void run() throws Exception{
		
		Socket skt = new Socket("localhost", 420);
		PrintStream ps = new PrintStream(skt.getOutputStream());
		ps.println("Message from client to server");
		
		InputStreamReader isr = new InputStreamReader(skt.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		
		String receivedMessage = br.readLine();
		System.out.println(receivedMessage);
		
	}
}
