import java.awt.Desktop;
import java.net.URI;

public class MyFirstAttempt {
    public static void main(String args[]){
        System.out.println("testing something");
        System.out.println("should we printing something else ???s");

        System.out.println("hello world");
        try
        {
            Desktop desk = Desktop.getDesktop();
            // now we enter our URL that we want to open in our
            // default browser
            desk.browse(new URI("http://google.com"));
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

    }
}
