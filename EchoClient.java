import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        String hostname = "127.0.0.1";
        int port = 1080;
        Scanner userIn = new Scanner(System.in);

        try {
            Socket socket = new Socket(hostname, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            //获取输入流
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String userInput;
            System.out.println("请输入信息：");
            while (!"exit".equals(userInput = userIn.nextLine())) {
                out.println(userInput);
                System.out.println("收到服务端回应:" + in.readLine());
            }
            //关闭socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}