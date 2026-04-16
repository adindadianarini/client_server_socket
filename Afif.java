import java.net.Socket;
import java.io.PrintWriter;

public class Afif {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("10.8.0.34", 12345);
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            out.write("Oi Afif");
            out.flush();
            s.close();
            System.out.println("Pesan terkirim!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}