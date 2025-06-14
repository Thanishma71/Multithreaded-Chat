import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Chatclient {
    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;
    private BufferedReader consoleInput;

    public Chatclient(String serverAddress, int port) {
        try {
            socket = new Socket(serverAddress, port);
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
            consoleInput = new BufferedReader(new InputStreamReader(System.in));

            new Thread(new ReceiveMessages()).start();
            System.out.println("Connected to the chat server.");

            String userInput;
            while ((userInput = consoleInput.readLine()) != null) {
                output.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ReceiveMessages implements Runnable {
        public void run() {
            String message;
            try {
                while ((message = input.readLine()) != null) {
                    System.out.println("Server: " + message);
                }
            } catch (IOException e) {
                System.out.println("Connection closed.");
            }
        }
    }

    public static void main(String[] args) {
        new Chatclient("localhost", 1234);
    }
}
