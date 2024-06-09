package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class amazon {
    public static void main(String[] args) {

        /*
        1 ChromeDriver'ın yerini belirtiyoruz ve WebDriver'ı başlatıyoruz.
        2 Amozon web sitesine gidiyoruz.
        3 Arama kutusunu buluyoruz ve içine "laptop" kelimesi yazıyoruz.
        4 Arama butonunu buluyoruz ve tıklıyoruz.
        5 İlk ürünün adını ve fiyatını alıyoruz.
        6 Assertion 1: Arama kutusunun doğru bir şekilde bulunduğunu kontrol ediyoruz.
        7 Assertion 2: Arama butonunun doğru bir şekilde bulunduğunu kontrol ediyoruz
        8 Assertion 3: Ürün adının boş olmadığını kontrol ediyoruz.
        9 Assertion 4: Ürün fiyatının boş olmadığını kontrol ediyoruz.
        10 Ürün adını ve fiyatını konsola yazdırıyoruz.
        11 WebDriver'ı kapatıyoruz.
         */


        //ChromeDriver'ın yerini belirtiyoruz ve WebDriver'ı başlatıyoruz.
        WebDriver driver = new ChromeDriver();

        //Tarayıcı tam ekran yapma
        //driver.manage().window().fullscreen();

        //Amozon web sitesine gidiyoruz.
        driver.get("https://www.amazon.com.tr/");

        WebElement acceptCookiesButton = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));

        //Arama kutusunu buluyoruz ve içine "laptop" kelimesi yazıyoruz.
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("labtop");

        //Çerezleri kabul et butonunu kabul ediyoruz.
        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).sendKeys(Keys.ENTER);

        //Arama butonunu buluyoruz ve tıklıyoruz.
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).sendKeys(Keys.ENTER);
        //driver.findElement(By.id("nav-search-submit-button")).click();

        //İlk ürünün adını ve fiyatını alıyoruz.
        WebElement ilkUrün= driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        String  urunTitle= ilkUrün.getText();
        System.out.println("urunTitle = " + urunTitle);
        //fiyat
        WebElement fiyat= driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        String urunFiyat= fiyat.getText();
        System.out.println("urunFiyat = " + urunFiyat);

        //String productName = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
        //String productPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();

        // Explicit wait kullanarak tıklanabilir olmasını bekle
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //Çerezleri kabul et butonunu kabul ediyoruz.
        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).sendKeys(Keys.ENTER);

        //Assertion 1: Arama kutusunun doğru bir şekilde bulunduğunu kontrol ediyoruz.
        //WebElement urun= driver.findElement(By.cssSelector("a-button-text"));
        WebElement urun= driver.findElement(By.xpath("//span[@class='a-button-text']"));
        urun.click();

        //Assertion 2: Arama butonunun doğru bir şekilde bulunduğunu kontrol ediyoruz
        WebElement card= driver.findElement(By.cssSelector("submit.add-to-cart-announce"));
        card.click();


        //Assertion 3: Ürün adının boş olmadığını kontrol ediyoruz.
        WebElement title= driver.findElement(By.xpath("//h1"));

        //Assertion 4: Ürün fiyatının boş olmadığını kontrol ediyoruz.
        String expectedTitleText= "Shopping Card";
        Assert.assertTrue(title.getText().contains("expectedTitleText"));

        //WebDriver'ı kapatıyoruz.
        driver.quit();


    }


}
