import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress shiyanlou = InetAddress.getByName("www.shiyanlou.com");
            System.out.println(shiyanlou.toString());
            String ip = shiyanlou.toString().split("/")[1];
            InetAddress byAddress = InetAddress.getByName(ip);

            System.out.println("get hostname by IP address:" + byAddress.getHostName());
            System.out.println("localhost: "+InetAddress.getLocalHost());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}