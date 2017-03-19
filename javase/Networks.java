import java.net.*;
import java.io.*;
public class Networks{
    public static void main(String []args)throws IOException{
        String serverName = "www.google.com";
        Socket sock = new Socket(serverName,80);
        String ip = InetAddress.getByName(serverName).getHostAddress();
        System.out.println(ip);

        URL url = new URL("http://www.toutiao.com");
        URLConnection url_connection = url.openConnection();
        //BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
        BufferedReader br = new BufferedReader(new InputStreamReader(url_connection.getInputStream()));
        String inputLine;
        while ((inputLine = br.readLine()) != null) 
            System.out.println(inputLine);
        br.close();
    }

}