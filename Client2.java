import java.io.*;
import java.net.*;

class Client2{
public static void main(String[] args) throws Exception{
  Socket s = new Socket("localhost",2222);

  DataOutputStream dos = new DataOutputStream(s.getOutputStream());

  InputStream obj = s.getInputStream();
  BufferedReader br = new BufferedReader(new InputStreamReader(obj));

  BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

  String str,str1;
  while(!(str = kb.readLine()).equals("exit"))
  {
    dos.writeBytes(str+"\n");
    str1 = br.readLine();
    System.out.println(str1);
  }
  dos.close();
  br.close();
  kb.close();
  s.close();
  /*
  while((str = br.readLine()) != null)
  {
    System.out.println("From Server: "+ str);
  }
  br.close();
  s.close();
  */
}
}
