package HomeWorkN4;

import Utils.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class taskN1 extends commonMethods {
    public static void main(String[] args) throws InterruptedException {
        //select , tuesday, thursday and friday one by one

        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
WebElement sele=driver.findElement(By.xpath("//select[@id='select-demo']"));
//created the obj of the class
Select sel=new Select(sele);

sel.selectByValue("Tuesday");

Thread.sleep(2000);
sel.selectByVisibleText("Thursday");

Thread.sleep(2000);
sel.selectByIndex(6);

    }
}
