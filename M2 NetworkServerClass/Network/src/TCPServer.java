import java.io.*;
import java.net.*;

class TCPServer {
    public static void main(String argv[]) throws Exception {
        String clientSentence;
        ServerSocket welcomeSocket = new ServerSocket(7016);
        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            Thread clientThread = new Thread(() -> {
                try {
                    while (true) {
                        String message = inFromUser.readLine();
                        //System.out.println("FROM CLIENT: " + message);
                        outToClient.writeBytes(message + '\n');
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            clientThread.start();
            while (true) {
                clientSentence = inFromClient.readLine();
                System.out.println("FROM CLIENT: " + clientSentence);
                if(inFromUser!=null) {
                //ServerSentence = inFromUser.readLine();
                //outToClient.writeBytes(ServerSentence + '\n');   
            }
        }
    }
}
}