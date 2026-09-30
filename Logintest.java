// TestHouseOfEM5.java
package Testpkg;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Login;
import basepkg.Loginpage;
import basepkg.baseclass;

public class Logintest extends baseclass {

    @Test
    public void testHouseOfEM5Flow() throws IOException {
        driver.get("https://www.houseofem5.com");

        // Verify title
        String expectedTitle = "Best Body Perfume Brand for Men and Women Online in India – Houseof EM5";
        Assert.assertEquals(driver.getTitle(), expectedTitle);

        // Login
        Login home = new Login(driver);
        home.clickLoginIcon();
        Loginpage login = new Loginpage(driver);
        login.login("Demouserbot07@gmail.com", "123123");

        // Verify login URL
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.houseofem5.com/account");

        // Collections
        home.hoverCollectionsAndClickFirst();

        
        Select sortDropdown = new Select(driver.findElement(By.id("SortBy")));
        sortDropdown.selectByIndex(2); // third option (index starts at 0)

        home.hoverNewArrivalsAndAddFirstProduct();

        driver.navigate().back();
        home.clickYearlySubscription();

 
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(screenshot.toPath(), new File("project-folder/cart.png").toPath());
    }
}



