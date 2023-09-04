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

        // Here, System.getProperty("os.name") fetches the name of the operating system as a String.
        // toLowerCase() then converts this String to all lowercase so that the subsequent comparisons
        // are case-insensitive.
        String os = System.getProperty("os.name").toLowerCase();

        // If the operating system name contains "win" (indicating it's some version of Windows)
        if (os.contains("win")){
            try {
                new ProcessBuilder("cmd", "/c", "start", "\"\"", "\"C:\\Program Files\\Git\\" +
                        "git-bash.exe\"").start();
                new ProcessBuilder("cmd", "/c", "start", "\"\"", "\"C:\\Program Files\\JetBrains\\" +
                        "IntelliJ IDEA 2023.2\\bin\\idea64.exe\"").start();
            } catch (IOException e){
                e.printStackTrace();
            }
        }





    }
}