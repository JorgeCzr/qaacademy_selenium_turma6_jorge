package aulasOnline;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class ExerciciosSeleniumOnline {
    static WebDriver driver;

    @Test
    public void testesFormularioSelenium() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(1000);
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

//        Select optionSkills = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a")));
//        optionSkills.selectByVisibleText("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a");



    }

    @AfterClass
    public static void after() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
