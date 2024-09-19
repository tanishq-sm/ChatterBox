import LoginInterface.LoginInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import ChattingInterface.Chat;
import ChattingInterface.ServerSet;

public class Client
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Server Name");
        String serverName=sc.next();
        System.out.println("Enter Port No");
        int portNo=sc.nextInt();
        System.out.println("Enter Unique Id");
        String uniqueId=sc.next();
        System.out.println("Enter User Id");
        String userId=sc.next();
        System.out.println("Enter Password");
        String password=sc.next();
        Registry reg = LocateRegistry.getRegistry(serverName,portNo);
        LoginInterface li = (LoginInterface)reg.lookup(uniqueId);
        boolean result = li.check(userId,password);
        if(result)
        {
           ServerSet.server();
           Chat.chat();
        }
        else
        {
            System.exit(0);
        }
    }
    
}
