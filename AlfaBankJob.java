
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Натали on 03.11.2017.
 */
public class AlfaBankJob {
    @Test
    public void main() {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Натали/IdeaProjects/YandexMarket/.idea/drr/chromedriver.exe");

    /*    ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");*/
        WebDriver driver = new ChromeDriver();

        //*   driver.manage().window().maximize();
        driver.get("https://yandex.ru/");
        // https://alfabank.ru/#business
        // driverc.get("http://job.alfabank.ru/moskva/about/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



       WebElement search = driver.findElement(By.xpath("//div/../input[@id='text']"));
            search.sendKeys("Альфа-Банк");
            search.submit();

            WebElement alfaBank =driver.findElement(By.xpath("//div/a[@href='https://AlfaBank.ru/']"));
        alfaBank.click();
        /*try {
            Thread.sleep(7000);
       WebElement alfaBusines = driver.findElement(By.xpath("//span[@id='top_nav_type_business']"));
        alfaBusines.click();*/

//body[@id='home_page']/div/div[6]/div/div/div/div[3]/ul/li[3]/a


//body/div/div/div/div/div/div/ul/li/a[@href='http://job.alfabank.ru/']


            WebElement jobAlfaBank = driver.findElement(By.xpath("//body/div/div/div/div/div/div/ul/li/a[@href='http://job.alfabank.ru/']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", jobAlfaBank);
            jobAlfaBank.click();


            WebElement aboutJob = driver.findElement(By.xpath("//span/a[contains(@href,'/about/')]"));
            aboutJob.click();


            WebElement title = driver.findElement(By.xpath("//div[contains(text(),'Альфа-Банк для сотрудников!')]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", title);
            title.getText();
            String ttl = title.getText();


            WebElement text = driver.findElement(By.xpath("//div[@class ='info']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", text);
            text.getText();
            String txt = text.getText();

        AlfaBankMethods alf= new AlfaBankMethods();

// пишем в файл с помощью FileWriter
            alf.writeUsingFileWriter(ttl,txt);

    }



       }


