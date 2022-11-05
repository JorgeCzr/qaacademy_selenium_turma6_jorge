package aulasOnline;

import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class ExerciciosAlertas {
    static WebDriver driver;

    @Before
    public void iniciaTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");


    }

    @Test
    public void testesAlertasSimples() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
        Alert alert = driver.switchTo().alert();
        String mensagemAlerta = alert.getText();
        String mensagemEsperada = "I am an alert box!";
        Thread.sleep(2000);
        alert.accept();
        Assert.assertEquals("Resultado Diferente do Experado", mensagemEsperada, mensagemAlerta);


    }

    @Test
    public void testesAlertasComOkCancela() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
        Alert alert = driver.switchTo().alert();
        String mensagemAlerta = alert.getText();
        String mensagemEsperada = "Press a Button !";
        Thread.sleep(2000);
        alert.dismiss();
        Assert.assertEquals("Resultado Diferente do Experado", mensagemEsperada, mensagemAlerta);


    }

    @Test
    public void testesAlertasComPrompt() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Teste Jorge Augusto");
        Thread.sleep(2000);
        alert.accept();




}
    @After
    public void after(){
        driver.quit();
    }
}
