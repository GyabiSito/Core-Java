package basics;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9090);
             Socket socket = serverSocket.accept();
             DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
             DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String messageReceved = "";
            String messageSent = "";
            while (true) {
                messageReceved = dataInputStream.readUTF();
                System.out.println("Client says   " + messageReceved);
                if ("exit".equals(messageSent)) {
                    break;
                }
                messageSent = bufferedReader.readLine();
                dataOutputStream.writeUTF(messageSent);
                dataOutputStream.flush();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
