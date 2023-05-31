package HomeWorkN4;

import Utils.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TaskN2 extends commonMethods {
    // click on create account
    //and select  your  date of birth using select class
    public static void main(String[] args) throws InterruptedException {
        String url="http://www.facebook.com";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement createNewAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000);
        WebElement firstN= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstN.sendKeys("Veronica");
        WebElement lastN= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastN.sendKeys("Burlacu");
        WebElement email= driver.findElement(By.xpath("//input[@placeholder aria-label='Mobile number or email"));
        email.sendKeys("Veronica368@yahoo.com");
        WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select sel=new Select(month);
        sel.selectByValue("3");
        Thread.sleep(2000);
        WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select day1=new Select(day);
        day1.selectByVisibleText("25");
        WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
        Select year1=new Select(year);
        year1.selectByValue("1990");
        WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
        gender.click();



    }
}
