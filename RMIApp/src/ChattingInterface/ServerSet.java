package ChattingInterface;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import static java.lang.System.out;

public class ServerSet
{
	static public void server() throws Exception
	{
		ServerSocket ss= new ServerSocket(2005);
		out.println("Server is ready");
		
		Socket socket = ss.accept();
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		while(true)
		{
			String data=br.readLine();
			if(data.length()==0)
				break;
			out.println(data);
		}
	}
}
