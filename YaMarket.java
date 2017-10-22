import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import net.thucydides.core.annotations.Steps;
import steps.BaseSteps;
import steps.MainSteps;

import java.util.concurrent.TimeUnit;

/**
 * Created by Натали on 22.10.2017.
 */
@RunWith(SerenityRunner.class)
public class YaMarket{

    @Steps
    MainSteps mainSteps;

    @Test
    public void main() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Натали/IdeaProjects/YandexMarket/.idea/drr/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://market.yandex.ru/");
       //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
        public void Test() {
            try {
                mainSteps.selectSearchRegion("Москва");
                mainSteps.selectYesButton();


            } catch (WebDriverException e) {
                e.printStackTrace();

            }
        }



    }




