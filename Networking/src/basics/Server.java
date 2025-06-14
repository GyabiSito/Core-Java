package basics;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("Waiting for connection...");
            Socket socket = serverSocket.accept();
            System.out.println("Connection Established");
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String data=dataInputStream.readUTF();
            System.out.println("Data received: "+data);
            dataInputStream.close();
            serverSocket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
