import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTest {

    public static void main(String[] args) {
        WebDriver auto = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--whitelisted-ips=\"\"");

        System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\admin\\Downloads\\chrome-win64\"");


        auto.get("https://www.google.com/");

    }

}
