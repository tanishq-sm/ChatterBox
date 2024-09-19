package ChattingInterface;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import static java.lang.System.out;
import java.io.PrintStream;
import java.util.Scanner;

public class Chat
{
	static public void chat()throws Exception
	{
		out.println("Enter IP address to chat");
		Scanner sc = new Scanner(System.in);
		String IPAddress=sc.next();

		Socket socket= new Socket(IPAddress,2005);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		PrintStream ps = new PrintStream(socket.getOutputStream());
		while(true)
		{
			String data=br.readLine();
			if(data==null)
				break;
			ps.println(data);
		}
	}
}
