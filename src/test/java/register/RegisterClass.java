package register;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.management.relation.Role;
import java.time.Duration;

public class RegisterClass {
    static WebDriver driver;

    @Test
    public void testesFormularioSelenium() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jorge");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Cezar");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Av.Henriqueta Mendes Guerra ,1330");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jorgeaugustokeyboards@gmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("11940003016");

        //selecionando o combobox
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        //verificar se realmente esse combobox foi selecionado ,caso queira verificar mais ainda colocar assertFalse e o teste precisa quebrar
        //Ex: Assert.assertFalse("Esperava True e retornou false"driver.findElement(By.xpath("//input[@type='radio']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='radio']")).isSelected());

        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected());

        Select select = new Select(driver.findElement(By.id("Skills")));
        select.selectByVisibleText("Java");

        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");

        driver.findElement(By.xpath("//select[@id='yearbox']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'1983')]")).click();
        driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'November')]")).click();
        driver.findElement(By.xpath("//select[@id='daybox']")).click();
        driver.findElement(By.xpath("//option[@value='28']")).click();
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456");

    }

    @AfterClass
    public static void after(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.quit();
    }
}

