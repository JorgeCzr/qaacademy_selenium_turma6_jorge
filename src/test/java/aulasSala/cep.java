package aulasSala;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.spi.SelectorProvider;
import java.time.Duration;

public class cep {
    WebDriver driver;

    @Test
    public void testeCep2() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
        driver.findElement(By.id("endereco")).sendKeys("06401160");
        Select select = new Select(driver.findElement(By.id("tipoCEP")));
        select.selectByVisibleText("Localidade/Logradouro");
        driver.findElement(By.xpath("//button[@id='btn_pesquisar']")).click();
        String resulCep = driver.findElement(By.xpath("//td[contains(text(),'Avenida Henriqueta Mendes Guerra - até 416 - lado ')]")).getText();
        Assert.assertEquals("Teste em desacordo", "Avenida Henriqueta Mendes Guerra - até 416 - lado par", resulCep);

    }

    @Test
    public void testCep() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
        driver.findElement(By.id("endereco")).sendKeys("06721507");
        Select select = new Select(driver.findElement(By.id("tipoCEP")));
        select.selectByVisibleText("Localidade/Logradouro");
        driver.findElement(By.id("btn_pesquisar")).click();
        String retorno = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]")).getText();
        Assert.assertEquals("Valor invalido", "Rua Mário Andreatini", retorno);
    }

    @After
    public void fechar() {
        driver.quit();

    }
}


