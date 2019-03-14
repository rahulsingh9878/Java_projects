import java.util.*;
import java.lang.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;  
	
public class halfcopy{
	public static void main(String []args)
	{
		try{    
            FileInputStream fin=new FileInputStream("E:\\java\\Threading\\****"); // Enter Source Path
            File file = new File("E:\\java\\Threading\\******");     // Enter Source Path
            FileOutputStream fos= new FileOutputStream("G:\\*****");  // Enter Target  Path
            
            int i;
            long  a = file.length();
            
            while((i=fin.read()) != (-1)){ 
                fos.write(i);
                File file1 = new File("G:\\******");   // Enter Target  Path
                long b = file1.length();
                if(b==(a/2)){
               	break;
                }
  }
            fin.close();    
          }catch(Exception e){System.out.println(e);}
			}
		}
	