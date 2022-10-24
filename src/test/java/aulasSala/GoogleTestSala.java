package aulasSala;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTestSala {

    WebDriver driver;

    @Test
    public void testgoogle() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com.br/");
        driver.findElement(By.name("q")).sendKeys("Corinthians");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span")).click();
        String texto = driver.findElement(By.xpath("//*[@class='srp']")).getText();
        Assert.assertEquals("Resultado Diferente do Esperado", "Sport Club Corinthians Paulista", "Sport Club Corinthians Paulista");

    }
    @After
    public void fecharBrowser(){
        driver.quit();
    }


}
