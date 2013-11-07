
import java.io.*;
import java.net.*;


public class Socket_Server1 {
	
	public static void main(String[] args) throws Exception {
		
		Socket_Server1 server = new Socket_Server1();
		server.run();
	
		
	}
	
	
	public void run() throws Exception {
		
		
		ServerSocket srvskt = new ServerSocket(420);
		Socket skt = srvskt.accept();
		InputStreamReader isr = new InputStreamReader(skt.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		
		
		String receivedMessage = br.readLine();
		System.out.println(receivedMessage);
		
		if (receivedMessage != null){
			PrintStream ps = new PrintStream(skt.getOutputStream());
			ps.println("Message from client received");
			
		}
		
		
	}
	
}
