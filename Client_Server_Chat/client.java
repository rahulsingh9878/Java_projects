//Client Side
//Note - both Server and Client should be on same network..
import java.io.*;
import java.net.*;
import java.util.*;
class RxThread extends Thread
{
	DataInputStream dis;
	RxThread(Object o)
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
class client
{
    public static void main(String arg[])
    {   
        try
        {
            Socket s=new Socket("192.168.43.238",1989);     //enter your server ip address 
            RxThread rt = new RxThread(s.getInputStream());
			rt.start();
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            
            while (true)
            {
                dos.writeUTF("You sent: " + new Scanner(System.in).nextLine());
               
            }
        }
        catch(Exception e){}
    }
}
