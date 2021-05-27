package Tests;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleTest {

    private static WebDriver driver;


    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);


    }

    @Test
    public void test1() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        WebElement elementa=driver.findElement(By.xpath(".//div[text()='(']")); elementa.click();
        WebElement elementb=driver.findElement(By.xpath(".//div[text()='1']")); elementb.click();
        WebElement elementc=driver.findElement(By.xpath(".//div[text()='+']")); elementc.click();
        WebElement elementd=driver.findElement(By.xpath(".//div[text()='2']")); elementd.click();
        WebElement elemente=driver.findElement(By.xpath(".//div[text()=')']")); elemente.click();
        WebElement elementf=driver.findElement(By.xpath(".//div[text()='×']")); elementf.click();
        WebElement elementg=driver.findElement(By.xpath(".//div[text()='3']")); elementg.click();
        WebElement elementh=driver.findElement(By.xpath(".//div[text()='−']")); elementh.click();
        WebElement elementj=driver.findElement(By.xpath(".//div[text()='4']")); elementj.click();
        WebElement elementk=driver.findElement(By.xpath(".//div[text()='0']")); elementk.click();
        WebElement elementl=driver.findElement(By.xpath(".//div[text()='÷']")); elementl.click();
        WebElement elementm=driver.findElement(By.xpath(".//div[text()='5']")); elementm.click();
        WebElement elementn=driver.findElement(By.xpath(".//div[text()='=']")); elementn.click();
        WebDriverWait wait= new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.z7BZJb.XSNERd")));


    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
