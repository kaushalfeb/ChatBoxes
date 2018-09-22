import java.net.*;
import java.io.*;

class Server1
{
public static void main(String[] args) throws Exception{
  ServerSocket ss = new ServerSocket(2222);
  Socket s = ss.accept();
  System.out.println("Connection Established");
  OutputStream os = s.getOutputStream();
  PrintStream ps = new PrintStream(os);

  BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
  BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

  while(true)
  {
    String str,str1;

    while((str = br.readLine()) != null)
    {
          System.out.println(str);
          str1 = kb.readLine();
          ps.println(str1);
    }
    ps.close();
    ss.close();
    s.close();
    br.close();
    kb.close();
    System.exit(0);
  }
/*
  String str = "Hello Client";
  ps.println(str);
  ps.println("Bye");

  ps.close();
  ss.close();
  s.close();
*/
}
}
