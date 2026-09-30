package basepkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
 private WebDriver driver;
 private By loginIcon = By.xpath("//*[@id=\"velaHeader\"]/section/div[2]/div/div/div[4]/div[3]/ul/li[1]/a");
 private By collectionsMenu = By.xpath("//*[@id=\"velaMegamenu\"]/nav/ul/li[1]/a[1]/span");
 private By newArrivalsMenu = By.xpath("//*[@id=\"GNIp_g0Z0O/themes/prestige/main__0__liquid-bf2e0b21-41ae-fbcf-7af1-b221bf473fef\"]/div/div[2]/div/div[2]/div/div/div[1]/div/button");
 private By yearlySubscription = By.linkText("Yearly Sample Subscription");

 public Login(WebDriver driver) {
     this.driver = driver;
 }

 public void clickLoginIcon() {
     driver.findElement(loginIcon).click();
 }

 public void hoverCollectionsAndClickFirst() {
     Actions actions = new Actions(driver);
     actions.moveToElement(driver.findElement(collectionsMenu)).perform();
     driver.findElement(By.cssSelector(".site-nav__dropdown li:first-child a")).click();
 }

 public void hoverNewArrivalsAndAddFirstProduct() {
     Actions actions = new Actions(driver);
     actions.moveToElement(driver.findElement(newArrivalsMenu)).perform();
     driver.findElement(By.cssSelector(".grid-product__content:first-child button")).click();
 }

 public void clickYearlySubscription() {
     driver.findElement(yearlySubscription).click();
     driver.findElement(By.cssSelector("button.product-form__cart-submit")).click();
 }
}

	   
