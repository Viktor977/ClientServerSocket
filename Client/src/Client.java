import Helper.Phone;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        try (Phone phone = new Phone("127.0.0.1", 8000);

        ) {
            System.out.println("Client connected");
            String request = "Vinnitsa";
            System.out.println("request : " + request);

            phone.writeLine(request);
            String response = phone.readLine();
            System.out.println("Response : " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
