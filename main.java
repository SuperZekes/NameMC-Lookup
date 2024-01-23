import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class PlayerSearch {

  public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the username of the Minecraft Java player you want to search for: ");
    String username = scanner.nextLine();
    
    String url = "https://namemc.com/profile/" + username;
    
    Desktop desktop = Desktop.getDesktop();
    desktop.browse(new URI(url));

  }

}
