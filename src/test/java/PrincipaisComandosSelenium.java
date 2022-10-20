import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrincipaisComandosSelenium {

    @Test
   public void testeSeleniumClick(){

        WebDriver driver = new ChromeDriver(); // abrir o browser
        driver.get("https://www.qaacademy.com.br/");
        driver.findElement(By.xpath("//p[@id='comp-k7g9c7sd4label']")).click();




   }
}
