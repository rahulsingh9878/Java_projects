//Server Side
//Note - both Server and Client should be on same network..
import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.*;

public class  Server 
{
	public static void main(String[] args) 
	{
		try
		{
			ServerSocket ss = new ServerSocket(1989);
			Socket s=ss.accept();
			//DataInputStream dis=new DataInputStream(s.getInputStream());
			RxThread rt = new RxThread(s.getInputStream());
			rt.start();
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			while (true)
			{
				
				dos.writeUTF("You sent: " + new Scanner(System.in).nextLine());
			}
		}
		catch(Exception e) {}
	}

}

class RxThread extends Thread
{
	DataInputStream dis;
	RxThread(InputStream o)
	{
		dis = new DataInputStream(o);
	}
	public void run(){
        
			      try{    
			while (true){
				System.out.println("Received Message:" + dis.readUTF());
				
			}
  }
                
          catch(Exception e){System.out.println(e);}
		}
         }

