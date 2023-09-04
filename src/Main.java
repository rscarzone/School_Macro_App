import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main
{
    public static void main(String[] args)
    {

        // Creates an array of Strings where each String is a URL of a website you want to open.
        String[] websites = {
                "https://csuglobal.instructure.com/",
                "https://www.udemy.com/",
                "https://chat.openai.com/"
        };

        //This for-each loop iterates through each website URL stored in the websites array.
        for (String website : websites) {
            try {
                Desktop.getDesktop().browse(new URI(website));
                Thread.sleep(1000);
            } catch (IOException | URISyntaxException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        

    }
}