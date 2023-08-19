import java.net.*;
import java.io.*;

public class TCPS{
public static void main(String[] args) throws Exception{
    

    ServerSocket ServSock = new ServerSocket(4000);
    System.out.println("Server setup on port 4000!");

    Socket sock = ServSock.accept();
    System.out.println("Connection Successful! \nWaiting for further Communication...");

    InputStream istream = sock.getInputStream();
    BufferedReader fileRead= new BufferedReader(new InputStreamReader(istream));

    String fname = fileRead.readLine();

    BufferedReader ContentRead = new BufferedReader(new FileReader(fname));
    OutputStream ostream = sock.getOutputStream();

    PrintWriter pwrite = new PrintWriter(ostream, true);
    String str;

    while((str=ContentRead.readLine())!=null){
        pwrite.println(str);    
    }
    sock.close();
    ServSock.close();
    ContentRead.close();
    pwrite.close(); 
    fileRead.close(); 
}
}