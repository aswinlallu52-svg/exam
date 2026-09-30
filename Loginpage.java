
package basepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    private WebDriver driver;
    private By emailField = By.xpath("//*[@id=\"CustomerEmail\"]");
    private By passwordField = By.xpath("//*[@id=\"CustomerPassword\"]");
    private By loginButton = By.xpath("//*[@id=\"customer_login\"]/div/div[3]/input");

    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
