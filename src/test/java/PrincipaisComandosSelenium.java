import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrincipaisComandosSelenium {

    @Test
    public void testeSeleniumClick() {

        WebDriver driver = new ChromeDriver(); // abrir o browser
        driver.get("https://www.qaacademy.com.br/"); // abrir o browser
        driver.findElement(By.xpath("//p[@id='comp-k7g9c7sd2label']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Assinar agora')]")).click();

    }

    @Test
    public void enviarTextosParaTela(){

        WebDriver driver = new ChromeDriver(); // abrir o browser
        driver.get("https://www.qaacademy.com.br/"); // abrir o browser
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdip8']")).sendKeys("Jorge Augusto Moreira Cezar");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jorgeaugustokeyboards@gmail.com");
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdipq']")).sendKeys("11940003016");
        driver.findElement(By.xpath("//input[@name='endereço']")).sendKeys("Av. Henriqueta Mendes Guerra , 1330");
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdiqy']")).sendKeys("Teste Automação Selenium");
        driver.findElement(By.xpath("//textarea[@id='textarea_comp-k37gdirc']")).sendKeys("Please disregard this email as it is just a Selenium automation test");
//        driver.findElement(By.xpath("//span[contains(text(),'Enviar')]")).click();




    }
}

