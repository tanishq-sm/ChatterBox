
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CheckLogin extends UnicastRemoteObject implements LoginInterface.LoginInterface
{
      public CheckLogin()throws RemoteException{}
      @Override
      public boolean check(String id,String pass)throws RemoteException
      {
          if(id.equals("rishi")&&pass.equals("aayu"))
              return true;
          else 
              return false;
      }
}
