package features;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class IndexPage {

    private static final WebDriver driver;

    static {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/lib/chromedriver");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @When("^Я открываею главную страницу \"([^\"]*)\"$")
    public void яОткрываеюГлавнуюСтраницу(String url) {
        driver.get(url);
    }

    @Then("^Я вижу страницу с заголовком \"([^\"]*)\"$")
    public void яВижуСтраницуСЗаголовком(String title) {
        assertEquals(title, driver.getTitle());
    }
}
