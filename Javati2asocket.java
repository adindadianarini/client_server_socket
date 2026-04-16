import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Javati2asocket {
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(12346);
            System.out.println("Menunggu koneksi...");
            System.out.println("Adinda Dian Arini/243107040002 dan Afif Athallah/243107040051");
            Socket server = s.accept();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(server.getInputStream())
            );
            String pesan = in.readLine();
            System.out.println("pesan = " + pesan);
            server.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
