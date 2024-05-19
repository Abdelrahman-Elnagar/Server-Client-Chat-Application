import java.io.*;
import java.net.*;

class TCPClient {
    public static void main(String argv[]) throws Exception {
        String sentence;
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter CONNECT to open a socket connection: ");
        sentence = inFromUser.readLine();
        while(true) {
        if (sentence.equals("CONNECT")) {
        	System.out.println("You are connected");
            Socket clientSocket = new Socket("localhost", 7016);
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            Thread receiveThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = inFromServer.readLine()) != null) {
                        System.out.println("FROM SERVER: " + serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receiveThread.start();
            while (true) {
            	if(inFromUser!=null) {
                    sentence = inFromUser.readLine();
                    outToServer.writeBytes(sentence + '\n');
                	}
            	//modifiedSentence = inFromServer.readLine();
                //System.out.println("FROM SERVER: " + modifiedSentence);            
            }
        } else {
            System.out.println("Please enter \"CONNECT\" to connect.");
            sentence = inFromUser.readLine();
        }
    }
}
}