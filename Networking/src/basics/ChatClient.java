package basics;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 9090);
             DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
             DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            String messageReceved = "";
            String messageSent = "";
            while (true) {
                messageSent = bufferedReader.readLine();
                dataOutputStream.writeUTF(messageSent);
                dataOutputStream.flush();
                if ("exit".equals(messageSent)) {
                    break;
                }
                messageReceved = dataInputStream.readUTF();
                System.out.println("Server says : " + " " + messageReceved);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
