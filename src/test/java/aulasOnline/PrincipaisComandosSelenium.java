package aulasOnline;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrincipaisComandosSelenium {

    @Test
    public void testeSeleniumClick() {

        WebDriver driver = new ChromeDriver(); // abrir o browser
        driver.get("https://www.qaacademy.com.br/"); // abrir o browser
        driver.findElement(By.xpath("//li[@id='dataItem-k3hb7c5j-comp-k0wqferu']")).click();

    }

    @Test
    public void enviarTextosParaTela() {

        WebDriver driver = new ChromeDriver(); // abrir o browser
        driver.manage().window().maximize();
        driver.get("https://www.qaacademy.com.br/"); // abrir o browser
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdip8']")).sendKeys("Jorge Augusto Moreira Cezar");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jorgeaugustokeyboards@gmail.com");
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdipq']")).sendKeys("11940003016");
        driver.findElement(By.xpath("//input[@name='endereço']")).sendKeys("Av. Henriqueta Mendes Guerra , 1330");
        driver.findElement(By.xpath("//input[@id='input_comp-k37gdiqy']")).sendKeys("Teste Automação Selenium");
        driver.findElement(By.xpath("//textarea[@id='textarea_comp-k37gdirc']")).sendKeys("Please disregard this email as it is just a Selenium automation test");
        driver.findElement(By.xpath("//span[contains(text(),'Enviar')]")).click();
        driver.quit();

    }

    @Test
    public void testeSeleniumClickLove() throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // abrir o browser
        driver.get("https://www.qaacademy.com.br/"); // abrir o browser
        driver.findElement(By.xpath("//p[@id='comp-k7g9c7sd4label']")).click();
        driver.findElement(By.xpath("//li[@id='dataItem-khhsg603-comp-k0wqferu']")).click();
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void testgoogle() throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.google.com.br/");
        driver.findElement(By.name("q")).sendKeys("Corinthians");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span")).click();
        String texto = driver.findElement(By.xpath("//*[@class='srp']")).getText();
       Assert.assertEquals("Resultado Diferente do Esperado","Sport Club Corinthians Paulista","Sport Club Corinthians Paulista");
       driver.quit();


    }



}

