import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("httttttttps://www.google.com/imagessection-");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
        } catch(MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
        

}
